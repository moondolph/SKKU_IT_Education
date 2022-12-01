# -*- coding:utf-8 -*-
from cx_Oracle import connect

# select 번호순으로 조회 -> 번호를 입력하면 -> 그 데이터가 삭제 !
# 999를 입력하게되면 프로그램이 종료 

#연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")
while True:
    sql = "select * from coffee order by no"
    cur = con.cursor()
    cur.execute(sql)
    
    for no, name, price, bean in cur:
        print(f"{no}] {name},{price}원, {bean}산")
    print("--------------------------------")
    
    #input으로 번호 입력하면, 해당 데이터가 삭제되도록
    no = int(input("번호 : "))
    sql = f"delete from coffee where no={no}"
    cur = con.cursor(sql)
    
    if cur.rowcount==1:
        print("삭제 성공")
    
    if no==999:
        print("종료")
        break
    
    
#연결종료
con.close()