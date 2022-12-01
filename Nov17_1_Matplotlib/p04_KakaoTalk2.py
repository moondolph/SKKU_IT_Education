# -*- coding:utf-8 -*-
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm



# 카카오톡 내용 txt파일 정제 
# ㅋ : ?, ㅎ : ? , ㅠ : ?, ? ; ? , ! : ? -> pie차트로 나타내보기!
with open("C:/Users/seems/Documents/test/jp.txt","r",encoding="UTF-8") as f:
    wc = {"ㅋ" : 0,"ㅎ" : 0, "ㅠ" : 0, "?" : 0, "!" : 0}
    
    for line in f.readlines():
        line = line.replace("\n", "").split(" : ")
        # print(line)
        if len(line) == 2:
            for w in line[-1]:
                # print(w) # 대화 내용을 한글자씩 쪼갬
                if w == "ㅋ" or w =="ㅎ" or w == "ㅠ" or w=="?" or w == "!":
                    wc[w] +=1
print(wc)

word = []
count = [] # key와 value를 따로 담을 빈 list 생성

for k, v in wc.items():
    word.append(k)
    count.append(v)
    
#print(word,count)


fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile,size=50).get_name()
plt.rc("font", family=fontName)

w = {'width' : 0.7, 'edgecolor' : 'pink', 'linewidth' : 5}
plt.pie(count, labels=word, autopct="%.2f%%", wedgeprops=w) # wedgeprops : 테두리
plt.title("카톡 단어 사용량")
plt.show()







