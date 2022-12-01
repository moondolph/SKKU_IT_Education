create table seoul_airs(
	sa_NO number(3) primary key,
	sa_MSRSTE_NM varchar(10 char) not null,
	sa_PM10 number(4, 1) not null,
	sa_PM25 number(4, 1) not null
);

create sequence seoul_airs_seq;
select * from SEOUL_AIRS;
--------------------------------------------------------------
-- 학생 : 이름, 생일, 몇 강의장, 중간점수, 기말점수
create table student(
	no number(2) primary key,
	name varchar2(10) not null,
	birthday date not null,
	classroom varchar2(10) not null,
	mid number(10) not null,
	fin number(10) not null
);

create sequence nov15_student_seq;



--------------------------------------------------------------
-- 강의장 : 몇 강의장, 강의장 위치 
-- 1강의장 : 7층 복도 오른쪽 	   / 2강의장 : 5층 복도 왼쪽 끝 
-- 3강의장 : 7층 복도 왼쪽 첫번째 / 4강의장 : 8층 왼쪽 / 5강의장 : 6층 오른쪽
create table classroom(
	classroom varchar2(10 char) primary key,
	location varchar2(20 char) not null
	);
drop table classroom;
	
insert into classroom values('1강의장','7층 복도 오른쪽');
insert into classroom values('2강의장','5층 복도 왼쪽 끝');
insert into classroom values('3강의장','7층 복도 왼쪽 첫번째');
insert into classroom values('4강의장','8층 왼쪽');
insert into classroom values('5강의장','6층 오른쪽');

select * from classroom;



