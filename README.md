#### 38. 2025-04-10
  1. SPRING
  2. security(login ↔ board)
  3. Team Project progress (metting)

#### 37. 2025-04-09
  1. SPRING
  2. morning - springboot board complete
  3. after - security pom.xml, @Entity, crud
  4. lat - MemberService, Controller

#### 36. 2025-04-08
  1. SPRING - springboot board, list, update, (delete/write)

#### 35. 2025-04-07
  1. SPRING - mvc board, spring tool

#### 32-34. 2025-04-02~04
  1. absence 3 day

#### 31. 2025-04-01
  1. SPRING - datasource/mybatis

#### 30. 2025-03-31
  1. SPRING - ioc+di / bean
  2. ioc+di(@Test, @Ignore / property, constructor, properties) $list
  3. bean(@Autowired, @Qualifier, @Component, @Controller, @Service, @Repository, @Resource, @Value)

#### 29. 2025-03-28
  1. JSP - EL ${}/JSTL $() + FrontController Board

#### 28. 2025-03-27
  1. JSP - EL/JSTL + FrontController Board

#### 27. 2025-03-26
  1. JSP - select-basic, el/jstl

#### 26. 2025-03-25
  1. subquery, 내장객체

#### 25. 2025-03-24
  1. 2h, absence

#### 23, 24. 2025-03-20~21
  1. condition absence

#### 22. 2025-03-19
  1. MYSQL - select, basic(where 이용한 select 필터기능)
  2. JSP - JDBC 연동, Statement-PreparedStatement

#### 21. 2025-03-18
  1. MYSQL - insert, update, delete
  2. JSP - JDBC 연동, 주석 확인, 성적처리프로그램

#### 20. 2025-03-17
  1. MYSQL - RDBSM, TABLE, KEY, ALTER TABLE
  2. JSP - html/css/java - jsp

#### 19. 2025-03-14
  1. Thread (Synchronized/공유객체)
  2. Network
  3. Stream
  4. new BufferedReader( new InputStreamReader(new FileInputStream(file)) )
  5. MySQL
  6. Consumer / Supplier / Predicate / Function / Operator

#### 18. 2025-03-13
  1. JAVA I/O
  2. Thread
  3. Network - Reader/Writer
  4. Network - new BufferedReader( new InputStreamReader(new FileInputStream(file)) )
    		//#1. 경로
            String folder_rel="경로";
	    String   file_rel="파일이름";
	    
	    File folder = new File(folder_rel);
	    File file = new File(folder_rel + file_rel);
		
		//#2. 폴더 + 파일 만들기
	    try {
	    if(! folder.exists()) { folder.mkdir(); }
	    if(! file.exists()) { file.createNewFile(); }
	    } catch(Exception e) { e.printStackTrace(); }

    try {
		String apiurl="주소?보낼 이름=값&이름=값"
		+ URLEncoder.encode("이름", "UTF-8");
			URL url = new URL(apiurl);
		
		//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//#3. 요청파라미터
			conn.setRequestMethod("GET"); //html메서드
			conn.setRequestProperty("", "");
			conn.setRequestProperty("", "");
		//#4. 응답코드 - 200
		System.out.println(conn.getResponseCode());
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code==200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}

		//#5. 응답데이터 - xml/json/csv
			String line="";	StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line + "\n");}
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
		} catch(Exception e) { e.printStackTrace(); }

#### 17. 2025-03-12
  1. Lambda/Stream 
  2. JAVA I/O
  3. new BufferedReader( new InputStreamReader(new FileInputStream(file)) )
  4. Consumer / Supplier / Predicate / Function / Operator

#### 16. 2025-03-11
  1. OOP(2), collection framework(Map)
  2. Lambda/Stream

#### 15. 2025-03-10
  1. OOP(2), collection framework(Generic, List, Set)
  2. 정리문제
  3. Iterator

