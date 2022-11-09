# -*- coding:utf-8 -*-
from random import randint
#randint

#패키지에 있는 Class 불러오기

# import Nov09_04_animal.pet      #import 패키지명.모듈명 -> 써먹을 수 있게 불러온 것
                                #pet.py의 소스가 여기로 들어온 셈

# d = Nov09_04_animal.pet.Dog("댕댕이", 14) # 패키지명.모듈명.클래스명(...)
# d.printInfo()
###################################################################
# import Nov09_04_animal.pet as ap    #import 패키지명.모듈명 as 별명
# d = ap.Dog("댕댕이",1)                 #별명.클래스명(...)
# d.printInfo()
###################################################################
# from Nov09_04_animal.pet import Dog # from 패키지명.모듈명 import 가져올 거
# d = Dog("댕댕쓰", 3)
# d.printInfo()
###################################################################
# from Nov09_04_animal.pet import Dog as dd
# d= dd("댕댕e", 6)
# d.printInfo()
###################################################################
# Java :
#   전 세계적으로 많이 사용되고
#   자기가 작업한거 공유하는 문화 -> Maven
#   클래스명이 당연히 중복이 될 것
#   클래스명이 중복될 때 구분하는 수단 : package
#   패키지명은 전세계적으로 중복이 되지 않도록 -> com(kr).회사명.프로그램명.주제
#                                          com.beaver.nov091.project
#   패키지명.클래스로 사용 -> 어떤 조건에 맞으면 패키지명은 안 써도 됨
#           (같은 패키지 or java.lang 소속 or import하면 패키지명 생략 o)
#   java.util.Random r = new java.util.Random();
#   import는 선택사항
#

# Python :
#   전 세계적으로 많이 사용되고
#   자기가 작업한거 공유하는 문화 -> pip
#   클래스명이 당연히 중복이 될 것
#   클래스명이 중복될 때 구분하는 수단 : package
#   패키지명에 규칙이 없음 -> 패키지명이 중복 -> ?!?!?!?!?!
#   클래스를 패키지에 꼭 넣지만은 않음...
#   다른 파일을 불러온다면 import는 필수 !!!
#####################################################################
import Nov09_04_animal.pet as ap

class Dog:
    def punch(self):
        print("댕댕펀취~")

d = ap.Dog("댕댕2",1)
d.printInfo()

#클래스명이 중복된다면 가까운거로 판정
d2 = Dog()
d2.punch()





