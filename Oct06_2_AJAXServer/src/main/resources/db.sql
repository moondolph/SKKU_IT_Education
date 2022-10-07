create table oct06_fruit(
	f_name varchar2(10 char) primary key,
	f_price number(5) not null
);

-- 값 5~6개
insert into OCT06_FRUIT values('포도',3200);
insert into OCT06_FRUIT values('귤',2800);
insert into OCT06_FRUIT values('망고',5500);
insert into OCT06_FRUIT values('레몬',6000);
insert into OCT06_FRUIT values('감',3870);
insert into OCT06_FRUIT values('샤인머스캣',14000);

select * from OCT06_FRUIT;