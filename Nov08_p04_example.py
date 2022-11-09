# -*- coding: utf-8 -*-

import random


i=random.randint(1,10)
print(i)

# 로또번호뽑기 (6개만) (1~45) -> 중복 없이 -> 출력

def getNumber():
    return random.randint(1,45)

num_list=[] #랜덤으로 뽑은 숫자를 담을 list
count = 0

while count <6:
    ran_num = getNumber()
    if ran_num not in num_list: #뽑은 숫자가 list에 안들어 있다면
                                #(중복처리)
        num_list.append(ran_num)
        count += 1

for n in num_list:
    print(n, end=' ')


'''
n = random.randint(1,45)
res=set()
def lotto():
    for i in range(6):
        res.add(n)
    if (len(res) != 6):
        return lotto()
    return res

aa=lotto()
print(aa)
'''