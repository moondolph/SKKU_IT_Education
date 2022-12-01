# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads

# 4f626857416f6c6c3632586a416843

# 2017 ~ 2021년 5년치 데이터를...
# 연,월,일,노선 번호, 승강장명, 승차 총 승객수, 하차 총 승객수
# 연도별로 csv 파일에 저장

# 정류장명(역명) => 혹시 ,가 들어있을 수도 있으니 
#    => ,를 .로 바꿔서 저장

# 인원수 관련 => 정수형태로 저장 

#http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/CardBusStatisticsServiceNew/1/5/20151101/ 

con = HTTPConnection("openapi.seoul.go.kr:8088")

y = 2017
f = open(f"C:\\Users\\seems\\Documents\\test\\busData{y}.csv","a",encoding="UTF-8") 

for m in range(1, 13):      #월 : 1 ~ 12
    for d in range(1, 32):  #일 : 1 ~ 31
        for start in range(1,39000,1000): # 한 페이지에 보여지는 데이터의 수
            url = "/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/"
            url += f"{start}/{start + 999}/{y}{m:02d}{d:02d}/"
            # print(url)
            con.request("GET", url)
            resBody = con.getresponse().read()
            busData = loads(resBody)
            
            if "CardBusStatisticsServiceNew" in busData:
                for b in busData["CardBusStatisticsServiceNew"]["row"]:
                    f.write(f"{y},{m},{d},")
                    f.write(f"{b['BUS_ROUTE_NO'].replace(',', '.')},")
                    f.write(f"{b['BUS_STA_NM'].replace(',', '.')},")
                    f.write(f"{b['RIDE_PASGR_NUM']:.0f},")
                    f.write(f"{b['ALIGHT_PASGR_NUM']:.0f}\n")
                    
               
                

f.close()
con.close()






