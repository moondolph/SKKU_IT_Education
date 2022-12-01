# -*- coding:utf-8 -*-

# cmd -> pip install pandas
#    Pandas : 데이터 조작, 분석을 쉽게 하기 위한 모듈(라이브러리)

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import pandas as pd

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)   

df = pd.read_csv("C:/Users/seems/Documents/test/subwayPayFree.csv", names = ["언제","호선","역","prn","frn","pan","fan"])

# groupby() : 집단, 그룹별로 데이터를 집계, 요약 
df2 = df.groupby('언제').sum() 

# print(df2)
plt.plot(range(df2.index.size), df2['prn'], color="#EF9A9A" )
plt.plot(range(df2.index.size), df2['frn'], color="yellow")
plt.plot(range(df2.index.size), df2['pan'], color="red")
plt.plot(range(df2.index.size), df2['fan'], color="black")
plt.legend(["유임승차","무임승차","유임하차","무임하차"])
plt.title("월별 지하철 유,무임 승차 정보")
plt.xticks(range(df2.index.size), df2.index)
plt.show()


###########################################
# cmd -> pip install django~=3.2.16

###########################################
# Project vs App
            # project : 하나의 큰 서비스
            # Application(APP) : 프로젝트 내의 기능
            
            # manage.py : 명령어를 처리해주는 파일
            # settings.py : 옵션을 설정할 수 있는 파일  
            # urls.py : url 주소를 등록해놓을 수 있는 파일 
            # asgi.py : 웹서버, 프레임워크, 애플리케이션 연결해주는 파일
            # wsgi.py : asgi 이전의 python 표준
###########################################################
            # Cross Domain
            #- pip install django-cors-headers
###########################################################
            #프로젝트 마우스 우클릭 - Django- create application            
            # -photo 입력 -> 폴더 자동으로 안 생기면 따로 추가
# MTV 패턴
# Django 작동 원리: (Model, Templete, View)
        #    (MVC의 Model,  View,  Controller)
            # Model : DB관련된 업무 처리
            # Template : 사용자가 보게 될 화면
            # View : 데이터를 처리한 후 결과를 템플릿에 전달
            
        
        