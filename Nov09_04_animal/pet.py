# -*- coding:utf-8 -*-

# 강아지 클래스 -> 생성자에 이름, 나이 + 그 속성 출력 기능
class Dog:

    def __init__(self, name, age):
        print("오버로딩 된 생성자?!?!?")
        self.name = name  # 보통은 이렇게 생성자에서 멤버변수를 만들어서 결정
        self.age = age

    def printInfo(self):
        print(self.title, self.price)


# 여기서 야생동물 불러와서 -> 객체 만들어서 출력하는 기능까지
if __name__ == "__main__":
    # 여기서 야생동물 불러와서 -> 객체 만들어서 출력하는 기능까지
    # oMain3에서 실행
    from Nov09_04_animal import Ant
    a = Ant("동학개미", 1000000)
    a.printInfo()
    # d = Dog("asdf", 1)
    # d.printInfo()
