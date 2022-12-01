# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from json import loads
from urllib.parse import quote

# 필요한 데이터 챙긴 후,

# 책 검색해서 책 제목 - 작가 / 할인가 / 내용 출력

# dapi.kakao.com
# /v3/search/book
# Authorization: KakaoAK ${REST_API_KEY}
# 1332ff234b2b658c1ef873fe08e0b86f
# query

q = quote(input("검색 : "))
#print(q)
h = {"Authorization" : "KakaoAK 1332ff234b2b658c1ef873fe08e0b86f"}

hc = HTTPSConnection("dapi.kakao.com")

hc.request("GET", "/v3/search/book?query="+q,headers=h)

resBody = hc.getresponse().read()
#print(resBody.decode())
###############################################################
kakaoBook = loads(resBody) #JS -> Python
#print(type(kakaoBook))
###############################################################

books = kakaoBook["documents"]
# print(books)

for b in books:
    print(b["title"], "-", b["authors"][0])
    print(b["sale_price"])
    print(b["contents"])
    print("----------------------------------")

#
#




