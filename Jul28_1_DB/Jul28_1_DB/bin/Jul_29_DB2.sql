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

insert into store values('AAA��','ȫ����');
insert into store values('BBB��','������');
insert into store values('CCC��','�ű���');
insert into run2 values(run2_seq.nextval, '01012345678','AAA��');
insert into run2 values(run2_seq.nextval, '01088889999','BBB��');
insert into run2 values(run2_seq.nextval, '01010242409','CCC��');
insert into product2 values(product2_seq.nextval, '������', '15000','AAA��');
insert into product2 values(product2_seq.nextval, 'Ŭ��¡��', '8000','BBB��');
insert into product2 values(product2_seq.nextval, '��Ƽ��', '1500','AAA��');
insert into product2 values(product2_seq.nextval, '���콺', '150000','BBB��');
insert into product2 values(product2_seq.nextval, 'Ű����', '350000','AAA��');
insert into product2 values(product2_seq.nextval, '�̾���', '320000','CCC��');
insert into product2 values(product2_seq.nextval, '��ǳ��', '80000','CCC��');
insert into ceo2 values('������', '01012345678', ceo2_seq.nextval);
insert into ceo2 values('������', '01088889999', ceo2_seq.nextval);
insert into ceo2 values('�ٻ���', '01010242409', ceo2_seq.nextval);




-- ��ü ��ǰ��, ���� ��ȸ
select p_name, p_price from PRODUCT2;
-- ��ǰ�� �� � ��� �Ǿ��� ��� ������ ������
select count(*), avg(p_price) from PRODUCT2;
-- ���� ��� ��ǰ�� �����Ϸ��� ��� ������ ���ߵǴ���
select * from STORE where s_name =(select p_s_name from product2 where p_price=(select max(p_price) from PRODUCT2));
-- ���� �� ��ǰ�� �Ĵ� ����� �̸� store, run2, product2
select c_name from ceo where c_number in(
select r_c_number from run2 where r_s_name in(select p_s_name from PRODUCT2 where p_price = (select min(p_price) from PRODUCT2));
-- �ֿ��� �����̸�, ���� ��ġ product, run2,ceo2�� ����
select c_name, s_point from store,run2,ceo2 where s_name=r_s_name and r_c_no = c_no and c_birth = (select max(c_birth) from ceo2);
-- ������ ���� ������ �߰����ߴٴ���


-- ��ü ����� �̸�,��ġ,�����̸�
select * from store, run2, ceo2 where s_name=r_s_name and r_c_number=c_number;
-- ��ü ����� �̸�, ��ġ, �����̸�, ��ǰ, ī�װ� ����->�̰Ǿȳ���
select * from store, ceo2, product2, run2 where p_s_name=s_name and s_name = r_s_name and r_c_number=c_number;

-- C R U D
-- U
-- update ���̺��
-- set �ʵ�� = ��, �ʵ�� = �� ...
--- where ���ǽ�
-- update PRODUCT2 set p_price=5000;
-- �����δ� where ���� ���� 
-- update PRODUCT2 set p_price=555000 where p_name='���콺';

-- ���Ͻ� ��ǰ�� �����

update PRODUCT2 set p_price=0 where p_price(select min(p_price) from PRODUCT2);

-- ������ 10%����
update product set p_price = p_price*0.9 where p_cate='����';
-- ������ �ȳ־���

-- �ֿ����� ����� ��ǰ�� �ݰ����� --> ������ �ȳ־����..�� ��ǰ���� ��ǰ�̸��� Ÿ�� run���� �̵��Ͽ� run�� ��ȭ��ȣ�� Ÿ�� ceo�� �̵��Ͽ� ���� �Է�
update product set p_price=p_price/2 where p_s_name in(select r_s_name from run2 where r_c_number in(
select c_number from ceo where c_birth=(min(c_birth) from ceo2)));


-- D 
-- delete from ���̺��;
--delete from product;
-- 1000�� �̸��� ��ǰ�� �����Ҷ�
--select * from product where p_price <1000;


select*from run2;