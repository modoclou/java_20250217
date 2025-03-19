/*
##■ part002 진도 - select basic

create table userinfo_ex(
no int not null auto_increment primary key,
name varchar(100) not null,
age int not null
);

insert into userinfo_ex value(1, 'first', 11);
insert into userinfo_ex value(2, 'second', 22);
insert into userinfo_ex value(3, 'third', 33);
insert into userinfo_ex value(4, 'fourth', 44);

insert into userinfo_ex value(5, 'fifth', 55);
insert into userinfo_ex (no, name, age) value(5, 'fifth', 55);

update userinfo_ex set age=10;

update userinfo_ex set name='third', age=33 where no=3 and age=10;

delete from userinfo_ex no=3 and age=10;

delete from userinfo_ex;
*/

insert into userinfo_ex value(1, 'first', 11);
insert into userinfo_ex value(2, 'second', 22);
insert into userinfo_ex value(3, 'third', 33);
insert into userinfo_ex value(4, 'fourth', 44);
insert into userinfo_ex value(5, 'fifth', 55);

##2-2
-- 1. 전체데이터 검색
select * from userinfo_ex;

-- 2. 부분검색
select name, age from userinfo_ex;

-- 3. 중복제거 (distinct)
select distinct name from userinfo_ex;

-- 4. 별명 짓기
select name as `이름`, age as `나이` from userinfo_ex;

-- 5. where 조건 (=같다, != <> 다르다, < <= > >=)
select * from userinfo_ex where name='second';
select * from userinfo_ex where name !='second';
select * from userinfo_ex where name <>'second';

select * from userinfo_ex where age < 33;
select * from userinfo_ex where age <= 33;
select * from userinfo_ex where age > 33; -- 44 55 66
select * from userinfo_ex where age >= 33; -- 33 44 55 66

-- 6. 모든 조건 - and, between and / 조건 중에 - or, in
select * from userinfo_ex where age>=22 and age<=33;
select * from userinfo_ex where age between 22 and 33;
select * from userinfo_ex where age=22 or age=33;
select * from userinfo_ex where age in (22, 33);

-- 7. null 검색 (is null, is not null, not in, not between)
desc userinfo_ex;
alter table userinfo_ex modify age int;
select * from userinfo_ex;
insert into userinfo_ex (name) values ('seven');

## null - '값이 비어있다'는 상태
select * from userinfo_ex where age=null; -- (X)
select * from userinfo_ex where age!=null; -- (X)
-- int(age) =(비교 표시) null(null) 비교 불가능. int는 int와 비교해야 한다

select * from userinfo_ex where age is null;
select * from userinfo_ex where age is not null;

-- select * from userinfo_ex where age<22 and age>33;
	select * from userinfo_ex where age not between 22 and 33;
-- select * from userinfo_ex where age=22 or age=33;
	select * from userinfo_ex where age not in (22, 33);
    
-- 8. like 문자열 검색 (like 'a%', '%a', '%a%', '%_a')
select * from userinfo_ex where name='first'; -- first 찾기(정확하게)
select * from userinfo_ex where name like'f%'; -- f로 시작하는 모든(*) 값 찾기, = 대신 like
select * from userinfo_ex where name like'%t'; -- t로 끝나는 모든(*)  값 찾기
select * from userinfo_ex where name like'%i%'; -- i를 포함하는 모든(*)  값 찾기
select * from userinfo_ex where name like'_e%'; -- 두 번째 글자가 e인 모든(*) 값 찾기


