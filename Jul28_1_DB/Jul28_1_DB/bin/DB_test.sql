--
-- �뷮
--		2: 2bytes	---> ���� 1���� = 1byte / �ѱ� 1���� = 3bytes
--		2char : �� ���� ǥ���� ������ (����� �ѱ��̵� �� ���� ����) 
--�ڷ��� (DB ����Ŀ�� ���� ���ݾ� �ٸ�)
-- ����
--	CHAR(�뷮)
-- 		������ �� �뷮���� ���� ex) char(2char) ��� �ۼ��ϵ� �� ���ڸ�ŭ �Է¹��� / �ϳ��� �Է��ϸ� �ϳ��� ������� �ǹ���
--		����
--		��� �����͵� �ڸ����� �Ȱ�����? 
--
-- varchar
-- 		varchar = varchar2
--		���߿� ������Ʈ �ϸ� varchar�� ���ο� ����� �־�� �Ŷ� varchar2�� ����(������ �������ʵ���) �׷��� varchar2�� �츮�� ����ҵ���
--
-- VARCHAR2(�뷮)
--		�뷮���� -> �뷮 ����
--		����
-- ����
-- number(�뷮)
-- number(3) : ���� 3�ڸ�
-- number(3,2) : �Ǽ��� �ǹ� : 1.32
-- 		 (��ü, �Ҽ�������)
-- ��¥
-- date
--
-- ���̺� �����
-- create table ���̺��(
--	�ʵ�� �ڷ��� �ɼ�,	
--	�ʵ�� �ڷ��� �ɼ�,	
--	�ʵ�� �ڷ��� �ɼ�,	
--	�ʵ�� �ڷ��� �ɼ�
--);

-- ���̺� �����ϱ� -> ���� ������ (���� ����ʿ䰡 ������?)
-- ���̺� �����
--  drop table ���̺�� cascade constraint purge; -> �ٷ� ����
--  drop table ���̺��; -> ������ �뿡 �ִ� ����?

-- �ɼ� 
--  not null : ���� �ݵ�� �־����
-- primary key : �����͸� ã���� ������ �Ǵ� ��
-- primary key�� not null�̾�� �ϸ�, �ߺ��� �� �� ����
	


-- ���� -> ���� -> alt + x �巡��? ����ߵǴµ�?

drop table jul_28_student cascade constraint purge;

create table jul_28_student(
	s_no number(3) primary key,
	s_name varchar2(10char) not null,
	s_age number(3) not null,
	s_home varchar2(10char) not null
);

-- ���� ���� : Ŀ�� �ΰ� -> alt + s
select * from jul_28_student;

-- crud
-- ������ �����(c)
--insert into ���̺��(�ʵ��,�ʵ��) values(��,��)

-- sequence �����
-- sequence �� table �� ���谡 �ϳ��� ���� �������� ����
--create sequence ��������;
-- �ٸ� ���̺����� ��밡��
-- �ٵ� insert�� �����ص� �ö�
create sequence student_seq;

insert into jul_28_student values(student_seq.nextval,'�����1',43,'��õ');
insert into jul_28_student values(student_seq.nextval,'�����2',56,'���');
insert into jul_28_student values(student_seq.nextval,'�����3',41,'����');
insert into jul_28_student values(student_seq.nextval,'�����4',28,'����');
-- ���⼭ �������� 4���� ���Ǿ��µ� ���� �ٸ����� ���� 5���� ���


--insert into jul_28_student(s_name,s_age,s_home) values('�̸�',30,'��');
--insert into jul_28_student(s_name,s_age,s_home) values('�����1',24,'����');
--insert into jul_28_student(s_name,s_age,s_home) values('�����2',26,'����');
--insert into jul_28_student(s_name,s_age,s_home) values('�����3',19,'����');
insert into jul_28_student values(1,'�����1',30,'��õ');
insert into jul_28_student values(2,'�����2',34,'���');
insert into jul_28_student values(3,'�����3',50,'����');
insert into jul_28_student values(4,'�����4',22,'�λ�');

--insert into jul_28_student(s_name,s_home) values('�����3','����');
insert into jul_28_student values('����',29,'����') -- not null�� �����Ǿ ���̺��(�ʵ��) ������ �����ϴ�
select * from jul_28_student;






drop table product cascade constraint purge;

create table product (
	p_name varchar2(10char) primary key,
	p_price number(7) not null,
	p_weight number(5,2) not null
);


insert into product values('�Ұ��',326000,450.50);
insert into product values('�������',136000,450.50);
insert into product values('�߰��',96000,450.50);
insert into product values('����',196000,450.50);

select * from product;


