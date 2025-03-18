#1. rdb : 관계형 데이터베이스 - 테이블(Entity)들의 관계(relationship) 외래키(Attribute)
#2. 데이터베이스 언어
#	정의어 DDL - create, alter, drop
#	조작어 DML - insert, select, update, delete - crud
#	제어어 DCL - grant, revoke
#실습2) update
/*	update	테이블명
	set		필드1 = 값1, 필드2=값2
    where	조건
*/

create table userinfo(
	no int not null auto_increment primary key,
    name varchar(100) not null,
    age int not null
);
use userinfo;
desc userinfo;
insert into userinfo values (1, 'first', 11);
insert into userinfo values (2, 'second', 22);
insert into userinfo values (3, 'third', 33);
select	* from userinfo;

insert into userinfo (name, age) values ('fourth', 44);
# Error code: 1366. Incorrect integer value: 'second' for column 'no' at row 1 0.000 sec

#2-1. 전체 데이터 수정
set sql_safe_updates=0;	# --error code 1175
update userinfo set age=0;
select * from userinfo;

#2-2. 다수의 데이터 변경
update userinfo set age=11 where no=1;
update userinfo set age=22, name='two' where no=2;
update userinfo set name='second' where no=2 and age=22;

/* - no가 3이고 age가 10인  유저의 이름을 'third' , 나이를 33살로 수정합니다.
- no가 4이고 name 'first'인  유저의 이름을 'fourth' , 나이를 44살로 수정합니다. */
update userinfo set name='third', age=33 where age=10; -- 조건이 안 맞으면 반영 X
update userinfo set age=33 where  name='third';
update userinfo set age=44 where  name='fourth';
update userindo set name='fourth', age=44 where no=4 and name='first';

#2-3 연습문제
create table score(
	sno int(11) not null auto_increment primary key,
    sname varchar(20) not null,
    sjava int(11) not null,
    sjsp int(11) not null,
    sspring int(11) not null,
    sproject int(11) not null,
    sstotal int(11),
    ssavg int(11),
    semail varchar(50) not null
);

alter table score modify semail varchar(50);

insert into score values (1, 'aaa', 100, 100, 100, 100, null, null, null);
insert into score values (2, 'bbb', 90, 98, 88, 100, null, null, null);
insert into score values (3, 'ccc', 70, 20, 78, 80, null, null, null);
insert into score values (4, 'ddd', 78, 89, 68, 98, null, null, null);
insert into score values (5, 'abs', 89, 98, 69, 77, null, null, null);

update score set sjava=90, sjsp=90, sspring=90 where sname='ccc';
update score set semail='admin@gamil.com';
update score set sstotal=sjava+sjsp+sspring+sproject;
update score set ssavg=sstotal/4.0;
update score set semail='first@gmail.com' where ssavg=100;
update score set sjava=92, sjsp=78, sstotal=sjava+sjsp+sspring+sproject, ssavg=sstotal/4.0 where sname='bbb';
update score set semail='second@gmail.com', sname='second' where ssavg=89.5;
update score set semail='ccc@gmail.com' where sname='ccc';
update score set semail='blackstudent@gmail.com' where sproject<80;
update score set semail='hello@gmail.com' where sproject=98;

/* delete from 테이블명
	where condition;
select * from useinfo_delete;
*/

#3-1 age가 11일 유저 삭제
delete from userinfo_delete where age=11;
select * from userinfo_delete;	#ctrl+enter

# 이름이 second이고 나이가 22살인 유저 삭제
delete from userinfo_delete where name='second' and age=22;

#전체데이터삭제
delete from userinfo_delete;

#3-2 연습문제
create table emp_del(
	empno int(11) not null auto_increment primary key,
    ename varchar(20),
    job varchar(20),
    mgr int(11),
    hiredate date,
    sal int(11),
    comm int(11),
    dept int(11)
);

