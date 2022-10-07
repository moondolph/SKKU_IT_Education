create table oct04_student(
	s_no number(3) primary key,
	s_name varchar2(10 char)not null,
	s_nickname varchar2(10 char) not null
);

create sequence oct04_student_seq;


select * from oct04_student
----------------------------------------------------


create table oct04_test(
	t_title varchar2(20 char) primary key,	
	t_when date not null
);
