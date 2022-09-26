create table sep26_apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_flavor varchar2(10 char) not null,
	a_price number(5) not null,
	a_introduce varchar2(100 char) not null
);

insert into sep26_apple values('충주', '빨강', '단맛', 4000, '충주사과!!!!');
insert into sep26_apple values('충주1', '빨강', '단맛', 4000, '충주사과!!!!');
insert into sep26_apple values('판교', '주황', '달짝지근', 40000, '판교코딩사과!!');
select * from sep26_apple;

)




