# -*- coding:utf-8 -*-
from pickle import NONE

sss = ["ㅋㅋㅋ", "ㅁㅁㅁ", "ㅂㅂㅂ", "ㅎㅎㅎ", "ㅋㅋㅋ", "ㄹㄹㄹ"]
for s in sss:
    # 찾는 문자열이 존재하는 경우    : 0 리턴
    # 찾는 문자열이 존재하지 않는 경우 : -1 리턴 
    print(s.find("ㅂㅂㅂ"))

# 조조(맹덕), 유비(현덕), 손권(중모)
# 책을 훑어보면서... -> 위의 인물들이 몇 번 언급되고 있는지
# 인물, 언급횟수의 형태로 -> csv 파일에 저장

j=y=s=0
for i in range(1,11):
    with open(f"C:/Users/seems/Downloads/ThreeKingdom/TK{i}.txt","r",encoding="UTF-8") as f:
        # 파일 전체 읽기
        data = f.read()
        # 카운트 담기
        j+=data.count('조조')+data.count('맹덕')
        y+=data.count('유비')+data.count('현덕')
        s+=data.count('손권')+data.count('중모')

# csv파일에 저장 
with open("C:/Users/seems/Downloads/ThreeKingdom/TK.csv", "w", encoding="UTF-8") as ff:
    ff.write(f"'조조':{j},'유비':{y},'손권':{s}")
  

'''
#티쳐의 코드
fileName = None
line, word = None, None

wc = {"조조" : 0, "유비" : 0, "손권" : 0 }
for i in range(1, 11):
    fileName = "C:/Users/user/Desktop/beaver/test/ThreeKingdom/TK%02d.txt" %i
    #print(fileName)
    with open(fileName, "r", encoding="UTF-8") as f:
        for line in f.readlines():
            #print(line)
            line = line.replace("\n", "")
            line = line.split(" ")
            for word in line:
                #print(word)
                if word.find("조조") != -1 or word.find("맹덕") != -1:
                    wc["조조"] += 1
                elif word.find("유비") != -1 or word.find("현덕") != -1:
                    wc["유비"] += 1
                elif word.find("손권") != -1 or word.find("중모") != -1:
                    wc["손권"] += 1
# for key in wc:
#     print(key)
# for val in wc.values():
#     print(val)

with open("C:/Users/user/Desktop/beaver/test/ThreeKingdoms/tkResult.csv","w",encoding="UTF-8") as f:
    for k, v in wc.items():
        f.write(f"{k},{v}\n")
print("끗 ! ")
'''