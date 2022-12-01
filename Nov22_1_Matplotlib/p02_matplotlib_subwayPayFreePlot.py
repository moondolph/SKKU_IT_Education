# -*- coding:utf-8 -*-

# 방금 만든 csv파일 불러와서
#   -> 연월에 맞춰서 -> 유임승차인원, 무임승차인원, 유임하차인원, 무임하차인원
#   -> 선 그래프 그리기 !

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

when, prn, frn, pan, fan = None, None, None, None, None
prnDict, frnDict, panDict, fanDict = {},{},{},{}

with open("C:/Users/seems/Documents/test/subwayPayFree.csv", "r", encoding="UTF-8") as f:
    for line in f.readlines():
        # print(line)
        line = line.replace("\n", "").split(",")
        # print(line)
        when = line[0]
        prn = int(line[3]); frn = int(line[4]); pan = int(line[5]); fan = int(line[6])
        
        if when in prnDict:
            prnDict[when] += prn
            frnDict[when] += frn
            panDict[when] += pan
            fanDict[when] += fan
        else:
            prnDict[when] += prn
            frnDict[when] += frn
            panDict[when] += pan
            fanDict[when] += fan
print(when)
print(prnDict)
print(frnDict)
print(panDict)
print(fanDict)
        
whens, prns, frns, pans, fans = [], [], [], [], []
for k, v in prnDict.items():
    whens.append(k)
    prns.append(v)
    frns.append(frnDict[k]) # key에 해당하는 value값
    pans.append(panDict[k])
    fans.append(fanDict[k])
print("-----------------")
print(whens)
print(prns)
print(frns)
print(pans)
print(fans)

plt.plot(whens,prns,color="#EF9A9A")
plt.plot(whens,frns,color="yellow")
plt.plot(whens,pans,color="#90CAF9")
plt.plot(whens,fans,color="black")
plt.legend(["유임승차","무임승차","유임하차","무임하차"])
plt.title("월별 지하철 유,무임 승차 정보")
plt.show()









        
        
        
            
        
        
        
        
         
        
        
        
        


