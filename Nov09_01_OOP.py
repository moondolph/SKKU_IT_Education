# -*- coding:utf-8 -*-

# 숫자야구 (3자리) (함수) (각 자리수의 숫자는 중복 X)
# 012 ~ 987 중에 랜덤한 숫자가 정답
# 유저가 입력 -> 자릿수와 값까지 같으면 S, 자릿수는 다른데 값이 같으면 B
# S가 3개 나오면 정답! -> 종료

##############################################################################
import random

def generate_numbers():
    numbers=[]
    while len(numbers)<3:
        num = random.randint(0,9)
        if num not in numbers: #list에 뽑은 숫자값이 없으면
            numbers.append(num)
    print("번호 뽑기 완료 !")
    return numbers

def get_userAns():
    userAns = input("답 입력: ") # int로 받으면 백의자리가 0인것들은 가져올 수 없음
    if( (userAns[0] == userAns[1]) or
        (userAns[0] == userAns[2]) or
        (userAns[1] == userAns[2])):
        print("중복된 숫자는 입력하지 마세요! 닷씨는!")
        get_userAns()
    return userAns

def check(gn, ua):
    strike, ball = 0, 0
    for i in range(0, 3):
        for j in range(0,3):
            if gn[i] == int(ua[j]):
                if i==j :
                    strike += 1
                else :
                    ball += 1

    return strike, ball


def playGame(gn, s, b):
    while s != 3:
        s, b = check(gn, get_userAns())
        print("{}S! {}B!".foramt(s,b))
        if s == 3:
            print("정답입니다. 수고하셨습니다!")

#######################################
gn = generate_numbers()

print(gn)
s=0
b=0
playGame(gn,s,b)































#중복처리를 어떻게 할 것 인가?
#012~987을 어떻게 처리할 것인가?
#
'''숫자 자르는법-> 문자열로된 숫자를 정수형으로 mapping하고 리스트에 담으면 한 개씩 짜를 수 있음
a=map(int,str(123))
print(a,type(a))
b=list(a)
print(b)
'''


def ansNum():    
    number = random.randint(12,987)
    num_list = list(map(int, str(number)))
    if len(str(number))<3:
        num_list.insert(0,0)


    result=[]
    for value in num_list:
        if value not in result:
            result.append(value)



    print(result)



'''
def comAns() :

    r0 = random.randint(0,9)
    r1 = random.randint(0,9)
    r2 = random.randint(0,9)

    if r0=0:
        if r1=0:

    
    
    s = set([r0,r1,r2])   
    comAns = list(s)
    
    if r0==0 and r1=1 
    
    
    return comAns

b=comAns()
print(b,type(b))

'''


