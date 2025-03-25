# ■ 복습문제 (집계함수)

/*
Q1.  emp 테이블에서  급여가 3000이하인 직원에서  
-- [각 부서의 직책별] 평균급여가 2000이상인 그룹을 조회하시오.
+--------+---------+-----------+
| deptno | job     | 평균급여  |
+--------+---------+-----------+
|     10 | MANAGER | 2450.0000 |
|     20 | ANALYST | 3000.0000 |
|     20 | MANAGER | 2975.0000 |
|     30 | MANAGER | 2850.0000 |
+--------+---------+-----------+
4 rows in set (0.00 sec)
*/
use mbasic;
select * from emp;

select  deptno, job, avg(sal) `평균급여` 
from    emp
where   sal <= 3000
group   by  deptno, job
having  avg(sal)  >=2000
order by  deptno asc, job;



/* 
Q2. emp 테이블에서 GROUP BY절만  사용하여  
-- 각부서의 직책별 사원수, 가장높은 급여, 급여합, 평균급여를  다음과 같이  사원데이터를  조회하시오.
+--------+-----------+--------+----------+--------+-----------+
| deptno | job       | 사원수   | 최고급여   | 급여합   | 평균급여   |
+--------+-----------+--------+----------+--------+-----------+
|     10 | CLERK     |      1 |     1300 |   1300 | 1300.0000 |
|     10 | MANAGER   |      1 |     2450 |   2450 | 2450.0000 |
|     10 | PRESIDENT |      1 |     5000 |   5000 | 5000.0000 |
|     20 | ANALYST   |      2 |     3000 |   6000 | 3000.0000 |
|     20 | CLERK     |      2 |     1100 |   1900 |  950.0000 |
|     20 | MANAGER   |      1 |     2975 |   2975 | 2975.0000 |
|     30 | CLERK     |      1 |      950 |    950 |  950.0000 |
|     30 | MANAGER   |      1 |     2850 |   2850 | 2850.0000 |
|     30 | SALESMAN  |      4 |     1600 |   5600 | 1400.0000 |
+--------+-----------+--------+----------+--------+-----------+
9 rows in set (0.00 sec) 
*/

select  @@sql_mode;
set    SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select  deptno , job 
	    , count(*) `사원수` , max(sal)  `최고급여` , sum(sal) `급여합`, avg(sal) `평균급여`
from    emp
group   by    deptno , job 
order   by    deptno , job  ;   


# ■ 진도 - function
#1. Number
#2. String
#3. Date
#4. if / case

-------------------------------------------------------------
#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지)
-------------------------------------------------------------
select   ceil(1.1) `올림`, floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;
# https://www.w3schools.com/sql/func_mysql_round.asp
/*
1-2 CRUD (SELECT Function-Number 연습문제)
EX1    123.4578을 ROUND를 이용하여 다음과 같이 출력하시오.
+----------+--------+--------+--------+--------+
| 123.4578 | ROUND1 | ROUND2 | ROUND3 | ROUND4 |
+----------+--------+--------+--------+--------+
| 123.4578 |    123 |    120 |  123.5 | 123.46 |
+----------+--------+--------+--------+--------+
1 row in set (0.00 sec)
*/
select   123.4578 
	   , round(123.4578 , 0) , round(123.4578 , -1) , round(123.4578 , 1) , round(123.4578 , 2); 

/*
EX2
+----------+------+-------+
| 123.4578 | CEIL | FLOOR |
+----------+------+-------+
| 123.4578 |  124 |   123 |
+----------+------+-------+
1 row in set (0.00 sec)
*/
select   123.4578 , ceil(123.4578) `ceil` ,  floor(123.4578)  `floor`;



-------------------------------------------------------------
#2. String
-------------------------------------------------------------
-- 1) length(문자열)  갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을문자열)  위치  , 못찾으면 0
-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개)  문자열 일부분
-- 5) 문자열연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백빼기
-- 7) replace(문자열에서, 찾아서, 바꾸기)
-- 8) repeat(뭐를, 몇개반복) 
-- 9) 빈칸채우기  lpad , rpad



