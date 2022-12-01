# -*- coding:utf-8 -*-

from cx_Oracle import connect

# 각각의 커피 이름, 가격, 원두 정보 가격 오름차순으로 정렬해서 출력
# (select 결과가 cur에 들어가게 됨)

# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")

# sql문 작성
sql = "select name, price, bean from coffee order by price"

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

# for c in cur:
#     print(c,type(c))

for n, p, b in cur:
    print(n, p, b)
    print("------------------")
con.close()