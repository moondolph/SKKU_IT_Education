# -*- coding:utf-8 -*-
from cx_Oracle import connect

# input 2개 : 원두 이름 검색 / 숫자를 입력
# 검색한 원두를 사용하는 커피의 가격을 => 입력한 숫자만큼 인상

# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")
bean = input("원두 : ")
extra =  int(input("인상가 : "))

#UPDATE [테이블] SET [열] = '변경할값' WHERE [조건]
# sql문 작성
sql = "update coffee set price = price + '%d' where bean='%s'" %(extra,bean) 

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨


# 결과처리    
if cur.rowcount >= 1: # 방금 작업때문에 영향을 받은 행 수가 하나면...
    print("Success !")  #성공
    con.commit()        #commit를 해야 서버에 실제로 반영 가능




#연결종료
con.close()
print("END !")  #프로그램 다 종료되고 잘 끝났다는 메시지 출력