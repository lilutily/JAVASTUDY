--
-- 용량
--		2: 2bytes	---> 영어 1글자 = 1byte / 한글 1글자 = 3bytes
--		2char : 두 글자 표현이 가능함 (영어든 한글이든 두 글자 가능) 
--자료형 (DB 메이커들 마다 조금씩 다름)
-- 글자
--	CHAR(용량)
-- 		무조건 그 용량으로 저장 ex) char(2char) 어떻게 작성하든 두 글자만큼 입력받음 / 하나만 입력하면 하나는 띄워쓰기 되버림
--		빠름
--		모든 데이터들 자리수가 똑같으면? 
--
-- varchar
-- 		varchar = varchar2
--		나중에 업데이트 하면 varchar에 새로운 기능을 넣어둘 거라 varchar2를 만듬(문제가 생기지않도록) 그래서 varchar2를 우리는 사용할듯함
--
-- VARCHAR2(용량)
--		용량조절 -> 용량 절약
--		느림
-- 숫자
-- number(용량)
-- number(3) : 정수 3자리
-- number(3,2) : 실수를 의미 : 1.32
-- 		 (전체, 소수점이하)
-- 날짜
-- date
--
-- 테이블 만들기
-- create table 테이블명(
--	필드명 자료형 옵션,	
--	필드명 자료형 옵션,	
--	필드명 자료형 옵션,	
--	필드명 자료형 옵션
--);

-- 테이블 수정하기 -> 거의 사용안함 (딱히 배울필요가 있을까?)
-- 테이블 지우기
--  drop table 테이블명 cascade constraint purge; -> 바로 삭제
--  drop table 테이블명; -> 쓰레기 통에 넣는 느낌?

-- 옵션 
--  not null : 값이 반드시 있어야함
-- primary key : 데이터를 찾을때 기준이 되는 값
-- primary key는 not null이어야 하며, 중복이 될 수 없다
	


-- 선택 -> 실행 -> alt + x 드래그? 해줘야되는듯?

drop table jul_28_student cascade constraint purge;

create table jul_28_student(
	s_no number(3) primary key,
	s_name varchar2(10char) not null,
	s_age number(3) not null,
	s_home varchar2(10char) not null
);

-- 한줄 실행 : 커서 두고 -> alt + s
select * from jul_28_student;

-- crud
-- 데이터 만들기(c)
--insert into 테이블명(필드명,필드명) values(값,값)

-- sequence 만들기
-- sequence 는 table 과 관계가 하나도 없는 독립적인 존재
--create sequence 시퀀스명;
-- 다른 테이블에서도 사용가능
-- 근데 insert에 실패해도 올라감
create sequence student_seq;

insert into jul_28_student values(student_seq.nextval,'사용자1',43,'인천');
insert into jul_28_student values(student_seq.nextval,'사용자2',56,'경기');
insert into jul_28_student values(student_seq.nextval,'사용자3',41,'서울');
insert into jul_28_student values(student_seq.nextval,'사용자4',28,'부평');
-- 여기서 시퀀스가 4까지 사용되었는데 만약 다른곳에 쓰면 5부터 출력


--insert into jul_28_student(s_name,s_age,s_home) values('이름',30,'집');
--insert into jul_28_student(s_name,s_age,s_home) values('사용자1',24,'용인');
--insert into jul_28_student(s_name,s_age,s_home) values('사용자2',26,'강남');
--insert into jul_28_student(s_name,s_age,s_home) values('사용자3',19,'부평');
insert into jul_28_student values(1,'사용자1',30,'인천');
insert into jul_28_student values(2,'사용자2',34,'경기');
insert into jul_28_student values(3,'사용자3',50,'서울');
insert into jul_28_student values(4,'사용자4',22,'부산');

--insert into jul_28_student(s_name,s_home) values('사용자3','부평');
insert into jul_28_student values('랄로',29,'김해') -- not null로 형성되어서 테이블명(필드명) 생략이 가능하다
select * from jul_28_student;






drop table product cascade constraint purge;

create table product (
	p_name varchar2(10char) primary key,
	p_price number(7) not null,
	p_weight number(5,2) not null
);


insert into product values('소고기',326000,450.50);
insert into product values('돼지고기',136000,450.50);
insert into product values('닭고기',96000,450.50);
insert into product values('양고기',196000,450.50);

select * from product;


create table human(
	h_name varchar2(10char) not null,
	h_weight number(5,2) not null,
	h_height number(5,2) not null,
	h_phonenum char(11) primary key
);
select * from human;
create sequence human_seq;

