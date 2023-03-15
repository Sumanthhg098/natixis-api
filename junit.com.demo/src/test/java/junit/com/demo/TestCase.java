package junit.com.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TestCase {
	MathCalculator m ;
	
	@BeforeEach
	void setUp() {
		m = new MathCalculator();
	}

	@Test
	void test() {
		
		Prime p = new Prime();
		assertAll(
				()->assertTrue(p.check(2)),
				()->assertTrue(p.check(3)),
				()->assertTrue(p.check(-13))
		);
	}
	
	@Nested
	class Testing
	{
		@Test
		public void post()
		{
			assertEquals(10, m.add(5, 5));
		}
		
		@Test
		public void div()
		{
			assertEquals(5, m.div(10, 2));
		}
		
		@Test
		public void div1()
		{
			assertThrows(ArithmeticException.class, ()->m.div(10, 0));
			
		}

	}
	
	@Test
	public void balanceCheck()
	{
		Bank b = new Bank("Sumanth",50000);
		assertThrows(LimitExceededException.class, ()->b.deposit(50000));
	}
	
	@Test
	public void balance() throws LimitExceededException
	{
		Bank b1 = new Bank("varun",25000);
		assertEquals(30000,b1.deposit(5000));
	}
	
	@Test
	public void withdraw() throws WithdrawException
	{
		Bank w = new Bank("varun",25000);
		assertThrows(WithdrawException.class, ()->w.withdraw(30000));
	}
	
	@Test
	public void withdraw1() throws WithdrawException
	{
		Bank w = new Bank("varun",25000);
		assertEquals(20000,w.withdraw(5000));
	}
	
	@Test
	void check() {
		
		Factorial f = new Factorial();
		assertAll(
				()->assertEquals(-24, f.check(-4)),
				()->assertEquals(120, f.check(5)),
				()->assertEquals(24.0f,f.check(4.0f))
				);
	}
	
	@Test
	void checkSorting()
	{
		int[] arr = {90,50,10,30};
		int[] arr1 ={10,30,50,90};
		Sorting s = new Sorting();
		assertArrayEquals(arr1,s.check(arr));
	
	}
	
	@Test
	void checkSortingDesc()
	{
		int[] arr ={90,50,10,30};
		int[] arr1 ={90,50,30,10};
		Sorting s = new Sorting();
		assertArrayEquals(arr1,s.desc(arr));
	
	}

}
