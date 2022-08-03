create table store(
	s_name varchar2(10char) primary key,
	s_point varchar2(10char) not null
);
create sequence store_seq;
drop table store cascade constraint purge;

create table run2(
	r_no number(2) primary key,
	r_c_number number(11) not null,
	r_s_name varchar2(10char) not null
);
create sequence run2_seq;
drop table run2 cascade constraint purge;
create table product2(
	p_no number(2) primary key,
	p_name varchar2(10char) not null,
	p_price number(6) not null,
	p_s_name varchar2(10char) not null
);
drop table product2 cascade constraint purge;
create sequence product2_seq;

create table ceo2(
	c_name varchar2(7char) not null,
	c_number number(11) not null,
	c_no number(2) primary key
);
create sequence ceo2_seq;

insert into store values('AAA샵','홍대점');
insert into store values('BBB샵','서연점');
insert into store values('CCC샵','신길점');
insert into run2 values(run2_seq.nextval, '01012345678','AAA샵');
insert into run2 values(run2_seq.nextval, '01088889999','BBB샵');
insert into run2 values(run2_seq.nextval, '01010242409','CCC샵');
insert into product2 values(product2_seq.nextval, '충전기', '15000','AAA샵');
insert into product2 values(product2_seq.nextval, '클랜징폼', '8000','BBB샵');
insert into product2 values(product2_seq.nextval, '물티슈', '1500','AAA샵');
insert into product2 values(product2_seq.nextval, '마우스', '150000','BBB샵');
insert into product2 values(product2_seq.nextval, '키보드', '350000','AAA샵');
insert into product2 values(product2_seq.nextval, '이어폰', '320000','CCC샵');
insert into product2 values(product2_seq.nextval, '선풍기', '80000','CCC샵');
insert into ceo2 values('가사장', '01012345678', ceo2_seq.nextval);
insert into ceo2 values('나사장', '01088889999', ceo2_seq.nextval);
insert into ceo2 values('다사장', '01010242409', ceo2_seq.nextval);




-- 전체 상품명, 가격 조회
select p_name, p_price from PRODUCT2;
-- 상품이 총 몇개 등록 되었고 평균 가격은 얼마인지
select count(*), avg(p_price) from PRODUCT2;
-- 제일 비싼 상품을 구매하려면 어느 스토어로 가야되는지
select * from STORE where s_name =(select p_s_name from product2 where p_price=(select max(p_price) from PRODUCT2));
-- 제일 싼 상품을 파는 사장님 이름 store, run2, product2
select c_name from ceo where c_number in(
select r_c_number from run2 where r_s_name in(select p_s_name from PRODUCT2 where p_price = (select min(p_price) from PRODUCT2));
-- 최연소 사장이름, 가게 위치 product, run2,ceo2가 연결
select c_name, s_point from store,run2,ceo2 where s_name=r_s_name and r_c_no = c_no and c_birth = (select max(c_birth) from ceo2);
-- 문제는 내가 생일을 추가안했다는점


-- 전체 스토어 이름,위치,사장이름
select * from store, run2, ceo2 where s_name=r_s_name and r_c_number=c_number;
-- 전체 스토어 이름, 위치, 사장이름, 상품, 카테고리 가격->이건안넣음
select * from store, ceo2, product2, run2 where p_s_name=s_name and s_name = r_s_name and r_c_number=c_number;

-- C R U D
-- U
-- update 테이블명
-- set 필드명 = 값, 필드명 = 값 ...
--- where 조건식
-- update PRODUCT2 set p_price=5000;
-- 실제로는 where 절이 들어옴 
-- update PRODUCT2 set p_price=555000 where p_name='마우스';

-- 제일싼 제품을 무료로

update PRODUCT2 set p_price=0 where p_price(select min(p_price) from PRODUCT2);

-- 문구류 10%할인
update product set p_price = p_price*0.9 where p_cate='문구';
-- 문구류 안넣었음

-- 최연장자 스토어 상품을 반값으로 --> 생일을 안넣어뒀음..ㅎ 상품에서 상품이름을 타고 run으로 이동하여 run의 전화번호를 타고 ceo로 이동하여 생일 입력
update product set p_price=p_price/2 where p_s_name in(select r_s_name from run2 where r_c_number in(
select c_number from ceo where c_birth=(min(c_birth) from ceo2)));


-- D 
-- delete from 테이블명;
--delete from product;
-- 1000원 미만의 상품을 삭제할때
--select * from product where p_price <1000;


select*from run2;