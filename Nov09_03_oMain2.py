
class Book:
    # def __init__(self):
       #  print("기본생성자 - 책 생성")

    # 생성자 : 객체가 메모리상에 만들어질 때 호출하는 메소드
    # overloading이 안되니 -> 생성자를 하나만...!
    def __init__(self, title, price):
        print("오버로딩 된 생성자?!?!?")
        self.title = title  # 보통은 이렇게 생성자에서 멤버변수를 만들어서 결정
        self.price = price

    def printInfo(self):
        print(self.title, self.price)

    # 소멸자(destructor) : 객체가 메모리상에서 사라질때 호출하는 메소드
    def __del__(self):
        print("책 삭제")
######################################################
# 사람 클래스 : 이름, 나이 / 그 속성들 출력하는 기능/ 생성자, 소멸자

class Human:
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def showInfo(self):
        print(self.name, self.age)

    def __del__(self):
        print("사라져라 휴먼")

    def printInfo(self):
        print(self.name, self.age)

    def __del__(self):
        print("사람 클래스 소멸")


######################################################
# b1 = Book()
b2 = Book("원피스", 7000)
b2.printInfo()
print("-----")
######################################################
# Garbage Collection : 그 객체를 가리키는 변수가 없게 되면 Heap영역을 자동으로 정리

h1=Human("김휴먼", 10)
h1.showInfo()
print("-----")
h2 = Human("박휴먼", 20)
h2.showInfo()
print("-----")
h3 = h1
h3.showInfo()

#print(id(h1))
#print(id(h3))

h1=None
#h3.showInfo()
h3=None

print("1@)(#@)%*@)%")

