# -*- coding:utf-8 -*-
from http.client import HTTPConnection, HTTPSConnection
from urllib.parse import quote
from xml.etree.ElementTree import fromstring

# https://openapi.naver.com/v1/search/shop.xml

#cOqQBk8LzfFdqyU3L1JF
#ZaDYeUXfyd

# 상품명 : 입력
# xml 파싱해서
# 문서의 제목 / 최저가 / 브랜드 / 대분류 카테고리 정보를 출력

def cut(t):
    t = t.replace("<b>", "")
    t = t.replace("</b>", "")
    return t

q = input("상품명 : ")

#URLEncoding해서 주소로 넘겨줄 것
q = quote(q)
print(q)

#요청헤더처리(dict의 형태로)
h = {
        "X-Naver-Client-Id" : "cOqQBk8LzfFdqyU3L1JF",
        "X-Naver-Client-Secret" : "ZaDYeUXfyd"
    }

hc = HTTPSConnection("openapi.naver.com")
hc.request("GET","/v1/search/shop.xml?query=" + q, headers=h)

# http 통신해서 -> 응답결과가 콘솔에 나오게
resBody = hc.getresponse().read()
#print(resBody.decode())

#XML Parsing
#DOM객체 여러개 찾기 : getiterator("태그명") / iter("태그명")
#DOM객체 하나 찾기 : .find("태그명")

for p in fromstring(resBody).iter("item"):
    print(cut(p.find("title").text))
    print(p.find("lprice").text)
    print(p.find("brand").text)
    print(p.find("category1").text)
    print("-------------------")

