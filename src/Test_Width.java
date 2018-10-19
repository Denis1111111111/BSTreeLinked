import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Width 
{

BSTreeLink2 lst = new BSTreeLink2();

	

	//===========================================================
	// width
	//===========================================================

	@Test 
	public void test_width_null()
	{
		int[] ini = null;
		lst.init(ini);
		int act = lst.width();
		assertEquals(0, act);
	}

	@Test 
	public void test_width_0()
	{
		int[] ini = {};
		lst.init(ini);
		int act = lst.width();
		assertEquals(0, act);
	}

	@Test 
	public void test_width_1()
	{
		int[] ini = {50};
		lst.init(ini);
		int act = lst.width();
		assertEquals(1, act);
	}

	@Test 
	public void test_width_2()
	{
		int[] ini = {50,25};
		lst.init(ini);
		int act = lst.width();
		assertEquals(1, act);
	}

	@Test 
	public void test_width_3()
	{
		int[] ini = {50,25,70};
		lst.init(ini);
		int act = lst.width();
		assertEquals(2, act);
	}

	@Test 
	public void test_width_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		int exp = 4;
		int act = lst.width();
		assertEquals(exp, act);
	}

}
