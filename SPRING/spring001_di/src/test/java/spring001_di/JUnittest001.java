package spring001_di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.iotest.Calc;
import com.company.iotest.MyArea;

@RunWith(SpringJUnit4ClassRunner.class)	//1. spring ioc container 생성(invert of control)
@ContextConfiguration(locations="classpath:config/beans001.xml")	//2. 경로 설정
public class JUnittest001 {
	@Autowired ApplicationContext context;	//3. Bean(spring 관리하는 객체)
	//		   ApplicationContext - bean 등록, 생성, 조회, 반환관리
	// @AUtoWired - 객체를 있는지 검사하고 있다면 자동연결
	
	//@Test
	@Ignore
	public void test1() {
		Calc calc = context.getBean("rect", Calc.class);
		Calc calc2 = (Calc) context.getBean("tri");
		MyArea MyArea = context.getBean("MyArea", MyArea.class);
		//사용방법 : assertEquals("예상값", "처리할 값");
		assertEquals("sally>15.0", MyArea.mycalc(10,3));
	}
	
	//@Test
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("MyArea", MyArea.class);
		MyArea area2 = context.getBean("MyArea", MyArea.class);
		//사용방법2 : assertSame(area1, area2);
		//
		assertSame(area1, area2);
	}
}