import static org.junit.Assert.*;

import org.junit.Test;

public class Test_To_String 
{

BSTreeLink2 lst = new BSTreeLink2();

	


	@Test 
	public void test_toString_null()
	{
		int[] ini = null;
		lst.init(ini);
		String exp = "";
		String act = lst.toString();
		assertEquals(exp, act);
	}

	@Test 
	public void test_toString_0()
	{
		int[] ini = {};
		lst.init(ini);
		String exp = "";
		String act = lst.toString();
		assertEquals(exp, act);
	}

	@Test 
	public void test_toString_1()
	{
		int[] ini = {1};
		lst.init(ini);
		String exp = "1 ";
		String act = lst.toString();
		assertEquals(exp, act);
	}

	@Test 
	public void test_toString_2()
	{
		int[] ini = {1,7};
		lst.init(ini);
		String exp = "1 7 ";
		String act = lst.toString();
		assertEquals(exp, act);
	}

	@Test 
	public void test_toString_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		String exp = "7 11 18 25 28 34 50 65 70 90 ";
		String act = lst.toString();
		assertEquals(exp, act);
	}
}
