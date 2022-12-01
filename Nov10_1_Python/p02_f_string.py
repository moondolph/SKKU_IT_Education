# -*- coding: utf-8 -*-
from datetime import datetime

# Python 3.6.X 부터 f-string이라고 부르는 포맷팅을 좀 더 쉽게 할 수 있는 방법이 추가됨

#f-string의 모양은 f와 {}만 아시면 됩니다
#

# 좋아하는 음료이름, 마시는 회수 => 입력 받아서 그 내용을 출력
d_name = input()
d_times = int(input())
print("저는 %s를 좋아하고 하루에 %d잔을 마십니다." %(d_name, d_times))
print("----------")
print(f"저는 {d_name}를 좋아하고, 하루에 {d_times}잔을 마십니다.")
print("----------")

#정리
# 1. 문자열 맨 앞에(따옴표 앞) f를 붙인다
# 2. 사용하고 싶은 변수, 값을 중괄호 {}안에 넣는다
# 3. 예쁘게 출력한다★

# 소수점 반올림 표현
# 기본적으로 % 포맷팅과 거의 유사
# 하지만 {}를 사용해서 포맷팅 할 때는, 포맷팅하는 값의 자료형에 상관없이 {}를 사용하면 됨

f = 1.125   #1.125 / 1.1 / 1.12
#f = 1.135   #1.135 / 1.1 / 1.14
print(f"{f}")
print(f"{f:.1f}")
print(f"{f:.2f}")
#5에서 반올림할때 항상 짝수 값으로 반올림

#문자 정렬
s1 = "left"
result1 = f"|{s1:<10}|"
print(result1)

#가운데 정렬
s2 = "mid"
result2 = f"|{s2:^10}|"
print(result2)

#오른쪽 정렬
s3 = "right"
result3 = f"|{s3:>10}|"
print(result3)
print(f"&{s3:>10}&")

# 중괄호 {}안에 있는 변수 뒤에 콜론(:) 붙인 후
# 왼쪽 정렬(<) / 오른쪽 정렬(>) / 가운데 정렬 (^)의 옵션을 넣어서
# 그 후에 자릿수를 알려주는 숫자를 넣어서 정렬 옵션을 완성

#f-string에서 중괄호를 출력하는 방법
num = 10
result4 = f"my age : {num}, {{{num}}}"
print(result4)

#중괄호 연속해서 2개 사용 --> 중괄호 자체 출력 가능
# f-string의 값과 중괄호까지 같이 표현하려면,
#   {{{}}}중괄호 3개 입력하면 num을 변수값으로 인식

# f-string과 dict
d = {
        "name" : "Beaver",
        "gender" : "남자",
        "age" : 100
    }

result5 = f"name : {d['name']}"
print(result5)

# f-string과 list
n = [100, 200, 300]

#각 요소를 출력
print(f"list : {n[0]},{n[1]},{n[2]}")

for v in n:
    print(f"리스트 요소 : {v}")

#기존에 리스트에 접근하는 방법과 동일하게 {}안에 리스트에 대한 접근을 활용하면 됨
print("--------------------------------")
num2 = 1234567890
print(num2)

# 1,234,567,890
print(f"{num2:,}")
print("--------------------")
date1 = datetime.today()
print(date1)

#연-월-일 => 요일
print(f"{date1:%Y-%m-%d} is on a {date1:%A}")
