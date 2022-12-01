# -*- coding:utf-8 -*-
import urllib.request as req
from urllib.error import HTTPError, URLError
from _ast import With
# 저장 경로 - list 형식으로 !

pathList = ["C:/Users/seems/Documents/test/worldcup.jpg",
            "C:/Users/seems/Documents/test/index.html"]

urlList = ["https://img.kbs.co.kr/kbs/620/news.kbs.co.kr/data/fckeditor/new/image/20190320kye0014.jpg",
          "https://www.google.com"]                  

for i, url in enumerate(urlList):  #enumerate(인덱스를 확인할 수 있음)
    # 예외처리
    try: 
        # web의 수신정보를 확인
        res = req.urlopen(url)
        
        # 수신받는 내용
        content = res.read()
        print("----------------------")

        #상태정보 중간 확인
        print(f"헤더 정보: {i, res.info()}")
        print(f"http status : {res.getcode()}")
        print("---------------------------------")
    
        
        #파일쓰기
        # with : 파일을 열고, 닫는거 같이 해주는 역할
        with open(pathList[i], "wb") as f: # 'b' : binary mode
            f.write(content)
        
    
    
    except HTTPError as e:
        print("HTTPError Code : ", e.code)
    except URLError as e:
        print("URLError Code : ", e.code)
    else:
        print("----------------------------------")
        print("성 공 !")
        print("----------------------------------")
#
#
#
#
