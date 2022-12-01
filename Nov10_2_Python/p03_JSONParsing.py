# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from json import loads

# 42008a8c8e7402a3fc9d3b1a7df8fee9


# https://api.openweathermap.org
# /data/2.5/weather?q={city name}&appid={42008a8c8e7402a3fc9d3b1a7df8fee9}

# 도시 이름 : 입력 (영어)
# 응답 내용 출력까지
# 요청파라미터 추가 O

where = input("도시 이름 : ")
hc = HTTPSConnection("api.openweathermap.org")
u = "/data/2.5/weather?q=%s&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr"
hc.request("GET",u)
resBody = hc.getresponse().read()

#print(resBody.decode()) # 여기까지가 http통신

weatherData = loads(resBody) #JS -> Python
#print(weatherData)

# 날씨 / 기온 / 체감기온 / 습도 / 바람속도
# 데이터를 콘솔창에 출력
# Dict / list 잘 확인하면서

# dict : {"key" : "value"}
# list : 인덱스 값으로...
l = [1, 2, 3]                         # python : list / JS :  array
d = {"name" : "홍길동", "age" : 30}    #python : dict / JS : object
####################################################################
# 단 하나의 데이터 o -> 반복문이 필요 없음 !
print(weatherData["weather"][0]["description"])
print(weatherData["main"]["temp"])
print(weatherData["main"]["feels_like"])
print(weatherData["main"]["humidity"])
print(weatherData["wind"]["speed"])






