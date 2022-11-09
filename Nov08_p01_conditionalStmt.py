# -*- coding:utf-8 -*-

# 조건문 : 흐름제어

if True:
    print("와~ 조건문 ~")

if False:
    print("안 나오G~?")
######################################
# 우선순위(산술, 관계, 논리)
# 산술 > 관계 > 논리
print(10 + 2 > 8 + 3) # 산술이 관계보다 앞서서 => 12 > 11
print(10 + 2 * 2 > 8 + 3 * 2) # 14 > 14 
print(((10 + 2) > 3) and ( 6 + 4 == 10))
##########################################
# 놀이동산 >> A : 성인, 150이상 (값은 입력받아서)
# 입력시에 -> 탑승 가능 or 탑승 불가 출력

adult = int(input("나이: "))
height = float(input("키: "))
if((adult>=20) and height>=150):
    print("탑승가능")
else:
    print("탑승불가")

##다른 풀이1
# if((adult>=20)):  
#     if(height>=150):
#         print("탑승가능")
#     else:
#         print("탑승불가")
# else:
#     print("탑승불가")

##다른 풀이2
#print("탑승가능" if (age>=20 and height >=150) else "탑승불가")

#############################################################
#다중 조건문
#Java : if - else if - else
#Python : if - elif - else

point = int(input("점수 : "))
if point>=80:
    print("A")
elif point>=70:
    print("B")
elif point>=60:
    print("C")
else:
    print("D")

##############################################################
# switch-case : 없음

# in, not in : 
abc = {"name" : "비버", "age" : 19, "phone" : "010-1111-2222"}
print("name" in abc)
print(20 in abc.values())
print("height" not in abc)







