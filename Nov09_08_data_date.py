# -*- coding:utf-8 -*-
from datetime import datetime

# 현재시간 날짜
now = datetime.today()  #자동완성 주의(_datetime x)
print(now)

#특정 시간 날짜
yesterday = datetime(2022,11,8)
print(yesterday)
print(type(yesterday))
print(yesterday.year)
print(yesterday.month)
print(yesterday.day)

print()
#생일을 입력받아서 나이를 계산해주는 프로그램
birthday = input("생년월일(yyyy/mm/dd) : ")
curYear = now.year
print(type(curYear))

#나이 : 올해년도 - 태어난 연도 + 1
print(curYear - int(birthday[0:4])+1)

# strptime : str -> datetime
bd = datetime.strptime(birthday, "%Y/%m/%d")
print(type(bd))

# strftime : datetime -> str
bd = datetime.strftime(bd,"%A")
print(bd)
##########################################################
# Pattern
# %Y : 연도 4자리 / %y:연도 뒤에 2자리
# %m : 월 / %d : 일 / %H : 시간(24시간) / %I :시간(12시간) / %p: AM,PM
# %M : 분 / %S : 초 / %a : 요일(짧게 / 'Wed') / %A 요일(길게 / 'Wednesday')
##########################################################
#특정 날짜를 연/월/일 형태로 입력 받아서 -> 일/월 형태의 문자열로 출력
randomDate = input("날짜입력(연/월/일) : ") #현재 str인 상황

#str -> datetime
randomDate = datetime.strptime(randomDate,"%Y/%m/%d")
print(randomDate)
print(type(randomDate))

#datetime -> str
randomDate = datetime.strftime(randomDate, "%d/%m")
print(randomDate)
print(type(randomDate))

'''
date = input("연/월/일: ")
a = datetime.strptime(date,"%Y/%d/%m")
b = datetime.strftime(a,"%d/%m")
print(b)
'''
'''
year = int(input("태어난 해 : "))
month = int(input("태어난 월 : "))
day = int(input("태어난 일 : "))

birth=datetime(year,month,day)
print(now.year-birth.year+1)
'''