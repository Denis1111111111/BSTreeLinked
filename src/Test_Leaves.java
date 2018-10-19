import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Leaves 
{

BSTreeLink2 lst = new BSTreeLink2();

	
	
	@Test 
	public void test_leaves_null()
	{
		int[] ini = null;
		lst.init(ini);
		int act = lst.leaves();
		assertEquals(0, act);
	}

	@Test 
	public void test_leaves_0()
	{
		int[] ini = {};
		lst.init(ini);
		int act = lst.leaves();
		assertEquals(0, act);
	}

	@Test 
	public void test_leaves_1()
	{
		int[] ini = {50};
		lst.init(ini);
		int act = lst.leaves();
		assertEquals(1, act);
	}

	@Test 
	public void test_leaves_2()
	{
		int[] ini = {50,25};
		lst.init(ini);
		int act = lst.leaves();
		assertEquals(1, act);
	}

	@Test 
	public void test_leaves_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		int exp = 5;
		int act = lst.leaves();
		assertEquals(exp, act);
	}

}
