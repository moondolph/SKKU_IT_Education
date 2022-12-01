# -*- coding:utf-8 -*-
from http.client import HTTPConnection, HTTPSConnection
from cx_Oracle import connect, Cursor
from xml.etree.ElementTree import fromstring

# 기상청 (주소값 구해서)

# 기상청 xml -> DB에 적재
# 시간대 / 기온 / 최고기온 / 최저기온 

# http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108

# http 통신
hc = HTTPSConnection("www.kma.go.kr")
hc.request("GET","/wid/queryDFSRSS.jsp?zone=1168066000")
resBody = hc.getresponse().read()
# print(resBody.decode())

con = connect("jaden/0508@192.168.35.113:1521/jaden")
cur = con.cursor()

for w in fromstring(resBody).iter("data"):
   # print(type(w.find("temp").text))
   sql = "insert into nov14_weather values(nov14_weather_seq.nextval, '%s', '%s', '%s', '%s')" %(w.find("hour").text,w.find("temp").text,w.find("tmx").text,w.find("tmn").text)
   cur.execute(sql)
   con.commit()
con.close()
print("END!")