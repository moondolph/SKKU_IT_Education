# -*- coding:utf-8 -*-

# for (int i =0; ...)   : X
# for (int ii : i)      : O(Java의 for-each문에 해당하는 반복문)

l = [123, 45, 6, 78, 910]
for ll in l:        # for (int ll : l) 
    print(ll)
print()

# ㅋ을 10번 출력
for i in range(10):
    print("ㅋ",end="")
print()
# 1 ~ 20 까지의 숫자 중에서 홀수만 출력
for i in range(1,21,2):
    print(i)
#############################################

# while문 : O
while True:
    y = int(input("y : "))
    if y % 2 == 0:
        print("짝수")
        break

# do{}while문 : X
################################################
# enumerate : 반복문을 사용할 때 몇 번 반복되었는지 확인이 필요할 때 사용
# (인덱스, 값) 형태의 tuple 형태로 리턴
ll = ["컴퓨터","모니터","마우스","키보드"]
for i, v in enumerate(ll):
    print(i + 1, v)

print("-------")


score=[10,54, 56, 70,70,87,65,99,91,88]

#1등 학생은 몇 번째에 ? /점수는 몇 점인지?
maxI, maxS = 0, 0
for i, v in enumerate(score):
    if maxS < v:
        maxS = v
        maxI = i
print(maxI,maxS)


res=0
no=0
for i,v in enumerate(score):
    if v>res:
        res = v     
        no= i
print(no, res)







