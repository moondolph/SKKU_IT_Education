# -*- coding:utf-8 -*-

# Java vs Python
# Java : ????? ??? ????? -> ????? ??? -> perfect?? ?????????
#       ??????, ????????? ???? ???
#       ??? ??????? 



# Python : ????? ???? ????? -> ?????? ??? -> hybrid?? ????????? 
#         ??? ª?? 
#         ??? ???????...??? ?????? ????! 
#############################################################

#출력
print('WA! python!')
print('WA! ??????!') # enter 자동으로 엔터 O
print()  #한칸 띄어쓰기

#seperator
print('aa','bb','c','dd','eee',sep='     ')



#전화번호   출력
print('010', '1234','5678',sep='-')


#메일 출력
print('hello','google.com',sep="@")
print()

#end
print('파이썬이', end=' ')

print('본격적으로', end=' ')

print('시작되었습니다', end=' ')

#출력형식(format)
print('{} and {}'.format('1번','2번') )
print('{1} and {0} and {0}'.format('bb','aaa'))
print('{p1} is {p2}'.format(p1='Life', p2='Egg'))



# %d, %f, %s
# System.out.printf("%d", 123);
print('%d'%123)
print('%.2f' %123.4567)

#10이라는 값을 0번째에, 11.11111이라는 값을 1번째에 소수점 둘째자리까지 출력
print('{0:d},{1:.2f}'.format(10,11.11111))


# 