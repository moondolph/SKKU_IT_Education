# -*- coding:utf-8 -*-

#콘솔창에 입력 -> 파일에 저장
#입력 다 끝내면 -> 파일을 읽어서 콘솔에 출력

#콘솔에 입력 -> 파일에 저장
a = input("입력 : ")
file = open("C:/Users/seems/Documents/test/test2.txt", "w", encoding="UTF-8")
file.write(a + "\n")
print("완료")
file.close()

#파일 읽고 콘솔에 출력
file = open("C:/Users/seems/Documents/test/test2.txt","r",encoding="UTF-8")
for t in file.readlines():
    print(t, end="")
file.close()

data = file.read()
print(data)
file.close()

