# -*- coding:utf-8 -*-

#function(함수)
#def 함수명(파라미터명):
    #code

def test():
    print("배부른 피그")

def test2():        # :(콜론)을 썼으면 그 다음줄은 반드시 들여쓰기
    pass            # : 뒤에 코드 적을 것이 없을 때, 자리를 채워주라는 의미


# 정수 2개를 넣으면 그 합을 '출력' 하는 함수 
def test3(a=5,b=3):     #호출할 때 값을 안 넣어주면 함수파라미터의 값을 기본값으로 사용
    print(a+b)


# 정수 3개를 넣으면 그 합을 '출력' 하는 함수
def test4(a,b,c):           #파이썬은 오버로딩 안됨->모든 함수명이 다 달라야 함
    print(a+b+c)

#정수 2개를 넣으면 그 합을 '구하는' 함수
def test5(a,b):
    return a+b


#정수 2개를 넣으면 사칙연산 결과를 '구하는' 함수
def test6(a,b):
   
   '''
        설명서...
        이 설명서는 1232년 OO에서부터 시작되어...
    
   
   '''
    q=a+b
    w=a-b
    e=a*b
    r=a/b
    return q,w,e,r #tuple 하나 리턴



###############################
help(test6)
help(print)

test()
test3(1,3)
test3()

c = test5(1,5)
print(c)

d = test6(3, 2.5)
print(d, type(d))

u,i,o,p = test6(2, 1.5)
print(u,i,o,p)

u,i,_,p = test6(2,1)            # _처리하면 곱하기 부분 안 가져올 수 있음
print(u,i,o,p)


