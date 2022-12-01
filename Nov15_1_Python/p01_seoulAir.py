# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads
from cx_Oracle import connect

# http://openAPI.seoul.go.kr:8088
# /4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 요청해서 -> 콘솔에 내용 출력
hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")

resBody = hc.getresponse().read()
# print(resBody.decode())
#############################################################

# 데이터들 가지고 parsing
airData = loads(resBody)

# DB연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")
cur = con.cursor()

# 구 이름, 미세먼지, 초미세먼지의 정보를 DB에 담아주세요!
for a in airData["RealtimeCityAir"]["row"]:
    # print(a["MSRSTE_NM"], type(a["PM10"]), a["PM25"])
    sql = f"insert into seoul_airs values(seoul_airs_seq.nextval, "
    sql += f"'{a['MSRSTE_NM']}', '{a['PM10']}', '{a['PM25']}')"
    cur.execute(sql)
    
con.commit()

# DB연결종료
con.close()
print("Success !")


