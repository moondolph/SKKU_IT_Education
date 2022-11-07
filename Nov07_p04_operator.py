# -*- coding:utf-8 -*-

# 정수 2개 입력받아서, 사칙연산에 대한 결과와 
# 앞의 수를 뒤의 수로 나눴을때의 나머지 값을 출력

a, b = map(int,input().split())

x = a + b 
y = a - b
z = a / b
m = a * b 
n = a % b

print("sum : ",x)
print("min : ", y)
print("div : ", z)
print("mul : ", m)
print("mod : ", n)

########################

quo = a // b   #몫
pow = a**b  #거듭제곱
print(pow)

z = "ㅋㅋㅋ"
#h = sum + z         #int+ str -> 안돼
#h= str(sum) + z      #문자열끼리만 결합가능
#print(h)

i = sum * z          #문자열 * 정수 
print(i)             #-> 정수만큼 문자열 반복
###############################

# x = x + 3
x += 3
print(x)

# ++, --는 없음 ㅠㅠㅠ
#x++
#print(x)
##############################################

j = x > 10
print(j)

# && : and, || : or
k = (x>10) and (y<3)
print(k)

# ! : not
l = not k
print(l)

#m : x가 5이상 ~ 10 이하 : True / 아니면 False 출력
#m = (x>=5) and (x<=10)
m = (5 <= x <= 10)
print(m)
##################################################

#3항연산자...
#Python에는 있다고 하는 사람도 있고, 없다고 하는 사람도 있음....
#[참일때의 값] if [조건식] else [거짓일때의 값]
#정수를 하나 입력받아서 -> 그게 짝수면 '짝수', 홀수면 '홀수' 출력
print("짝수") if int(input("정수 : "))%2==0 else print("홀수")
print("짝수" if int(input("정수 : "))%2==0 else "홀수")




 