-- 2-1. basic
-- 1) length(문자열)  갯수
select length('abc');

-- 2)  upper/lower
select  'abc' , upper('abc') , lower('abc') ;

-- 3) instr 위치				    
select  instr('abc' , 'b' )  `b의 위치`,instr('abc' , 'ab') `ab의 위치`,instr('abc' , 'ac') `ac의 위치`;

-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개)  문자열 일부분
select  left('abc',1) , left('abc',2) , right('abc',1) , right('abc',2); -- a , ab , c, bc
select  substr('abcde' , 2,2) `bc` , substr('abcde',2,3) `bcd` , substr('abcde' , 1,3) `abc`;  

-- 5) 문자열연결 concat(문자열1, 문자열2)
select  concat('hello  ','mysql')  `hello  mysql`;  

-- 6)  trim 좌우공백빼기
select  trim(' a b c ')  `a b c`;

select   concat( '#'  , trim(' a b c ')  , '#')    `#a b c#`     
       , concat( '#'  , ltrim(' a b c ') , '#')    `#a b c #`   
       , concat( '#'  , rtrim(' a b c ') , '#')    `# a b c#`  ;

-- 7) replace(문자열에서, 찾아서, 바꾸기)
select  replace("hello sally" , 'sally'  , 'alpha')  `hello alpha`;

-- 8) repeat(뭐를, 몇개반복)
select  repeat('*' , 5) `*****`; 

-- 9) 빈칸채우기  lpad , rpad
select    lpad('abc' , 10 , '#') 
	   ,  rpad('abc' , 10 , '#') ;




-- 2-2  연습문제
/*
mysql> desc fn_select_userinfo2;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| no    | int         | NO   |     | 0       |       |
| name  | varchar(20) | NO   |     | NULL    |       |
| age   | int         | NO   |     | NULL    |       |
| email | varchar(20) | NO   |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> select * from fn_select_userinfo2;
+----+------+-----+---------------+
| no | name | age | email         |
+----+------+-----+---------------+
|  1 | aaa  |  11 | aaa@gmail.com |
|  2 | bbb  |  22 | bbb@gmail.com |
|  3 | ccc  |  33 | ccc@gmail.com |
|  4 | ddd  |  44 | ddd@gmail.com |
|  5 | abc  |  55 | abc@gmail.com |
|  6 | bca  |  66 | bca@gmail.com |
+----+------+-----+---------------+
6 rows in set (0.00 sec)

mysql>
*/

/*
1. 유저의 이름의 글자수를 조회하시오.
+------+------+
| 이름 | 갯수 |
+------+------+
| aaa  |    3 |
| bbb  |    3 |
| ccc  |    3 |
| ddd  |    3 |
| abc  |    3 |
| bca  |    3 |
+------+------+
6 rows in set (0.00 sec)
*/
select  name, length(name)  from fn_select_userinfo;

/*
2. 유저의 이름과 이름의  첫번째 글자 , 마지막글자 를 조회하시오. (left, right)
+------+-------------+------------+
| name | 첫번째 글자 | 마지막글자 |
+------+-------------+------------+
| aaa  | a           | a          |
| bbb  | b           | b          |
| ccc  | c           | c          |
| ddd  | d           | d          |
| abc  | a           | c          |
| bca  | b           | a          |
+------+-------------+------------+
6 rows in set (0.00 sec)
*/
select name, left(name,1) `첫번째 글자` ,  right(name,1) `마지막글자` from fn_select_userinfo; 


/*
3. 유저이름의 aaa인 유저를 찾아서 'aaa 1등'으로 변경하시오.
+------+-----------------------------------+
| name | replace( name, 'aaa' , 'aaa 1등') |
+------+-----------------------------------+
| aaa  | aaa 1등                           |
| bbb  | bbb                               |
| ccc  | ccc                               |
| ddd  | ddd                               |
| abc  | abc                               |
| bca  | bca                               |
+------+-----------------------------------+
6 rows in set, 1 warning (0.00 sec)

mysql>
mysql>
*/
select  name,  replace(   name , 'aaa' , 'aaa 1등')  from fn_select_userinfo; 


