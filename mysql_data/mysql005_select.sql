/*
■진행1. CRUD (SELECT Subquery)
[실습] 다음과 같이 데이터를 준비하시오
mysql> desc sub_userinfo;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| no    | int(11)     | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | NO   |     | NULL    |                |
| age   | int(11)     | NO   |     | NULL    |                |
| sex   | char(2)     | YES  |     | NULL    |                |
| kor   | int(11)     | YES  |     | NULL    |                |
| eng   | int(11)     | YES  |     | NULL    |                |
| math  | int(11)     | YES  |     | NULL    |                |
| ban   | char(2)     | YES  |     | NULL    |                |
| sns   | char(2)     | YES  |     | y       |                |
+-------+-------------+------+-----+---------+----------------+

use mbasic;
create table sub_userinfo(
	no int(11) not null auto_increment primary key,
	name varchar(20) not null,
	age int(11) not null,
	sex char(2),
	kor int(11),
	eng int(11),
	math int(11),
	ban char(2),
	sns char(2) default y
);
*/

#1. 서브쿼리
-- select 구문 안에 select 구문
-- 서브쿼리 결과가 하나 이상 반환 시 in, any, all 사용(1개일 땐 =)

#2. 형식
-- select 컬럼 from 테이블 where 컬럼 in ( select 문 );

#1-1. 평균나이 이상인 레코드를 추출하시오.
-- select * from sub_userinfo where age >= 평균나이
#1-2. 평균나이
select avg(age) from sub_userinfo;
#1-3. 1+3
select * from sub_userinfo where age >= (select avg(age) from sub_userinfo);

/*
mysql> select * from sub_userinfo;
+----+--------+-----+------+------+------+------+------+------+
| no | name   | age | sex  | kor  | eng  | math | ban  | sns  |
+----+--------+-----+------+------+------+------+------+------+
|  1 | first  |  11 | NULL |  100 |  100 |   99 | A    | n    |
|  2 | second |  22 | m    |   89 |   92 |   78 | B    | y    |
|  3 | third  |  33 | m    |   90 |   92 |   97 | A    | y    |
|  4 | fourth |  44 | f    |   40 |   42 |   67 | C    | n    |
|  5 | fifth  |  55 | f    |   89 |   86 |   99 | B    | y    |
|  6 | sixth  |  66 | m    |   10 |   20 |   44 | C    | n    |
+----+--------+-----+------+------+------+------+------+------+
6 rows in set (0.00 sec)
*/

desc sub_userinfo;
select * from sub_userinfo;
/*
insert into sub_userinfo values (1, 'first', 11, null, 100, 100, 99, 'A', 'n');
insert into sub_userinfo values (2, 'second', 22, 'm', 89, 92, 78, 'B', 'y');
insert into sub_userinfo values (3, 'third', 33, 'm', 90, 92, 97, 'A', 'y');
insert into sub_userinfo values (4, 'fourth', 44, 'f', 40, 42, 67, 'C', 'n');
insert into sub_userinfo values (5, 'fifth', 55, 'f', 89, 86, 99, 'B', 'y');
insert into sub_userinfo values (6, 'sixth', 66, 'm', 10, 20, 44, 'C', 'n');
*/

/*
-- BASIC2. first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오.
+------+-------+------+------+------+
| ban  | name  | kor  | eng  | math |
+------+-------+------+------+------+
| A    | first |  100 |  100 |   99 |
| A    | third |   90 |   92 |   97 |
+------+-------+------+------+------+
2 rows in set (0.00 sec)
*/
select ban, name, kor, eng, math from sub_userinfo where ban=first반;
select ban from sub_userinfo where name='first';

select ban, name, kor, eng, math from sub_userinfo where ban=(select ban from sub_userinfo where name='first');

/*
-- BASIC3. first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
+------+---------+---------+---------+
| ban  | kor     | eng     | math    |
+------+---------+---------+---------+
| A    | 95.0000 | 96.0000 | 98.0000 |
+------+---------+---------+---------+
*/
select ban, avg(kor), avg(eng), avg(math) from sub_userinfo where ban=first반 group by ban;
select ban from sub_userinfo where ban='first';
-- select ban, avg(kor), avg(eng), avg(math) from sub_userinfo where ban= (select ban fron sub_userinfo where name='first') group by ban;

desc emp;
select * from emp;
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

delete from emp;

/*
1. 다중행 연산자
-  in , any(some) ,  all
2. in  : 서브쿼리의 결과가 하나라도 일치하면 true
3. any : 서브쿼리의 결과가 하나이상이면 true
4. all : 서브쿼리의 결과가 모두 만족하면  true

2. any : 하나라도 일치하면 참  (선한개)
컬럼명  < any(1,2,3)            |(1)   |(2)   |(3)  ★     최대값보다 작다.
컬럼명  > any(1,2,3)          ★ |(1)   |(2)   |(3)  최소값보다 크다

3. all : 모두가 일치하면 참 (선 3개)
컬럼명  < all(1,2,3)          ★ |(1)   |(2)   |(3)        최소값보다 작다  
컬럼명  > all(1,2,3)             |(1)   |(2)   |(3)  ★       최대값보다 크다
*/
create table atest as			 select 1 num from dual
					  union all select 2 from dual
					  union all select 3 from dual
                      union all select 4 from dual
                      union all select 5 from dual
                      union all select 6 from dual;
                      
select * from atest;

-- 최대값보다 작다
select num from atest where num < all(select num from atest where num in(3,4,5)) order by num;
-- 최솟값보다 크다
select num from atest where num > all(select num from atest where num in(3,4,5)) order by num;
-- 최솟값보다 작다 (all #) 3보다 작다 -> 결과값 1,2
select num from atest where num < all(select num from atest where num in(3,4,5)) order by num;
-- 최대값보다 크다 (all #) 5보다 크다 -> 결과값 6
select num from atest where num > all(select num from atest where num in(3,4,5)) order by num;

use mbasic;
select * from member;
delete from member where no='8';