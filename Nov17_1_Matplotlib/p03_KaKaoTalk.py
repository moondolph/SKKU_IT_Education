# -*- coding:utf-8 -*-
from wordcloud.wordcloud import WordCloud

# wordcloud 
with open("C:/Users/seems/Documents/test/jp.txt","r",encoding="UTF-8") as f:
    txt = f.readlines()
    #print(txt)
    
wc = WordCloud(font_path="C:/Windows/Fonts/malgun.ttf",background_color="black",max_font_size=200,width=800,height=800)
cloud = wc.generate(str(txt)) 

cloud.to_file("C:/Users/seems/Documents/test/jp.jpg")
print("완료!")


