# -*- coding:utf-8 -*-
from urllib.parse import quote
from http.client import HTTPSConnection
from json import loads
from cx_Oracle import connect

# 1332ff234b2b658c1ef873fe08e0b86f
# 


# 검색어를 입력
#    -> 위도/경도 지정 37.496609 / 127.026902
#    -> 반경 1km내에 있는 
#    -> 검색어에 대한 위치 정보

#    -> 장소명(업체명), 전화번호, 위도, 경도
#    -> DB에 저장
#    -> 전화번호 : 없는 부분은 ' - ' 으로 대체
#    -> 위도, 경도 : 소수점 6자리까지

search = quote(input("검색어 : "))
#print(search)

hc = HTTPSConnection("dapi.kakao.com")
url = f"/v2/local/search/keyword.json?query={search}&x=37.496609&y=127.026902&radius=1000"

h = {"Authorization" : "KakaoAK 1332ff234b2b658c1ef873fe08e0b86f"}

hc.request("GET", url, headers=h)

resBody = hc.getresponse().read()
# print(resBody.decode())

##########################################
# DB-> insert
con = connect("jaden/0508@192.168.0.15:1521/jaden")
cur=con.cursor()
location = loads(resBody)

for l in location["documents"]:
    sql = "insert into search_location values("
    sql += "search_location_seq.nextval, "
    sql += f"'{l['place_name']}', "
    sql += f"nvl('{l['phone']}', '-'), "
    sql += f"{float(l['x']):.6f}, "
    sql += f"{float(l['y']):.6f})"
    cur.execute(sql)
print("성공")    
    # print(l["place_name"])
    # print(l["phone"])
    # print(l[f"{float(l['x']):.6f}"])
    # print(l[f"{float(l['y']):.6f}"])
    # print("-------------------")

con.close()
hc.close()

