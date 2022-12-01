# -*- coding:utf-8 -*-

# 3항 연산자
# [참일때의 값] if [조건문] else [거짓일떄의 값]
def getWeight():
    weight = float(input("몸무게 : "))
    return weight if weight>=0 else weight * -1

weight = getWeight()
print(weight)

#숫자를 입력했을 때 짝수인지 홀수인지 출력해주는 프로그램(3항 + f-string)
num = int(input("숫자 : "))
print(f"{num} : 짝수") if num % 2 ==0 else print(f"{num} : 홀수")

'''
def EvenOdd(num):
    print(f"{num}은 짝수입니다") if num % 2 ==0 else print(f"{num}은 홀수입니다")
EvenOdd(5)
'''

# 3항 연산자 중첩
# [참1] if [조건1] else [참2] if [조건2] else ... [거짓]

# 15, 16, 17을 list에 담고
# 리스트 각각의 요소가 2의 배수인지 3의 배수인지, 아니면 둘 다 아닌지를 출력
a=[15, 16, 17]
for i in a:
    print(f"{i}는 2의 배수입니다") if i % 2 == 0 else print(f"{i}는 3의 배수입니다") \
        if i % 3 == 0 else print(f"{i}는 2의 배수, 3의배수 둘 다 아닙니다")
print("----------------------")

# 길어진다면 if - elif - else가 좀 더 보기 편함 !
for val in a:
    if (val % 2  == 0):
        print(f"{i}는 2의 배수입니다")
    elif (val % 3 == 0):
        print(f"{i}는 2의 배수입니다")
    else:
        print(f"{i}는 2의 배수, 3의배수 둘 다 아닙니다")




