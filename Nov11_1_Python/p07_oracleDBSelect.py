# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 원두를 검색해서
# 그 원두를 사용하는 커피의 종류 갯수, 평균가를 출력

#검색
a = input("원두검색 : ")

# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")

# sql문 작성
sql = "select count(*), avg(price) from coffee where bean = '%s'" %a

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

for count,avg in cur:
    print("개수:%d, 평균가:%d" %(count,avg))
    print("----- 또 다른 코드-----")
    print(f"개수:{count}, 평균가:{avg}")
    print("------------------")