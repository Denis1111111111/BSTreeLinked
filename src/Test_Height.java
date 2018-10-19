import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Height
{

	BSTreeLink2 lst = new BSTreeLink2();

	//===========================================================
	// height
	//===========================================================

	@Test 
	public void test_height_null()
	{
		int[] ini = null;
		lst.init(ini);
		int act = lst.height();
		assertEquals(0, act);
	}

	@Test 
	public void test_height_0()
	{
		int[] ini = {0};
		lst.init(ini);
		int act = lst.height();
		assertEquals(1, act);
	}

	@Test 
	public void test_height_1()
	{
		int[] ini = {50};
		lst.init(ini);
		int act = lst.height();
		assertEquals(1, act);
	}

	@Test 
	public void test_height_2()
	{
		int[] ini = {50,25};
		lst.init(ini);
		int act = lst.height();
		assertEquals(2, act);
	}

	@Test 
	public void test_height_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		int exp = 4;
		int act = lst.height();
		assertEquals(exp, act);
	}

}
