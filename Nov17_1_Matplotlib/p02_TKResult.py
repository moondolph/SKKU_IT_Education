# -*- coding:utf-8 -*-

# Python의 시각화를 위한 Library - matplotlib
# cmd -> pip install matplotlib

import matplotlib.font_manager as fm 
import matplotlib.pyplot as plt
from pickle import TRUE

name = []
count = []
with open("C:/Users/seems/Downloads/ThreeKingdom/TK.csv","r",encoding="UTF-8") as f:
    for line in f.readlines():
        line=dict(line)
        print(line,type(line))
        print(line)
        name=line.keys()
        count=line.values()

#print(name, count)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile,size=50).get_name()
plt.rc("font", family=fontName)


# 막대그래프 - 절대적인 값 비교 : bar
c = ['yellow', '#b2ccff', '#ffa7a7']
'''
plt.bar(name, count, width=0.4, color=c)
plt.title('Three Kingdoms')
plt.xlabel('name')
plt.ylabel('count')
plt.xticks(range(len(name)), name) #눈금 설정
plt.ylim(0, 10000)
plt.show()
'''
# 파이차트(pie)
plt.pie(count, labels=name, colors=c, shadow=True, explode=(0.1,0.1,0.1))

# explode : 각 항목이 원점에서 튀어나오는 정도
plt.title("Three Kingdoms")
plt.show()