/*
4. 다음과 같이 직업을 출력하시오.   (concat)
+---------------------+
| 직업                |
+---------------------+
| aaa는 개발자입니다. |
| bbb는 개발자입니다. |
| ccc는 개발자입니다. |
| ddd는 개발자입니다. |
| abc는 개발자입니다. |
| bca는 개발자입니다. |
+---------------------+
6 rows in set, 1 warning (0.00 sec)
*/
select  concat(name, '는 개발자입니다.')  `직업`  from fn_select_userinfo;

/*
5. 이름을 대문자로 조회하시오.
+-------------+
| upper(name) |
+-------------+
| AAA         |
| BBB         |
| CCC         |
| DDD         |
| ABC         |
| BCA         |
+-------------+
6 rows in set (0.00 sec)
*/
select  upper(name) from fn_select_userinfo;

/*
 6. 이름을 소문자로 조회하시오.
+-------------+
| lower(name) |
+-------------+
| aaa         |
| bbb         |
| ccc         |
| ddd         |
| abc         |
| bca         |
+-------------+
6 rows in set (0.00 sec)
*/
select  lower(name) from fn_select_userinfo;
/*
7. 나이가 40대이상의 유저의 이름과 b의 위치를  조회하시오. (instr)
+------+-----------------+
| name | instr(name,'b') |
+------+-----------------+
| ddd  |               0 |
| abc  |               2 |
| bca  |               1 |
+------+-----------------+
3 rows in set (0.03 sec)
*/
select  name, instr(name,'b')   
from    fn_select_userinfo
where   age >= 40;

/*
8. [upgrade] 나이가 40대이상의 유저의 이름과 b의 위치를  조회시 나이 많은 순으로 2분을 조회하시오(instr)
+------+-----------------+
| name | instr(name,'b') |
+------+-----------------+
| bca  |               1 |
| abc  |               2 |
+------+-----------------+
2 rows in set (0.02 sec)
*/
select  name, instr(name,'b')   
from    fn_select_userinfo
where   age >= 40
order   by  age  desc   limit 2;



/*
9. [upgrade] 유저의 이름과 이름의  첫번째 글자 , 마지막글자 를 조회하시오.
+------+------+
| name | test |
+------+------+
| aaa  | a*a  |
| bbb  | b*b  |
| ccc  | c*c  |
| ddd  | d*d  |
| abc  | a*c  |
| bca  | b*a  |
+------+------+
6 rows in set (0.00 sec)

mysql>
*/
select  name,   concat(  left(name,1)  , '*' , right(name,1)  )  `test`  from fn_select_userinfo;
/*
10. 테이블 select_userinfo복사해서 한개더 만들기
mysql> select * from select_userinfo2;
+----+-------+-----+---------------+
| no | name  | age | email         |
+----+-------+-----+---------------+
|  1 | aaaa  |  11 | aaa@gmail.com |
|  2 | bbaab |  22 | bbb@gmail.com |
|  3 | ccaac |  33 | ccc@gmail.com |
|  4 | daadd |  44 | abc@gmail.com |
|  5 | abc   |  55 | abc@gmail.com |
|  6 | baaca |  66 | bca@gmail.com |
+----+-------+-----+---------------+
6 rows in set (0.00 sec)


+-------+-------+
| name  | test  |
+-------+-------+
| aaaa  | a**a  |
| bbaab | b***b |
| ccaac | c***c |
| daadd | d***d |
| abc   | a*c   |
| baaca | b***a |
+-------+-------+
*/

select  name,  
        concat( left(name,1)       , repeat('*' ,  length(name)-2 )  ,   right(name,1)  )  `test`  
from fn_select_userinfo2;



