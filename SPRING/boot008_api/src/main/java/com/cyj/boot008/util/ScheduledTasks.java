package com.cyj.boot008.util;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	@Scheduled(fixedRate = 5000) //5초마다 실행
	public void runTask1() {
		System.out.println("running *Task* Scheduler...... : " + System.currentTimeMillis());
	}
	//지정 후 사용
	
//	@Scheduled(fixedDelay = 12000) //12초 뒤에 실행
//	public void runTask2() {
//		System.out.println("running Scheduler...... : " + System.currentTimeMillis());
//	}
	@Scheduled(cron = "0 1 10 * * ?")	//매일 자정, 매월, 일주일 단위 등. 몇 시 몇 분 몇 초 * * ? 표기
	public void runtest2() {
		System.out.println("running *cron* Scheduler...... : " + System.currentTimeMillis());
	}
}
/*
1. @Scheduled - 5000 / 부품
   fixedRate = 5000		5초마다 실행
   fixedDelay			어떤 작업이 끝나면 지정된 시간에 실행
   ------------fixed는 작업들을 무시하고 고정된 시간에 실행, 시스템 과부하 혹은 위험의 위험 있음
   cron					크론 표현(major)식
   	cron = "0 0 0 * * ?"	초 분 시 날짜 월 요일		매일 0시 0분(자정)
    cron = "0 0 12 * * ?"	매일 정오
    cron = "0 30 18 * * ?"	매일 오후 6시 30분
    cron = "0 0 0 1 * ?"	매월 1일 자정
    cron = "0 0 0 ?  8 MON"	매주 월요일 자정 - 날짜와 요일이 영향을 주지 않게 "?" 표시
    
    * = asterisk. 제한 없는 모든 값
    ? = 특정값 없음 (대신 다른 필드를 기준으로 실행)
    
2. @EnableScheduling  
@SpringBootApplication
@EnableScheduling
public class Boot008ApiApplication {
 */