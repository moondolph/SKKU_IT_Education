create table sep26_apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_flavor varchar2(10 char) not null,
	a_price number(5) not null,
	a_introduce varchar2(100 char) not null
);

insert into sep26_apple values('����', '����', '�ܸ�', 4000, '���ֻ��!!!!');
insert into sep26_apple values('����1', '����', '�ܸ�', 4000, '���ֻ��!!!!');
insert into sep26_apple values('�Ǳ�', '��Ȳ', '��¦����', 40000, '�Ǳ��ڵ����!!');
select * from sep26_apple;

)




