# -*- coding:utf-8 -*-
from cx_Oracle import connect

# Table 데이터 -> 번호값 제외한 모든 데이터 -> csv파일에 담는 작업

con = connect("jaden/0508@192.168.0.15:1521/jaden")
cur = con.cursor()
sql = "select sl_place_name, sl_phone, sl_x, sl_y from search_location order by sl_no"
cur.execute(sql)

with open("C:\\Users\\seems\\Documents\\test\\location.csv","a",encoding="UTF-8") as f:
    for pn, ph, x, y in cur:
        f.write(f"{pn},{ph},{x},{y}\n")

con.close()
print("끝!")