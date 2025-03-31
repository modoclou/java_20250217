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

@RunWith(SpringJUnit4ClassRunner.class)	//1. spring ioc container ����(invert of control)
@ContextConfiguration(locations="classpath:config/beans001.xml")	//2. ��� ����
public class JUnittest001 {
	@Autowired ApplicationContext context;	//3. Bean(spring �����ϴ� ��ü)
	//		   ApplicationContext - bean ���, ����, ��ȸ, ��ȯ����
	// @AUtoWired - ��ü�� �ִ��� �˻��ϰ� �ִٸ� �ڵ�����
	
	//@Test
	@Ignore
	public void test1() {
		Calc calc = context.getBean("rect", Calc.class);
		Calc calc2 = (Calc) context.getBean("tri");
		MyArea MyArea = context.getBean("MyArea", MyArea.class);
		//����� : assertEquals("����", "ó���� ��");
		assertEquals("sally>15.0", MyArea.mycalc(10,3));
	}
	
	//@Test
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("MyArea", MyArea.class);
		MyArea area2 = context.getBean("MyArea", MyArea.class);
		//�����2 : assertSame(area1, area2);
		//
		assertSame(area1, area2);
	}
}