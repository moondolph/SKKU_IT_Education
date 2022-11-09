# -*- coding:utf-8 -*-

# OOP : 객체 단위로 실생활을 표현 -> 유지보수가 편하게
#   캡슐화 -> 데이터를 안전하게 처리
#   1 file == 1 class -> 코드 재사용


# Java : perfect한 OOP   
#   java file(class) -> 파일 하나가 곧 클래스 하나
#   클래스명 대문자로 시작 ex) Cat/Dog...


# Python : hybrid한 OOP
#   python file(module) -> 파일 하나에 클래스가 여러개 들어올 수 있음
#                           (1 file != 1 class)
#   클래스명 무조건 대문자로 시작하라는 법은 없음
#   접근제어자(ex: public, private, ...) 없음 -> 캡슐화 
#   static 멤버변수 없음 

##############################################################################
class Shop:
    def showInfo(self):
        print(self.name, self.floor)

class Dog:
    name = "asdf" #의미없음

    def bark(self): #메소드의 첫번째 파라미터로 self
        print("오라올알올아로아롱아")

    def printInfo(self):
        # Java : this.name -> this. 은 생략이 가능 -> name
        # Python : self.name -> self. 은 생략이 불가능 -> self.name으로 써야
        print(self.name, self.age)

###################################################
s=Shop()
s.name="카페"
s.floor=1
s.showInfo()
print("------------")
d = Dog()
d.name = "댕댕이"
d.age = 1982