create table human(
	h_name varchar2(10char) not null,
	h_weight number(5,2) not null,
	h_height number(5,2) not null,
	h_phonenum char(11) primary key
);
select * from human;
create sequence human_seq;

insert into human values('�����1',080.25,180.50,'01012345678');
insert into human values('�����2',104.50,185.50,'01056783444');
insert into human values('�����3',047.55,170.50,'01090909123');
select * from human;
drop table human cascade constraint purge;
-- �̷��� �����̸Ӹ� Ű �ϳ��ϳ��� �Է�? �ϴ°� �³�?
-- ���� ����ȣ�� ������ �´°Ű����� �׳� ���п� ��ȣ�� ������ ���� ������ human_seq.nextval�� ����ϸ� �ȴ�.
-- ���� �����ҰŸ� ������ ���� �ڸ��� �־����.

-- �̸� ���� ���� �� ��ǰ���ִµ� �׷��� ���ݿ� ���Ͽ�


-- ���� �ð� ��¥ : sysdate
create table human(
	h_no number(2) primary key,
	h_name varchar2(10char) not null,
	h_birthday date not null,
	h_weight number(4,1) not null,
	h_height number(4,1) not null
);
select * from human;
create sequence human_seq;
insert into human values( human_seq.nextval,'�����1',sysdate,080.5,180.5);

-- Ư���ð���¥ : to_date("��¥", "����") -> YYYY MM DD HH24 MI SS

insert into human values( human_seq.nextval,'�����1',to_date('1999.02.25','yyyy-mm-dd'),080.5,180.5);
insert into human values( human_seq.nextval,'�����3',to_date('99.12.25','yy-mm-dd'),60.5,185.5);
select h_name, h_weight from human;
select h_name, h_height/100 as m from human;

-- ��ǰ ��հ� product
select avg(p_price) from product;
select sum(p_price), max(p_price), min(p_price), count(p_price) from product;



-- ǥ��ü�� ��� (Ű-100) * 0.9

select h_name,h_weight, (h_height-100)*0.9 as ǥ��ü�� from human;


create table snack2 (
s_no number(2) primary key,
s_name varchar2(7char) not null,
s_shelflife date not null,
s_price number(5) not null,
s_weight number(4,1) not null);

select * from snack2;
create sequence snack2_seq;
insert into snack2 values(snacker_seq.nextval,'����', to_date('2099-09-30','YYYY-MM-DD'), 6400, 400.5);
insert into snack2 values(snacker_seq.nextval,'������', to_date('2022.10.15','yyyy-mm-dd'), 46400, 840.0);
insert into snack2 values(snacker_seq.nextval,'����Ĩ', to_date('2040.01.15','yyyy-mm-dd'), 7800, 500.5);

select avg(s_price) from snack2;

select min(s_price/s_weight) from snack2;

select count(*) from snack2;

-- ���� ������ �ȵǴ� ������ ��ü ����
select * from snack2 where s_shelflife<sysdate;

-- ���ϸԾ �Ǵ°�
select * from snack2 where s_shelflife>sysdate+1;					 
select * from snack2 where s_shelflife>= to_date(concat(to_char(sysdate,'YYYY-MM-DD'),' 23:59:59'), 'YYYY-MM-DD HH24:MI:SS');
select sysdate+1 from snack2;
-- to_date('����', '����') : ���� -> ����
-- to_char('��¥', '����') : ��¥ -> ����
-- concat('����','����') : ���ڱ���

-- to_char(sysdate,'yyyy-mm-dd') => '2022-07-28'
-- concat(	, ' 23:59:59') : '2022-07-28 23:59:59'
-- to_date(	, 'yyyy-mm-dd hh24:mi:ss') : 2022-07-28 23:59:59

-- �ְ� ���� �̸�, ���� ���
select s_name, s_price from snack2 where s_price = max(s_price);
-- �ɱ� �ȵɱ�? -> �ȵ�
-- subquery
--		min, max --> ����Լ� -> select ������ ��밡���ؼ�
-- 		���ǿ��� ����Լ��� ����ϰ� ������ subquery�� �̿�
select s_name, s_price from snack2 where s_price = (select max(s_price) from snack2);
												

-- ��հ� ���� ��� ���� �̸�, ����
select s_name, s_price from snack2 where s_price >= (select avg(s_price) from snack2);
-- �ּҰ� ������ g�� ����
select s_price/s_weight as �ּҰ� from snack2 where s_price= (select min(s_price) from snack2);
-- g�� ���� ��� ���� �̸�, ����

select s_name, s_price, s_price/s_weight as �ְ� from snack2 where s_price/s_weight =(select max(s_price/s_weight) from snack2);

drop table snack2 cascade constraint purge;



-- database
--	RDBMS : ���̺� ������ ����
-- 
--	oracle, mysql, mariadb