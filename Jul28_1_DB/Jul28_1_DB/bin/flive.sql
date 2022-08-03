create table live(
	l_msrdt date not null,
	l_msrste_nm varchar2(10char) primary key,
	l_idex_nm varchar2(5char) not null,
	l_idex_mvl number(3) not null
);
create table live2(
	l_msrdt varchar2(20char) not null,
	l_msrste_nm varchar2(10char) primary key,
	l_idex_nm varchar2(5char) not null,
	l_idex_mvl number(3) not null
);
select * from live2;
drop table live2;