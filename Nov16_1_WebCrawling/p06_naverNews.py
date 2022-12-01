# -*- coding: utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup


# 검색어 입력했을 때,
# 관련 뉴스 내용 5페이지까지의 뉴스 제목들을 콘솔에 출력
# https://search.naver.com/search.naver?sm=tab_hty.top&where=news&query=%EC%9A%B0%EB%A3%A8%EA%B3%BC%EC%9D%B4&oquery=%EC%BD%9C%EB%9D%BC&tqi=h3eGOsp0J1sssK5QdadssssssER-217037&nso=so%3Ar%2Cp%3Aall%2Ca%3Aall&mynews=0&office_section_code=0&office_type=0&pd=0&photo=0&sort=0
# https://search.naver.com/search.naver?sm=tab_hty.top&where=news&query=


def getTitle(addr, q):
    for i in range(0, 5):
        # 1페이지 : 1 ~ 10 / 2페이지 : 11 ~ 20 / 3페이지 : 21 ~ 30 / ....
        print(f"======================== {i + 1} 페이지========================")
        start =  10 * i + 1  # 1 / 11 / 21 / 31 / 41
        address = addr + q + "https://search.naver.com/search.naver?sm=tab_hty.top&where=news&query=%EC%9A%B0%EB%A3%A8%EA%B3%BC%EC%9D%B4&oquery=%EC%BD%9C%EB%9D%BC&tqi=h3eGOsp0J1sssK5QdadssssssER-217037&nso=so%3Ar%2Cp%3Aall%2Ca%3Aall&mynews=0&office_section_code=0&office_type=0&pd=0&photo=0&sort=0" 
        
        res = requests.get(address)
        
        soup = BeautifulSoup(res.text, 'html.parser')

        news = soup.select('.news_tit')
        for n in news:
            print(n.get_text())

if __name__ == '__main__':
    address = "https://search.naver.com/search.naver?sm=tab_hty.top&where=news&query="
    query = quote(input("검색어 : "))
#######################################################################################
getTitle(address,query)












