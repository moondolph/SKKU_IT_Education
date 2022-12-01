create table search_location(
	sl_no number(3) primary key,
	sl_place_name varchar2(30 char) not null,
	sl_phone varchar2(20 char) not null,
	sl_x number(9, 6) not null,
	sl_y number(8, 6) not null
);

create sequence search_location_seq;

select * from search_location;






-- NVL �Լ� : null�϶� ������ ������ ��ġ�ϴ� �Լ� 
-- NVL(��, (����) null�϶� ��ü��))
select nvl(null, '-'), nvl('null','-') from dual;

-- NVL2 �Լ� : null�� ���ο� ���� ������ ������ ��ġ�ϴ� �Լ� 
-- NVL2(��, ���� ���� �� ��ü��, ���� ���� �� ��ü��)
select nvl2(null, 'A', 'B'), nvl2('null', 'A', 'B') from dual;


