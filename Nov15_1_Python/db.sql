create table seoul_airs(
	sa_NO number(3) primary key,
	sa_MSRSTE_NM varchar(10 char) not null,
	sa_PM10 number(4, 1) not null,
	sa_PM25 number(4, 1) not null
);

create sequence seoul_airs_seq;
select * from SEOUL_AIRS;
--------------------------------------------------------------
-- �л� : �̸�, ����, �� ������, �߰�����, �⸻����
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
-- ������ : �� ������, ������ ��ġ 
-- 1������ : 7�� ���� ������ 	   / 2������ : 5�� ���� ���� �� 
-- 3������ : 7�� ���� ���� ù��° / 4������ : 8�� ���� / 5������ : 6�� ������
create table classroom(
	classroom varchar2(10 char) primary key,
	location varchar2(20 char) not null
	);
drop table classroom;
	
insert into classroom values('1������','7�� ���� ������');
insert into classroom values('2������','5�� ���� ���� ��');
insert into classroom values('3������','7�� ���� ���� ù��°');
insert into classroom values('4������','8�� ����');
insert into classroom values('5������','6�� ������');

select * from classroom;



