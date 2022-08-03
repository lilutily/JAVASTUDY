-- 식당 프랜차이즈 관리
-- 식당정보/ 메뉴정보
-- 	   1 : n
-- 식당정보 / 사장정보
-- 	   m : n
-- 음식점, 위치, 번호, 테이블 개수, 메뉴, 가격
-- 라면집, 강남점, 02-9090-1112, 15 테이블, 라면, 3000원
-- 김밥집, 기흥점, 031-288-8898, 10 테이블, 돈까스김밥, 4500원
-- 우동집, 동백점, 031-445-1234, 8 테이블, 우동, 4000원

-- 테이블로 만들면
-- 식당명, 지점명, 연락처, 테이블, 메뉴명, 가격

-- 중복된 데이터 들이 많으면 기준을 잡아 테이블을 나눠준다
-- 그러면 예를 들어      (식당명, 지점명, 연락처, 테이블)       (메뉴명, 가격)
-- 이런 느낌으로 해주고 

-- (음식점, 위치, 번호, 테이블 개수), (메뉴, 가격), (주인장, 나이, 사는곳) -> primary key 넣을곳이 없으니 번호하나 추가

-- 라면집, 강남점, 02-9090-1112, 15 테이블, 라면, 3000원, 주인1, 30, 서울
-- 라면집, 홍대점, 02-9090-1114, 15 테이블, 라면, 3000원, 주인1, 30, 서울
-- 김밥집, 기흥점, 031-288-8898, 10 테이블, 돈까스김밥, 4500원, 주인2, 46, 기흥
-- 우동집, 동백점, 031-445-1234, 8 테이블, 우동, 4000원, 주인3, 30, 동백
-- 우동집, 동백점, 031-445-1234, 8 테이블, 우동, 4000원, 주인4, 50, 동백

-- 다만 이렇게 테이블을 3개로 나눠서 서로 연결해주는것은 부자연스러움
-- 그래서 운영테이블을 하나 만들고 (사장번호, 식당번호) -> primary key 넣어줌

create table restuarant (
	r_no number(2) primary key,
	r_name varchar2(15char) not null,
	r_point varchar2(12char) not null,
	r_number number(11) not null,
	r_table number(2) not null
);
select * from restuarant;
create sequence restuarant_seq;

create table menu(
	m_no number(2) primary key,
	m_name varchar2(10char) not null,
	m_price number(5) not null,
	m_r_no number(2) not null
);
select * from menu;
create sequence menu_seq;
-- drop sequence 시퀸스 명;
insert into restuarant values(restuarant_seq.nextval, '라면집','강남점',0212345678, 10);
insert into restuarant values(restuarant_seq.nextval, '라면집','홍대점',0212335578, 15);
insert into restuarant values(restuarant_seq.nextval, '우동집','동백점',0312345678, 30);
insert into menu values(menu_seq.nextval,'라면',3000,1);
insert into menu values(menu_seq.nextval,'라면',3000,2);
insert into menu values(menu_seq.nextval,'라면',2500,3);
insert into menu values(menu_seq.nextval,'우동',4000,3);
insert into menu values(menu_seq.nextval,'우동세트',6000,3);
insert into menu values(menu_seq.nextval,'치즈라면',4000,1);
insert into menu values(menu_seq.nextval,'튀김라면',5000,2);


-- 식당이 몇개인지
select count(r_name) from restuarant;
-- 메뉴 테이블에 우동 이라는 글자가 들어간 메뉴들의 평균가격
select avg(m_price) from menu where m_name like '%우동%';
-- 테이블의 제일 많은 레스토랑의 이름, 지점명
select r_name, r_point from restuarant where r_table= (select max(r_table) from restuarant);
--라면집, 강남점의 메뉴명,가격 -> 서브쿼리
select m_name, m_price from menu where m_r_no= (select r_no from restuarant where r_name='라면집' and r_point='강남점');
-- 제일 비싼 메뉴를 파는 식당명, 지점면
select r_name, r_point from restuarant where r_no = (select m_r_no from menu where m_price = (select max(m_price) from menu));
-- 테이블이 제일 적은 매장 메뉴명, 가격
select m_name, m_price from menu where m_r_no = (select r_no from restuarant where r_table =(select min(r_table) from restuarant));





create table ceo(
	c_no number(2) primary key,
	c_name varchar2(10char) not null,
	c_birthday date not null,
	c_home varchar2(15char) not null
);

create sequence ceo_seq;

create table run (
	r_no number(2) primary key,
	r_c_no number(2) not null,
	r_r_no number(2) not null
);
create sequence run_seq;

insert into ceo values(ceo_seq.nextval,'이사장', to_date('1988-12-12', 'yyyy-mm-dd'), '안양');
insert into ceo values(ceo_seq.nextval,'김사장', to_date('1995-02-22', 'yyyy-mm-dd'), '강남');
insert into ceo values(ceo_seq.nextval,'강사장', to_date('1999-09-15', 'yyyy-mm-dd'), '동백');
insert into ceo values(ceo_seq.nextval,'서사장', to_date('1978-07-14', 'yyyy-mm-dd'), '홍대');

select * from ceo;

insert into run values(run_seq.nextval,4,3);
insert into run values(run_seq.nextval,2,1);
insert into run values(run_seq.nextval,1,1);
insert into run values(run_seq.nextval,3,1);

select * from run;

-- 라면집 강남점을 운영하는 사장 이름과 집을 출력
select c_name, c_home from ceo where c_no = (select r_r_no from run where r_no= (select r_no from restuarant where r_name='라면집' and r_point='강남점'));
-- 최연장자가 운영하는 식당 이름, 지점을 출력
select r_name,r_point from restuarant where r_no in(select r_r_no from run where r_c_no in(select c_no from ceo where c_birthday = (select min(c_birthday) from ceo)));
-- 최연소자가 운영하는 식당 메뉴명 가격을 출력
select m_name, m_price from menu where m_r_no=(select r_r_no from run where r_c_no = (select c_no from ceo where c_birthday = (select max(c_birthday) from ceo)));

-- 식당명, 지점명, 메뉴명, 가격
--select r_name,r_point,m_name,m_price from restuarant, menu;
-- 이렇게 입력하면 모든 경우를 다 곱해서 나오는듯
--select*from restuarant, menu where r_no = m_r_no;
-- join
-- 모든 경우의 수을 다 붙여서 만들어 놓고, 그 중에 조건에 맞는것들만 출력해야 하는 상황일때 사용한다

select r_name,r_point, m_name, m_price from restuarant, menu where r_no = m_r_no;
--최연장자 사장 이름,생일,식당번호, 식당이름
select * from restuarant,run,ceo where restuarant.r_no=r_c_no and r_c_no=c_no;

--select c_name, c_birthday, r_no, r_name from restuarant, ceo,run where c_birthday = (select min(c_birthday) from ceo) and where restuarant.r_no=r_c_no and r_c_no=c_no;

-- 사장이름, 식당명, 지점명, 메뉴명, 가격을 출력
-- 단 메뉴가격은 평균 미만인 것들만
select c_name, r_name,r_point,m_name,m_price from restuarant, ceo, menu, run 
where restuarant.r_no = m_r_no and restuarant.r_no = r_r_no and c_no = r_c_no and m_price < (select avg(m_price) from menu);

select c_name, r_name,r_point,m_name,m_price from restuarant, ceo, menu, run where m_r_no = restuarant.r_no and restuarant.r_no = r_r_no and r_c_no = c_no and m_price < (select avg(m_price) from menu);
-- 왜 띄워쓰기하면안되는거?









