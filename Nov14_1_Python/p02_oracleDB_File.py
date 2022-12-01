# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB연결 -> 커피 이름, 가격, 원두 정보 -> .csv파일로 생성(,를 기준으로)
# ex)    이름, 가격, 원두
#        이름, 가격, 원두
#        이름, 가격, 원두
        

# 연결
con = connect("jaden/0508@192.168.35.113:1521/jaden")

#파일쓰기 - a
file = open("C:/Users/seems/Documents/test/coffee.csv","a",encoding="UTF-8")

# sql문 작성
sql = "select name,price,bean from coffee" 

# DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
cur = con.cursor()

# sql문 수행 
cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

for n,p,b in cur:
    # 파일에 내용을 추가(append)
    file.write(f"{n},{p},{b}")
    file.write("\n")


#연결종료
file.close()
con.close()
print("END !")  #프로그램 다 종료되고 잘 끝났다는 메시지 출력
