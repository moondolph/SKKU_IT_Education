# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB에 있는 미세먼지 데이터 -> CSV에 저장

# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")

# sql문 작성
sql = "select * from seoul_airs" 

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

# 파일쓰기 - a
file = open("C:\\Users\\seems\\Documents\\test\seoulAir.csv","a",encoding="UTF-8")

for n,d,mx,mn in cur:
    # 파일에 내용을 추가(append)
    file.write(f"{n},{d},{mx},{mn}\n")
    #file.write("\n")

#연결종료
file.close()
con.close()
print("SUCCESS !")  #프로그램 다 종료되고 잘 끝났다는 메시지 출력   