-- CREATE TABLE IF NOT EXISTS `복사 테이블` LIKE `원본 테이블`;
create table select_emp(
	empno int(11) not null auto_increment primary key,
	ename varchar(20),
	job varchar(20),
	mgr int(11),
	hiredate date,
	sal int(11),
	comm int(11),
	deptno int(11)
);
select * from select_emp;
delete from select_emp;
insert into select_emp values (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, null, 20);
insert into select_emp values (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);
insert into select_emp values (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
insert into select_emp values (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, null, 20);
insert into select_emp values (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);
insert into select_emp values (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, null, 30);
insert into select_emp values (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, null, 10);
insert into select_emp values (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, null, 20);
insert into select_emp values (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, null, 10);
insert into select_emp values (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);
insert into select_emp values (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, null, 20);
insert into select_emp values (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, null, 30);
insert into select_emp values (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, null, 20);
insert into select_emp values (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, null, 10);

/* create table select_emp select * from select_emp; -- 구조+데이터복사
alter table select_emp modify 
empno int(11) not null auto_increment primary key,
ename varchar(20),
job varchar(20),
mgr int(11),
hiredate date,
sal int(11),
comm int(11),
deptno int(11)
);
*/ 
select * from select_emp;
select * from select_emp where dept=30 and job='SALESMAN';
select * from select_emp where dept=30 or job='CLERK';
select * from select_emp where sal*12=36000;
select * from select_emp where sal>=3000;
select * from select_emp where name like 'f%' or '%f';
select * from select_emp where ename<='FORD';
select * from select_emp where sal!=3000;
select * from select_emp where sal <> 3000;

## 11~20
select * from select_emp where sal not in (3000);
select * from select_emp where job='MANAGER' or job='SALESMAN'or job='CLERK';
select * from select_emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
select * from select_emp where job!='SALESMAN' and job<>'CLERK';
select * from select_emp where job not in ('MANAGER', 'SALESMAN', 'CLERK');
select * from select_emp where sal>=2000 and sal<=3000;
select * from select_emp where sal between 2000 and 3000;
select * from select_emp where sal not between 2000 and 3000;
select * from select_emp where not (sal>=2000 and sal<=3000); -- 5000 안나옴?? ()로 범위체크
select * from select_emp where empno=7499 and dept=30;

##21~30
select * from select_emp where dept=20 or job='SALESMAN';
select * from select_emp where sal>=2500 and job='ANALYST';
select * from select_emp where dept=10 or dept=20;
select * from select_emp where dept not in(10, 20);
select * from select_emp where ename like 'S%'; -- name like?
select * from select_emp where ename like '_L%';
select * from select_emp where ename like '%AM%';
select * from select_emp where ename not like '%AM%';
-- 29 숫자 + null 계산 안 됨
select ename, sal, sal*12+comm `annsal`, comm from select_emp where ename like '%AM%';
select * from select_emp where comm=null;	# X comm의 자료형은 int, null은 상태를 나타내기 때문에 출력 X
select * from select_emp where comm is null;

#31~40
select * from select_emp where comm is null;
select * from select_emp where mgr is not null;
-- 33
use mbasic;
select * from select_emp;
select * from select_emp where sal > null;	-- ?? sal이 null(상태)보다 크다(값) // 비교 불가
-- 34								 null or true => null;
select * from select_emp where sal > null or comm is null;	-- ?? sal(값)이 null(상태)보다 크거나 comm이 null인 값 출력. comm 조건만 출력
-- 35 사원 이름이(ename) S로 끝나는 사원 데이터
select * from select_emp where ename like '%S';
select * from select_emp where dept=30 and job='SALESMAN';
select * from select_emp where dept in (20, 30) and sal>2000;
select empno, ename, job, sal from select_emp where dept in(20,30) and sal>2000;
-- 38
select * from select_emp where (sal>=2000, sal<=3000) or sal; -- ??
select empno, ename, job, sal, dept from select_emp where sal<2000 or sal>3000;
-- 39	부서 번호가 30이고 이름데 E가 포함되어 있는 사원 중 급여(sal)가 1000~2000 사이가 아닌 값을 가진 데이터 출력
select ename, job, sal, dept from select_emp where dept=30 and ename like '%E%' and sal not between 1000 and 2000;
select * from select_emp where dept=30 and ename like '%E%' and not (sal>=1000, sal<=2000); -- ??
-- 40
select * from select_emp where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename not like '_L%';
/*
select * from select_emp where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename <> '_L%';
select * from select_emp where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename!='_L%';
*/

-- 9. 

