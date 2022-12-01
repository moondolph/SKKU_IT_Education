create table nov14_weather(
	wt_no number(3) primary key,
	wt_hour varchar2(10 char) not null,
	wt_temp varchar2(10 char) not null,
	wt_tmx varchar2(10 char) not null,
	wt_tmn varchar2(10 char) not null
);

create sequence nov14_weather_seq;

select * from nov14_weather	 --테이블 조회