-------------------------------------------------------------
#3. Date
-------------------------------------------------------------

-- 1) 시스템의 현재 시각조회
select now();   -- '2025-03-21 11:58:22'
select current_time(); -- '11:59:08'

-- 2) 요일  (0 = Mon   ,  1= Tue , 6=Sun)
select weekday(now());   --  4   금
select weekday("2025-03-21");   --  4   금

-- 3) 날짜형식 date_format(  날짜지정,  '%Y-%m-%d' )
select  date_format("2025-03-21"  , '%Y-%m-%d');
select  date_format( now()  , '%Y-%m-%d  %H:%i:%s'); -- '2025-03-21  12:03:39'

-- 4) 100일전/ 후   date_add
select  date_add( now()   , interval  -10 day);  -- '2025-03-11 12:05:16'
select  date_add( now()   , interval   10 day);  -- '2025-03-31 12:05:43'
select  date_add( now()   , interval  -3 hour);  -- '2025-03-21 09:05:53'

-- 5) datediff(날짜1, 날짜2)  날짜차이
select  datediff( '2025-03-22' , '2025-03-21');
select  timestampdiff(  hour,  '2025-03-22' , '2025-03-21');  --  -24




-- 1) 시스템의 현재 시각조회  now / current_time
-- 2) 요일  (0 = Mon   ,  1= Tue , 6=Sun)


-- 연습문제
/*

mysql>
mysql> desc date_userinfo;
+-------+--------------+------+-----+-------------------+-------------------+
| Field | Type         | Null | Key | Default           | Extra             |
+-------+--------------+------+-----+-------------------+-------------------+
| no    | int          | NO   |     | 0                 |                   |
| name  | varchar(100) | NO   |     | NULL              |                   |
| age   | int          | NO   |     | NULL              |                   |
| date  | datetime     | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+-------+--------------+------+-----+-------------------+-------------------+
4 rows in set (0.01 sec)


mysql> select * from date_userinfo;
+----+------+-----+---------------------+
| no | name | age | date                |
+----+------+-----+---------------------+
|  1 | aaa  |  11 | 2022-12-30 00:00:00 |
|  2 | bbb  |  22 | 2022-11-30 00:00:00 |
|  3 | ccc  |  33 | 2022-10-30 00:00:00 |
|  4 | ddd  |  44 | 2022-09-30 00:00:00 |
+----+------+-----+---------------------+
4 rows in set (0.00 sec)

mysql>

*/
/*


select * from userinfo  where 1=2;  -- 구조만 복사
create table date_userinfo   select * from userinfo  where 1=2;

alter table  date_userinfo   add  date  datetime  default now();
desc         date_userinfo;

insert into date_userinfo  values (1, 'aaa' , 11 , '2022-12-30');
insert into date_userinfo  values (2, 'bbb' , 22 , '2022-11-30');
insert into date_userinfo  values (3, 'ccc' , 33 , '2022-10-30');
insert into date_userinfo  values (4, 'ddd' , 44 , '2022-09-30');

select * from date_userinfo;

 */
/*
> [001] '2022-11-01' 이전에 회원가입한 유저의 다음과 같이 데이터를 조회하시오
+------+---------------------+
| name | date                |
+------+---------------------+
| ccc  | 2022-10-30 00:00:00 |
| ddd  | 2022-09-30 00:00:00 |
+------+---------------------+
*/
select  name, date  from   date_userinfo   where  date < '2022-11-01';

/*
> [002] '12'월달에  회원가입한 유저에게 30일 연장 이벤트를 실시하려고 한다.
+------+---------------------+---------------------+
| name | date                | event               |
+------+---------------------+---------------------+
| aaa  | 2022-12-30 00:00:00 | 2023-01-29 00:00:00 |
+------+---------------------+---------------------+
*/
select   name, date, date_add( date,  interval   30 day )  `event`
from     date_userinfo
where    date>= '2022-12-1'   and   date <= '2022-12-31';

