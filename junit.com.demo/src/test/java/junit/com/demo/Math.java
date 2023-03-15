package junit.com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Math {

//	@Test
//	public void test() {
//		MathCalculator m = new MathCalculator();
//		int real = m.add(10, 20);
//		int actual = 30;
//		assertEquals(real, actual);
//	}
//	
//	@Test
//	public void test2() {
//		MathCalculator m = new MathCalculator();
//		int real = m.add(10, 20);
//		int actual = 40;
//		assertEquals(real, actual);
//	}
//	
//	@Test
//	public void test3() {
//		MathCalculator m = new MathCalculator();
//		int real = m.add(10, 20);
//		int actual = 30;
//		
//		boolean res = actual==real?true:false;
//		assertTrue(res);
//	}
//	
//	@Test
//	public void test4() {
//		MathCalculator m = new MathCalculator();
//		int real = m.add(10, 20);
//		int actual = 40;
//		
//		boolean res = actual==real?true:false;
//		assertFalse(res);
//	}
//	
//	@Test
//	public void test5() {
//		Leap l = new Leap();
//		int real = l.check(2000);
//		int actual =1;
//		assertEquals(real, actual);
//	}
//	
//	@Test
//	public void test6() {
//		Leap l = new Leap();
//		int real = l.check(2001);
//		int actual =1;
//		assertEquals(real, actual,"not leeap year");
//	}
	
	@Test
	public void test7() {
		Prime p = new Prime();
		boolean real =p.check(-13);
		assertTrue(real);
	}
	
	

}
