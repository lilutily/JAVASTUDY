-- �Ĵ� ���������� ����
-- �Ĵ�����/ �޴�����
-- 	   1 : n
-- �Ĵ����� / ��������
-- 	   m : n
-- ������, ��ġ, ��ȣ, ���̺� ����, �޴�, ����
-- �����, ������, 02-9090-1112, 15 ���̺�, ���, 3000��
-- �����, ������, 031-288-8898, 10 ���̺�, ������, 4500��
-- �쵿��, ������, 031-445-1234, 8 ���̺�, �쵿, 4000��

-- ���̺�� �����
-- �Ĵ��, ������, ����ó, ���̺�, �޴���, ����

-- �ߺ��� ������ ���� ������ ������ ��� ���̺��� �����ش�
-- �׷��� ���� ���      (�Ĵ��, ������, ����ó, ���̺�)       (�޴���, ����)
-- �̷� �������� ���ְ� 

-- (������, ��ġ, ��ȣ, ���̺� ����), (�޴�, ����), (������, ����, ��°�) -> primary key �������� ������ ��ȣ�ϳ� �߰�

-- �����, ������, 02-9090-1112, 15 ���̺�, ���, 3000��, ����1, 30, ����
-- �����, ȫ����, 02-9090-1114, 15 ���̺�, ���, 3000��, ����1, 30, ����
-- �����, ������, 031-288-8898, 10 ���̺�, ������, 4500��, ����2, 46, ����
-- �쵿��, ������, 031-445-1234, 8 ���̺�, �쵿, 4000��, ����3, 30, ����
-- �쵿��, ������, 031-445-1234, 8 ���̺�, �쵿, 4000��, ����4, 50, ����

-- �ٸ� �̷��� ���̺��� 3���� ������ ���� �������ִ°��� ���ڿ�������
-- �׷��� ����̺��� �ϳ� ����� (�����ȣ, �Ĵ��ȣ) -> primary key �־���

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
-- drop sequence ������ ��;
insert into restuarant values(restuarant_seq.nextval, '�����','������',0212345678, 10);
insert into restuarant values(restuarant_seq.nextval, '�����','ȫ����',0212335578, 15);
insert into restuarant values(restuarant_seq.nextval, '�쵿��','������',0312345678, 30);
insert into menu values(menu_seq.nextval,'���',3000,1);
insert into menu values(menu_seq.nextval,'���',3000,2);
insert into menu values(menu_seq.nextval,'���',2500,3);
insert into menu values(menu_seq.nextval,'�쵿',4000,3);
insert into menu values(menu_seq.nextval,'�쵿��Ʈ',6000,3);
insert into menu values(menu_seq.nextval,'ġ����',4000,1);
insert into menu values(menu_seq.nextval,'Ƣ����',5000,2);


-- �Ĵ��� �����
select count(r_name) from restuarant;
-- �޴� ���̺� �쵿 �̶�� ���ڰ� �� �޴����� ��հ���
select avg(m_price) from menu where m_name like '%�쵿%';
-- ���̺��� ���� ���� ��������� �̸�, ������
select r_name, r_point from restuarant where r_table= (select max(r_table) from restuarant);
--�����, �������� �޴���,���� -> ��������
select m_name, m_price from menu where m_r_no= (select r_no from restuarant where r_name='�����' and r_point='������');
-- ���� ��� �޴��� �Ĵ� �Ĵ��, ������
select r_name, r_point from restuarant where r_no = (select m_r_no from menu where m_price = (select max(m_price) from menu));
-- ���̺��� ���� ���� ���� �޴���, ����
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

insert into ceo values(ceo_seq.nextval,'�̻���', to_date('1988-12-12', 'yyyy-mm-dd'), '�Ⱦ�');
insert into ceo values(ceo_seq.nextval,'�����', to_date('1995-02-22', 'yyyy-mm-dd'), '����');
insert into ceo values(ceo_seq.nextval,'������', to_date('1999-09-15', 'yyyy-mm-dd'), '����');
insert into ceo values(ceo_seq.nextval,'������', to_date('1978-07-14', 'yyyy-mm-dd'), 'ȫ��');

select * from ceo;

insert into run values(run_seq.nextval,4,3);
insert into run values(run_seq.nextval,2,1);
insert into run values(run_seq.nextval,1,1);
insert into run values(run_seq.nextval,3,1);

select * from run;

-- ����� �������� ��ϴ� ���� �̸��� ���� ���
select c_name, c_home from ceo where c_no = (select r_r_no from run where r_no= (select r_no from restuarant where r_name='�����' and r_point='������'));
-- �ֿ����ڰ� ��ϴ� �Ĵ� �̸�, ������ ���
select r_name,r_point from restuarant where r_no in(select r_r_no from run where r_c_no in(select c_no from ceo where c_birthday = (select min(c_birthday) from ceo)));
-- �ֿ����ڰ� ��ϴ� �Ĵ� �޴��� ������ ���
select m_name, m_price from menu where m_r_no=(select r_r_no from run where r_c_no = (select c_no from ceo where c_birthday = (select max(c_birthday) from ceo)));

-- �Ĵ��, ������, �޴���, ����
--select r_name,r_point,m_name,m_price from restuarant, menu;
-- �̷��� �Է��ϸ� ��� ��츦 �� ���ؼ� �����µ�
--select*from restuarant, menu where r_no = m_r_no;
-- join
-- ��� ����� ���� �� �ٿ��� ����� ����, �� �߿� ���ǿ� �´°͵鸸 ����ؾ� �ϴ� ��Ȳ�϶� ����Ѵ�

select r_name,r_point, m_name, m_price from restuarant, menu where r_no = m_r_no;
--�ֿ����� ���� �̸�,����,�Ĵ��ȣ, �Ĵ��̸�
select * from restuarant,run,ceo where restuarant.r_no=r_c_no and r_c_no=c_no;

--select c_name, c_birthday, r_no, r_name from restuarant, ceo,run where c_birthday = (select min(c_birthday) from ceo) and where restuarant.r_no=r_c_no and r_c_no=c_no;

-- �����̸�, �Ĵ��, ������, �޴���, ������ ���
-- �� �޴������� ��� �̸��� �͵鸸
select c_name, r_name,r_point,m_name,m_price from restuarant, ceo, menu, run 
where restuarant.r_no = m_r_no and restuarant.r_no = r_r_no and c_no = r_c_no and m_price < (select avg(m_price) from menu);

select c_name, r_name,r_point,m_name,m_price from restuarant, ceo, menu, run where m_r_no = restuarant.r_no and restuarant.r_no = r_r_no and r_c_no = c_no and m_price < (select avg(m_price) from menu);
-- �� ��������ϸ�ȵǴ°�?