select   name, date, date_add( date,  interval   30 day )  `event`
from     date_userinfo
where    month(date) = 12;




/*
> [003] 다음과 같이 유저의 가입날자를 조회하시오.
+------+----------------+
| name | 가입날짜       |
+------+----------------+
| aaa  | 2022년12월30일 |
| bbb  | 2022년11월30일 |
| ccc  | 2022년10월30일 |
| ddd  | 2022년09월30일 |
+------+----------------+
4 rows in set (0.01 sec)
*/
select   name,  date_format( date , '%Y년 %m월  %d일' )  `가입날짜`
from     date_userinfo;


/*  번외
>> 연습문제2)  select_emp
> 1. 금일날짜를 출력하시오.

> 2.  금일과  이번년도 크리스마스  날짜사이의 일수 차이를 구하시오

> 3. 현재날짜에서 5개월 더해 출력하시오.

> 4. 현재날짜를 기준으로 가장 가까운 일요일의 날짜를 구하시오.
-- 0 = Monday, 1 = Tuesday, 2 = Wednesday, 3 = Thursday, 4 = Friday, 5 = Saturday, 6 = Sunday.





*/

-------------------------------------------------------------
#4. if / case
-------------------------------------------------------------
-- if(조건, 참 , 거짓)
-- 다형식
/*    case
	  when     조건1     then    상태1
	  when     조건2     then    상태2
	  else     모든조건에 해당하지 않을때, 생략가능
      end
*/


/*
■ 3. CRUD (SELECT Function-IF , CASE)
mysql> desc control;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| NO    | int  | YES  |     | NULL    |       |
+-------+------+------+-----+---------+-------+
1 row in set (0.00 sec)

mysql> select * from control;
+------+
| NO   |
+------+
|    1 |
|    2 |
|    3 |
+------+
3 rows in set (0.00 sec)

mysql>

*/
create table control (no int);
insert into  control values (1) , (2), (3);
select * from control;

-- 1-1   
select  no , if(no =1 , '1이다'     , '1이 아니다')  `상태`  from control;

-- 1-2.
select  no , if(no >1 , '1보다 크다' , '1보다 작다')  `상태`  from control;

-- 1-3.  case    when/then       end
select  no, case
				when  no=1  then  '1이다'
				when  no=2  then  '2이다'
				when  no=3  then  '3이다'
				else  '1,2,3 이 아니다'
		    end  `state`
from control;            

-- 1-4.   2이다, 크다, 작다
select  no, case  
				when  no>2  then '크다'
                when  no=2  then '2이다'
                when  no<3  then '작다'
		    end `state`
from control;


/*

■ 4. CRUD (SELECT Function-IF , CASE 연습문제)

mysql> desc if_userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | YES  |     | 0       |                |
| sex   | char(1)      | YES  |     | NULL    |                |
| sns   | char(1)      | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql> select * from if_userinfo;
+----+--------+------+------+------+
| no | name   | age  | sex  | sns  |
+----+--------+------+------+------+
|  1 | first  |   11 | NULL | n    |
|  2 | second |  122 | m    | y    |
|  3 | third  |   33 | m    | y    |
|  4 | fourth |   44 | f    | n    |
|  5 | fifth  |   55 | f    | y    |
|  6 | sixth  |   66 | m    | n    |
+----+--------+------+------+------+
6 rows in set (0.00 sec)


*/
/*
>> 연습문제1)
[question1]sns의 수신여부상태를 구하시오
+----+--------+-----+------+------+--------------+
| no | name   | age | sex  | sns  | 수신여부상태 |
+----+--------+-----+------+------+--------------+
|  1 | first  |  11 | NULL | n    | 수신거부     |
|  2 | second |  22 | m    | y    | 수신유지     |
|  3 | third  |  33 | m    | y    | 수신유지     |
|  4 | fourth |  44 | f    | n    | 수신거부     |
|  5 | fifth  |  55 | f    | y    | 수신유지     |
|  6 | sixth  |  66 | m    | n    | 수신거부     |
+----+--------+-----+------+------+--------------+
*/
select  *  ,  if( sns='n' , '수신거부' , '수신유지' )    `수신상태여부`    
from if_userinfo;