#### 14. 2025-03-07
  1. OOP(2) 
  2. interface, implements, exec(exeception), Anoy class

#### 13. 2025-03-06
  1. OOP(2) 
  2. abstract/interface

#### 12. 2025-03-05
  1. OOP extends(상속) 부모 = 자식(업캐스팅), 자식 = 부모(다운캐스팅)
  2. getters/setters, toString, using field, superclass, 다형성

#### 11. 2025-03-04
  1. OOP Static, Final, Modifier(접근제어자), Class Arr
  2. 클래스 배열
  3. getter/setter, field, super, toString

#### 10. 2025-02-28
  1. array 다차원 배열(이중 for문, 2차원 배열) / Arrays.toString(arr), Arrays.deeptoString(arr)
  2. public static 리턴값(void, or) 메서드명(파라미터[함수값]){} / 메서드{}; 호출(function, method, class)
  3. method 매개 변환, return문(void 없을 시 필수)
  4. show(a); call by value(전달값 복사해서 처리, 원본값 변경 X) vs call by reference(전달 주소 직접 참조해서 처리, 원본값 변경 O) / System.identityHashcode(str1)로 주소값 확인 시 값이 다르다.)
  5. public static int add(int x, int y) / public static long add(int x, int y) - 자료형이 다르면 method overloading error, different paremeter
  6. for(int a=0; int<ch.length; i++){} / for(int i=0; int<arr[i].length; i++){}
  7. 3-3 임시공휴일(3.1절)

#### 9. 2025-02-27
  1. Array, 제어문(for, while, do while)
  2. Array로 성적 평균, for 반복문(int i) 단계별ver 수식 작성 실습(~DAY006)
  3. 2차원배열, 이중 for문(~DAY007 10%)

#### 7, 8. 2025-02-25~26
  1. 병결, 결석


#### 6. 2025-02-24
  1. for 복습, (for)while, do wile, array 실습(for+length-배열-로 출력)
  2. 14. array 배열
     - 배열?
     - [같은 타입]의 데이터를 [연속된 공간에 저장]하는 자료구조
     - 각 데이터의 저장 위치는 [인덱스]를 통해서 접근
  3. int, char, String(...)[] arr
  4. String 배열("다문자", "다문자1", "다문자2") / ch 배열(한 글자 문자)에서 a의 갯수 세기

#### 5. 2025-02-21
  1. a는 a(1, 2, 3)다. 복습
  2. 제어문(for, switch), 제어 키워드(continue)
  3. for문으로 다양한 계산, for(int i=1; i<=10; i++) { val += i; } { ++act; } //중괄호 반복
  4. for(char ch='a'; ch<='z'; ch++)
		{ if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) { cnt++; } }
		System.out.println("소문자 a~z까지 모음의 갯수 > " + cnt);
  5. for(;;) // 무한반복
  6. java005.Repeat_005 복습
  7. bank mini project ~Step2

#### 4. 2025-02-20
  1. 연산자 복습, 제어문(if, switch), 제어 키워드(break)
  2. 평균으로 합격 불합격 여부 출력하기, 양수 음수 zero 출력하기, 1/2/3 아니다 출력, 대소문자 판별 프로그램, 홀-남 짝-여 프로그램
  3. 간이 계산기, 성적처리(총점, 평균, 합격여부, 수우미양가(레벨), 장학생여부), switch문으로 월 숫자 입력시 계절 출력

#### 3. 2025-02-19
  1. 자료형 복습, 형변환, %d(수열) %.2f / char ch = ' ';
  2. 자료형 범위(연산자)

#### 2. 2025-02-18
  1. 변수
  2. 자료형 기본 - 실제값 저장, 참조형 - 주소값 저장 (String) / 논리형, 정수형(byte:1, short:2, int:4, long:8), 실수형 (float:4, double:8)

#### 1. 2025-02-17
  1. WELCOME!
  2. git (로컬저장소 · 원격저장소)
  3. java (설치, eclipse)
