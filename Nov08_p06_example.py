# -*- coding:utf-8 -*-

# Java(null) = Python(None)

# 가위바위보 -> 한번 질때까지 -> 총 몇 번 이겼는지 출력
import random

handTable=[None, "가위", "바위", "보"]

def printRule():
    print("-------------")
    for i, h in enumerate(handTable):
        if(i !=0):
            print("[%d] %s" %(i,h))
    print("-------------")


def comFire():
    return random.randint(1,3)

def userFire():
    print("=-=-=-=-=-=-=-=-=-=-=-=")
    uh = int(input("뭐 낼 까 ? : "))
    print("=-=-=-=-=-=-=-=-=-=-=-=")
    if(1<=uh<=3):
        return uh
    return userFire()
    
def printHand(uhuh,chch):
    print("유저 : %s" % handTable[uhuh])
    print("컴퓨터 : %s" % handTable[chch])

def judge(uhuh,chch):
    t = uhuh - chch
    if t == 0:
        print("무승부")
        return 0
    elif t == -1 or t==2:
        print("패배")
        return 999
    else:
        print("승리")
        return 1

def playGame(uHand, cHand, result, win):
    while True:
        uHand = userFire()
        cHand = comFire()
        printHand(uHand,cHand)
        result = judge(uHand, cHand)
        if result == 999:
            print("=-=-=-=-=-=-=-=-=-=-=-=-=")
            print("종료!")
            
            if win >= 10:
                print("...개고수")
            elif win >= 5:
                print("...좀 치네?")
            else:
                print("...삭제해라 애송이")
            break
        win += result
    print("%d승으로 종료!" %win)
######################################
printRule()
uHand, cHand, result, win = 0, 0, 0, 0
playGame(uHand, cHand, result, win)

























'''
judge = {1:"가위", 2:"바위", 3:"보"}


record=[0,0,0]
while True:
    computer=random.randint(1,3)
    me = int(input("1.가위 2.바위 3.보 중에서 내고 싶은 번호? : "))
    if judge[me]=="가위" and judge[computer]=="가위":
        print("무승부입니다")
        record[1]=record[1]+1
    
    if judge[me]=="가위" and judge[computer]=="바위":
        print("패배하였습니다")
        print('총 전적 {}승 {}무 {}패'.format(record[0],record[1],record[2]))
        break
    
    if judge[me]=="가위" and judge[computer]=="보":
        print("승리하였습니다")
        record[0]=record[0]+1
    
    
    if judge[me]=="바위" and judge[computer]=="바위":
        print("무승부입니다")
        record[1]=record[1]+1
    
    if judge[me]=="바위" and judge[computer]=="보":
        print("패배하였습니다")
        print('총 전적 {}승 {}무 {}패'.format(record[0],record[1],record[2]))
        break
    
    if judge[me]=="바위" and judge[computer]=="가위":
        print("승리하였습니다")
        record[0]=record[0]+1
    

    if judge[me]=="보" and judge[computer]=="보":
        print("무승부입니다")
        record[1]=record[1]+1
    
    if judge[me]=="보" and judge[computer]=="가위":
        print("패배하였습니다")
        print('총 전적 {}승 {}무 {}패'.format(record[0],record[1],record[2]))
        break
    
    if judge[me]=="보" and judge[computer]=="바위":
        print("승리하였습니다")
        record[0]=record[0]+1
'''    


    
  
    