/*
[question2]나이가 19세 미만이면 미성년자, 성인을 구하시오.
+----+--------+-----+------+------+----------+
| no | name   | age | sex  | sns  | 성인여부 |
+----+--------+-----+------+------+----------+
|  1 | first  |  11 | NULL | n    | 미성년자 |
|  2 | second |  22 | m    | y    | 성인     |
|  3 | third  |  33 | m    | y    | 성인     |
|  4 | fourth |  44 | f    | n    | 성인     |
|  5 | fifth  |  55 | f    | y    | 성인     |
|  6 | sixth  |  66 | m    | n    | 성인     |
+----+--------+-----+------+------+----------+
6 rows in set (0.00 sec)
*/

select  *  ,  if( age < 19  , '미성년자', '성인' )    `성인여부`    
from if_userinfo;

/*
[question3]sns의 수신거부 숫자를 구하시오.
+---------------+
| sns수신거부수 |
+---------------+
|             3 |
+---------------+
*/
select   sum(    if(sns='n' , 1,0)     )    `sns수신거부수`  from if_userinfo;
select   count(  if(sns='n' , 1,null)  )    `sns수신거부수`  from if_userinfo;


/*


== (2) case
[question1] emp 테이블을 이용하여
 부서번호가 10이면 ACCOUNTING , 20이면 RESEARCH , 30이면 SALES을 다음과 같이 출력하시오.
+--------+--------+------------+
| ENAME  | DEPTNO | 부서이름   |
+--------+--------+------------+
| SMITH  |     20 | RESEARCH   |
| ALLEN  |     30 | SALES      |
| WARD   |     30 | SALES      |
| JONES  |     20 | RESEARCH   |
| MARTIN |     30 | SALES      |
| BLAKE  |     30 | SALES      |
| CLARK  |     10 | ACCOUNTING |
| SCOTT  |     20 | RESEARCH   |
| KING   |     10 | ACCOUNTING |
| TURNER |     30 | SALES      |
| ADAMS  |     20 | RESEARCH   |
| JAMES  |     30 | SALES      |
| FORD   |     20 | RESEARCH   |
| MILLER |     10 | ACCOUNTING |
+--------+--------+------------+
14 rows in set (0.00 sec)
*/

select  ename, deptno,  case  
							when  deptno=10  then 'ACCOUNTING'
							when  deptno=20  then 'RESEARCH'
							when  deptno=30  then 'SALES' 
						end `부서이름`
from emp;

select  ename, deptno,  case   deptno
							when  10  then 'ACCOUNTING'
							when  20  then 'RESEARCH'
							when  30  then 'SALES' 
						end `부서이름`
from emp;

/*
[question2] emp 테이블에서
JOB이 CLERK이면 판매원, SALESMAN이면 영업사원, 기타는 사원을  다음과 같이 출력하시오.
+--------+-----------+----------+
| ENAME  | JOB       | JOB2     |
+--------+-----------+----------+
| SMITH  | CLERK     | 판매원   |
| ALLEN  | SALESMAN  | 영업사원 |
| WARD   | SALESMAN  | 영업사원 |
| JONES  | MANAGER   | 사원     |
| MARTIN | SALESMAN  | 영업사원 |
| BLAKE  | MANAGER   | 사원     |
| CLARK  | MANAGER   | 사원     |
| SCOTT  | ANALYST   | 사원     |
| KING   | PRESIDENT | 사원     |
| TURNER | SALESMAN  | 영업사원 |
| ADAMS  | CLERK     | 판매원   |
| JAMES  | CLERK     | 판매원   |
| FORD   | ANALYST   | 사원     |
| MILLER | CLERK     | 판매원   |
+--------+-----------+----------+
14 rows in set (0.00 sec)
*/





