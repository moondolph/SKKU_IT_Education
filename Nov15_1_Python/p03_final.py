# -*- coding:utf-8 -*-
from cx_Oracle import connect
from datetime import datetime, date
from pickle import NONE

# 메뉴만들기 (함수)
# 1. 학생 등록 / 2. 강의장 조회 / 3. 학생 조회 / 4. 학생 정보를 파일로 내보내기 
# 0. 종료 

# 강의장 조회 : 1강의장 - 7층 복도 오른쪽
# 학생 조회 : 이름, 생년월일(연-월-일)(+요일), 나이, 몇 강의장
#            중간고사점수, 기말고사점수, 평균점수 

# 파일로 내보내기 (학생의 전체 정보 다 csv파일로)  


    
def showMenu():
    print("-----------------------------")
    print("1. 학생등록")
    print("2. 강의장 조회")
    print("3. 학생 조회")
    print("4. 학생정보를 파일로 내보내기")
    print("0. 종료")
    print("-----------------------------")
    return input("번호 입력 : ")



#1. 학생 등록
def register() :
    
    
    # 1. DB연결
    con = connect("jaden/0508@192.168.35.113:1521/jaden")

    # 3. data확보!
    n = input("이름 : ")
    b = date(input("생일(YYYYMMDD) : "))
    c = input("강의장 : ")
    m = int(input("중간점수 : "))
    f = int(input("기말점수 : "))
    
    

    # 4. sql문 작성
    #    Java : ?, ?
    #    MyBatis : #{멤버변수명}
    #    Python : 완성된 sql문을 사용! 
    #        sql문 끝나고 나서 ;(세미콜론) 넣지않는다!!!!
    sql= "insert into student values(nov15_student_seq.nextval,'%s','%date','%s',%d,'%d')" %(n,b,c,m,f)
    
    # 5. DB관련 작업(sql문을 서버로 전송, 실행, 결과 받기) : 총괄객체
    #    Java : PreparedStatement (pstmt)
    #    Python : cursor()
    cur = con.cursor()
    
    # 6. 수행(sql문을 서버로 전송, 실행, 결과 받기)
    cur.execute(sql)
    
    # 7. 결과처리
    if cur.rowcount == 1: # 방금 작업때문에 영향을 받은 행 수가 하나면...
        print("Success !")  #성공
        con.commit()        #commit를 해야 DB서버에 실제로 반영 가능
    
    # 2. DB연결종료
    con.close()
    
# 2. 강의장 조회
def selectClassroom():
    
    # 연결
    con = connect("jaden/0508@192.168.35.113:1521/jaden")
    
    # sql문 작성
    sql = "select * from classroom"

    # DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
    cur = con.cursor()

    # sql문 수행 
    cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨

    # for c in cur:
    #     print(c,type(c))

    for c, l in cur:
        print(f"{c} - {l}")
        print("------------------")
    con.close()
    
# 3. 학생 조회
def selectStudent():
    # 연결
    con = connect("jaden/0508@192.168.35.113:1521/jaden")
    
    # sql문 작성
    sql = "select name, birthday, classroom, mid, fin from student"

    # DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
    cur = con.cursor()

    # sql문 수행 
    cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨


    now=datetime.today()
    thisYear=now.year()
    for n, b, c, m, f in cur:
        print(f"이름 : {n}")
        bd = datetime.strftime(b,"%Y-%m-%d")
        print(f"생일 : {bd} ({b.strftime('%a')})")
        print(f"나이 : {thisYear-b.year +1}")
        print(f"중간점수 : {m}점")
        print(f"기말점수 : {m}점")
        print(f"평균점수 : {(m+f)/2}점")
        print("------------------")
    con.close()

#4.학생 정보를 파일로 내보내기 
def studentIntoFile():
    # 연결
    con = connect("jaden/0508@192.168.35.113:1521/jaden")
    
    #파일쓰기 - a
    file = open("C:/Users/seems/Documents/test/student.csv","w",encoding="UTF-8")
    
    # sql문 작성
    sql = "select * from student" 
    
    # DB관련 총괄객체 / sql 수행 결과(select문 결과 객체)
    cur = con.cursor()
    
    # sql문 수행 
    cur.execute(sql) # 수행하면 select의 결과가 cur에 tuple로 들어가게 됨
    
    for _, n,b,c,m,f in cur:
        # 파일에 내용을 추가(append)
        file.write(f"{n},{b},{c},{m},{f}\n")
    
    #연결종료                                                   
    file.close()
    con.close()
    print("END !")  #프로그램 다 종료되고 잘 끝났다는 메시지 출력


#기능 모아놓기
def start(menu):
    while True:
        menu = showMenu()
        if menu == "1":
            register()
        elif menu == "2":
            selectClassroom()
        elif menu == "3":
            selectStudent()
        elif menu == "4":
            studentIntoFile()
        elif menu == "0":
            print("종료합니다.")
            break
###############################################
menu = None 
start(menu)
