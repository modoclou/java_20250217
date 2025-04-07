package spring004_mybatis;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)	//1. spring 테스트 구동
@ContextConfiguration(locations="file:src/main/java/config/root-context.xml")	//2. 경로
public class Test1_dao {
	
	@Autowired ApplicationContext context;	//3. spring bean 생성-소멸 관리
	@Autowired DataSource datasource;
	
	@Autowired TestDao dao;
	
	@Ignore //@Test
	public void test1() { System.out.println(context); }
	
	@Ignore //@Test
	public void test2() { System.out.println(datasource); }
	
	@Test
	public void test3() { System.out.println(dao.readTime()); }
}
