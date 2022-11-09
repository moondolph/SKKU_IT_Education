# -*- coding:utf-8 -*-

#람다(lambda)함수
#   장점 : 메모리 절약, 가독성 향상, 코드 간결
#       일반 함수 : 객체 생성 -> 메모리가 할당
#       람다 함수 : 즉시 실행함수(heap 초기화) -> 메모리 초기화
#   표현법 :
#       lambda 매개변수(=파라미터) : 표현식

# 변수를 할당하는 일반적인 함수
def hab(num):
    x = num + 100
    return x
print(hab(100))

# 람다함수
(lambda num: print(num + 100))(100)

# 숫자 두개 넣으면 그 곱을 출력하는 함수
(lambda a, b: print(a * b))(10, 11)

# 숫자 두개 넣으면 그 합을 구하는 함수
hab2 = (lambda x, y: x+y)(100, 200)
print(hab2)