insert into emp_del values (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, null, 20);
insert into emp_del values (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);
insert into emp_del values (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
insert into emp_del values (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, null, 20);
insert into emp_del values (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);
insert into emp_del values (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, null, 30);
insert into emp_del values (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, null, 10);
insert into emp_del values (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, null, 20);
insert into emp_del values (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, null, 10);
insert into emp_del values (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);
insert into emp_del values (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, null, 20);
insert into emp_del values (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, null, 30);
insert into emp_del values (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, null, 20);
insert into emp_del values (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, null, 10);

delete from emp_del;

# [001] [TABLE : delete_emp] (직책(JOB)이  'SALESMAN'인 데이터를 삭제하시오.  ) 
delete from emp_del where job='SALESMAN';

# [002] [TABLE : delete_emp] (직책(JOB)이  'MANAGER'이고  이름(ENAME)이 'JONES'인 데이터를 삭제하시오.  ) 
delete from emp_del where job='MANAGER' and ename='JONES';

# [003] [TABLE : delete_emp] (delete_emp 테이블의 모든 데이터를 삭제하시오. ) 
delete from emp_del;


/*

#실습1) insert
use mbasic;
show tables;
desc userinfo;

#1-1 구조와 순서를 알고 있을 때
#연습문제1) 다음과 같이 데이터를 삽입하시오.
/*
mysql> select * from emp;
+-------+--------+-----------+------+------------+------+------+------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | dept |
+-------+--------+-----------+------+------------+------+------+------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |   20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |   30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |   30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |   20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |   30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |   30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |   10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |   20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |   10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |   30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |   20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |   30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |   20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |   10 |
+-------+--------+-----------+------+------------+------+------+------+

create table emp(empno int not null auto_increment primary key, ename varchar(20) not null, job varchar(20), mgr int, hiredate varchar(15), sal int, comm int, dept int);

insert into emp values (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, null, 20);
insert into emp values (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);
insert into emp values (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
insert into emp values (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, null, 20);
insert into emp values (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);
insert into emp values (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, null, 30);
insert into emp values (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, null, 10);
insert into emp values (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, null, 20);
insert into emp values (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, null, 10);
insert into emp values (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);
insert into emp values (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, null, 20);
insert into emp values (7876, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, null, 30);
insert into emp values (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, null, 20);
insert into emp values (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, null, 10);

select * from emp;


mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
dml : insert, select, update, delete

create table userinfo

insert into userinfo values (1, 'first', 11);
insert into userinfo values (2, 'second', 22);
# Error code: 1366. Incorrect integer value: 'second' for column 'no' at row 1 0.000 sec
select	* from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo (name, age) value ('second', 22);
# 1 row(s) afffected



[002] 다음과 같이 데이터를 삽입하시오
mysql> select * from dept;
+--------+------------+----------+
| deptno | dname      | loc      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.00 sec)

create table from dept(


);
create table dept(deptno int, dname varchar, loc varchar);

insert into dept values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept values(20, 'RESEARCH', 'DALLAS');
insert into dept values(30, 'SALES', 'CHICAGO');
insert into dept values(40, 'OPERATIONS', 'BOSTON');

select * from dept;

mysql>

[003] 다음과 같이 데이터를 삽입하시오
mysql>
mysql> select * from salgrade;
+-------+-------+-------+
| grade | losal | hisal |
+-------+-------+-------+
|     1 |   700 |  1200 |
|     2 |  1201 |  1400 |
|     3 |  1401 |  2000 |
|     4 |  2001 |  3000 |
|     5 |  3001 |  9999 |
+-------+-------+-------+
5 rows in set (0.00 sec)


create table salgrade (grade int not null auto_increment primary key, losal int, hisal int);

insert into salgrade values (1, 700, 1200);
insert into salgrade values (2, 1201, 1400);
insert into salgrade values (3, 1401, 2000);
insert into salgrade values (4, 2001, 3000);
insert into salgrade values (5, 3001, 9999);

select * from salgrade;
*/
