# -*- coding:utf-8 -*-

#UP/DOWN 게임 (함수)
#유저의 이름을 입력받고 환영하는 인사를 출력
#(컴퓨터) 1~100 사이의 랜덤한 숫자를 하나 뽑아서
#유저에게 정답을 입력하게 했을 때
#저 범위의 숫자가 아니면 다시 입력하도록
#입력한 숫자가 정답보다 작으면 'UP', 크면 'DOWN'
#정답을 맞췄을 때는 몇 번만에 맞췄는지 출력 + 종료
#정답 기회는 총 10번

import random

def greetUser():
    userName = input("당신의 이름은? :")
    print("반가워~",userName)

def getComAns():
    comAns = random.randint(1,100)
    return comAns

def explainRule():
    print("##################")
    print("1부터 100사이의 숫자를 맞춰봐!")
    print("기회는 총 10번이야")
    print("##################")

def sayUserAnswer():
    userAns = int(input('입력할 답은 ? : '))
    if (userAns > 100 or userAns<0) :
        print("정답은 1부터 100사이야! 다시 해")
        sayUserAnswer()
    return userAns

def playGame(count, comAns,userAns):
    while count <10:
        userAns = sayUserAnswer()
        count +=1

        if count >=10:
            print("10번의 기회를 다 썼습니다. 정답은 %d입니다." %comAns)

        if userAns<comAns:
            print("UP !")
        elif userAns > comAns:
            print("DOWN !")
        else:
            print("##################")
            print("정답이야 ! %d번만에 맞췄어 !" %count)
            print("정답은 %d였어!" % comAns)
            print("##################")
            break




##########################################################
greetUser()
comAns = getComAns()
explainRule()
count, userAns = 0,0
playGame(count,comAns,userAns)



###############################################################




'''
import random

user = input("유저이름입력: ")
print("%s님 환영합니다요" %user)
print("컴퓨터가 1~100중 번호를 뽑습니다")
ans = random.randint(1,100)
count=0
while True:
    if count>10:
        print("정답 기회는 총 10번입니다")
        break
    userAns = int(input("유저님 정답을 입력하세요: "))    
    count+=1
    if userAns<1 and userAns>100:
        print("다시 입력하세요")
    elif userAns>ans:
        print("UP")
    elif userAns<ans:
        print("down")
    else :
        print(count,"번만에 정답")
        break
'''




