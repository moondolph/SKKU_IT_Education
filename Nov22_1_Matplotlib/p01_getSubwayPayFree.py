# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring

# http://openapi.seoul.go.kr:8088/(인증키)/xml/CardSubwayPayFree/1/5/201501/
# 4f626857416f6c6c3632586a416843


# 2015 ~ 2021년 월별로 > 하나의 파일(csv)에 저장
# 연월(ex:202211), 호선명, 지하철역, 유임승차인원, 무임승차인원, 유임하차인원, 무임하차인원

with open("C:/Users/seems/Documents/test/subwayPayFree.csv", "a", encoding="UTF-8") as f:
    hc = HTTPConnection("openapi.seoul.go.kr:8088")
    for y in range(2015, 2022):
        for m in range(1, 13):
            when = "%d%02d" % (y, m)
            hc.request("GET", "/4f626857416f6c6c3632586a416843/xml/CardSubwayPayFree/1/5/201501/")
            resBody=hc.getresponse().read()
            for c in fromstring(resBody).iter("row"):
                f.write(when + ",")
                f.write(c.find("LINE_NUM").text + ",")
                f.write(c.find("SUB_STA_NM").text + ",")
                f.write(c.find("PAY_RIDE_NUM").text + ",")
                f.write(c.find("FREE_RIDE_NUM").text + ",")
                f.write(c.find("PAY_ALIGHT_NUM").text + ",")
                f.write(c.find("FREE_ALIGHT_NUM").text + ",")
print('완료!')


