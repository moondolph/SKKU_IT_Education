# -*- coding:utf-8 -*-
from cx_Oracle import connect

#커피테이블 활용
#input으로 숫자 2개를 입력 => 가격순(오름차순)으로 정렬해서
#                     => ? ~ ?번째까지의 평균 가격을 출력


# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")
start = int(input("시작 : "))
end =  int(input("끝 : "))

# sql문 작성
sql = "select rn, avg(price) from (select rownum rn,price from (select * from coffee order by price)) where rn between '%d' and '%d' group by rn"  %(start,end)

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

for n,p in cur: #cur안에 tuple형태로 결과가 담김 
    print("번호:%d, 평균가:%d" %(n,p))
    print("----- 또 다른 코드-----")
    print(f"번호:{n}, 평균가:{p}")
    print("------------------")
    
#연결종료
con.close()