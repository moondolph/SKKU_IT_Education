# -*- coding:utf-8 -*-
import requests
from bs4 import BeautifulSoup

# 크롤링해서
# 1 ~ 10페이지까지의
# 영화제목, 평점, 감상평의 형태로 csv파일에 저장

# ex) 동감, 10, 안보며 진짜 후회해요 #(%#)(%(#)$()@$*()
# ......

# https://movie.naver.com/movie/point/af/list.naver?page=2
with open("C:/Users/seems/Documents/test/movie.csv","a",encoding="UTF-8") as f:
    for i in range(1, 11):
        addr = "https://movie.naver.com/movie/point/af/list.naver?page=" + str(i)
        res = requests.get(addr)
        
        soup = BeautifulSoup(res.text, 'html.parser')
        
        movies = soup.select('.title')
        for m in movies:
            f.write(m.get_text().split("\n")[1] + ",")
            f.write(m.get_text().split("\n")[3].split("중")[1] + ",")
            f.write(m.get_text().split("\n")[5] + "\n")
            print("====================================")
print("오 늘 수 업 끝 !")
        
        
        
        