insert into human values('사용자1',080.25,180.50,'01012345678');
insert into human values('사용자2',104.50,185.50,'01056783444');
insert into human values('사용자3',047.55,170.50,'01090909123');
select * from human;
drop table human cascade constraint purge;
-- 이렇게 프라이머리 키 하나하나다 입력? 하는게 맞나?
-- 만약 폰번호를 줬으면 맞는거같은데 그냥 구분용 번호를 줬으면 위에 선언한 human_seq.nextval을 사용하면 된다.
-- 만약 수정할거면 전번이 적힌 자리에 넣어두자.

-- 이름 무게 가격 의 상품이있는데 그램당 가격에 대하여


-- 현재 시간 날짜 : sysdate
create table human(
	h_no number(2) primary key,
	h_name varchar2(10char) not null,
	h_birthday date not null,
	h_weight number(4,1) not null,
	h_height number(4,1) not null
);
select * from human;
create sequence human_seq;
insert into human values( human_seq.nextval,'사용자1',sysdate,080.5,180.5);

-- 특정시간날짜 : to_date("날짜", "패턴") -> YYYY MM DD HH24 MI SS

insert into human values( human_seq.nextval,'사용자1',to_date('1999.02.25','yyyy-mm-dd'),080.5,180.5);
insert into human values( human_seq.nextval,'사용자3',to_date('99.12.25','yy-mm-dd'),60.5,185.5);
select h_name, h_weight from human;
select h_name, h_height/100 as m from human;

-- 상품 평균가 product
select avg(p_price) from product;
select sum(p_price), max(p_price), min(p_price), count(p_price) from product;



-- 표준체중 평균 (키-100) * 0.9

select h_name,h_weight, (h_height-100)*0.9 as 표준체중 from human;


create table snack2 (
s_no number(2) primary key,
s_name varchar2(7char) not null,
s_shelflife date not null,
s_price number(5) not null,
s_weight number(4,1) not null);

select * from snack2;
create sequence snack2_seq;
insert into snack2 values(snacker_seq.nextval,'미쯔', to_date('2099-09-30','YYYY-MM-DD'), 6400, 400.5);
insert into snack2 values(snacker_seq.nextval,'다이제', to_date('2022.10.15','yyyy-mm-dd'), 46400, 840.0);
insert into snack2 values(snacker_seq.nextval,'초코칩', to_date('2040.01.15','yyyy-mm-dd'), 7800, 500.5);

select avg(s_price) from snack2;

select min(s_price/s_weight) from snack2;

select count(*) from snack2;

-- 지금 먹으면 안되는 과자의 전체 정보
select * from snack2 where s_shelflife<sysdate;

-- 내일먹어도 되는거
select * from snack2 where s_shelflife>sysdate+1;					 
select * from snack2 where s_shelflife>= to_date(concat(to_char(sysdate,'YYYY-MM-DD'),' 23:59:59'), 'YYYY-MM-DD HH24:MI:SS');
select sysdate+1 from snack2;
-- to_date('글자', '페턴') : 글자 -> 패턴
-- to_char('날짜', '패턴') : 날짜 -> 글자
-- concat('글자','글자') : 글자글자

-- to_char(sysdate,'yyyy-mm-dd') => '2022-07-28'
-- concat(	, ' 23:59:59') : '2022-07-28 23:59:59'
-- to_date(	, 'yyyy-mm-dd hh24:mi:ss') : 2022-07-28 23:59:59

-- 최고가 과자 이름, 가격 출력
select s_name, s_price from snack2 where s_price = max(s_price);
-- 될까 안될까? -> 안됨
-- subquery
--		min, max --> 통계함수 -> select 절에만 사용가능해서
-- 		조건에서 통계함수를 사용하고 싶으면 subquery만 이용
select s_name, s_price from snack2 where s_price = (select max(s_price) from snack2);
												

-- 평균가 보다 비싼 과자 이름, 가격
select s_name, s_price from snack2 where s_price >= (select avg(s_price) from snack2);
-- 최소가 과자의 g당 가격
select s_price/s_weight as 최소가 from snack2 where s_price= (select min(s_price) from snack2);
-- g당 가장 비싼 과자 이름, 가격

select s_name, s_price, s_price/s_weight as 최고가 from snack2 where s_price/s_weight =(select max(s_price/s_weight) from snack2);

drop table snack2 cascade constraint purge;



-- database
--	RDBMS : 테이블 나눠서 설계
-- 
--	oracle, mysql, mariadb