# -*- coding:utf-8 -*-

class Ant:
    def __init__(self,name,asset):
        self.name = name
        self.asset = asset

    def printInfo(self):
        print(self.name, self.asset)

# [이 모듈을 실행했을 때 동작해라]가 가능한 조건
#       프로그램의 시작점이라는 뜻
# 이 모듈이 어딘가에 import를 당했을 때 아무 작업도 하지 말고,
# 실제 이 모듈에서 코드가 실행되었을 때만 동작해라
#   >> 실질적인 main 역할이 가능 o
if __name__=="__main__":
    from Nov09_04_animal.pet import Dog
    d = Dog('고양이', 2)
    d.printInfo()






class tiger:
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def printInfo(self):
        print(self.name,self.age)

    def punch(self):
        print("타이거발톱!")



    def __init__(self, title, price):
        print("오버로딩 된 생성자?!?!?")
        self.title = title  # 보통은 이렇게 생성자에서 멤버변수를 만들어서 결정
        self.price = price

    def printInfo(self):
        print(self.title, self.price)

    # 소멸자(destructor) : 객체가 메모리상에서 사라질때 호출하는 메소드
    def __del__(self):
        print("책 삭제")


