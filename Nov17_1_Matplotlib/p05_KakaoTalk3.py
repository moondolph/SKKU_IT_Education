# -*- coding:utf-8 -*-
from wordcloud.wordcloud import WordCloud
import matplotlib.pyplot as plt

# Word Cloud
#        tag cloud(태그 클라우드)
#        data에서 얻은 tag들을 분석해서 중요도, 인기수, 횟수, ... 등을 고려해서 시각적으로 표현

# 카카오톡 txt 파일 -> 단어로 나눠서 -> wordcloud로 시각화 

txt = ""


with open("C:/Users/seems/Documents/test/jp.txt","r",encoding="UTF-8") as f:        
    for line in f.readlines():
        line = line.replace("\n", "").split(" : ")
        if len(line) == 2:
            txt += line[1] + " "
#print(txt)


#python에서 보는 방법 
#wc = WordCloud(font_path="C:/Windows/Fonts/malgun.ttf",background_color="black",max_font_size=60).generate(txt)
#plt.imshow(wc)
#plt.show()

#file로 저장하는 방법
wc = WordCloud(font_path="C:/Windows/Fonts/malgun.ttf",background_color="black",max_font_size=60).generate(txt)
wc.to_file("C:/Users/seems/Documents/test/KakaoTalk2.jpg")
print("잘 나온다면.....오늘 수업 끝!")

 