# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm



# 또상청 데이터
#     -> 각 시간별 기온과 습도를 선 그래프로 표현 

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4215061500

hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=4215061500")
resBody = hc.getresponse().read()

#print(resBody.decode())

hours = []
temps = []
rehs = []

for w in fromstring(resBody).iter("data"):
    hours.append(w.find("hour").text)
    temps.append(float(w.find("temp").text))
    rehs.append(float(("reh").text))
 
# print(hours)   
# print(temps)   
# print(rehs)   

indexes = range(len(hours))


#########################################################
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font",family=fontName)

x1 = plt.subplot()
p1 = x1.plot(indexes, temps, 'r-o')

x1.set_xlabel("시간")
x1.set_ylabel("기온")

x2 = x1.twinx()
p2 = x2.plot(indexes,rehs,'b:^')
x2.set_ylabel("습도")

plt.title("날씨", loc="center")
x1.legend(p1 + p2, ["기온", "습도"])

plt.xticks(indexes, hours)

plt.show()
























