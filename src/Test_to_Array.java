import static org.junit.Assert.*;

import org.junit.Test;

public class Test_to_Array 
{

	BSTreeLink2 lst = new BSTreeLink2();

	

	@Test 
	public void test_toArray_null()
	{
		int [] ini = null;
		lst.init(ini);
		int [] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_toArray_0()
	{
		int [] ini = {};
		lst.init(ini);
		int [] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_toArray_1()
	{
		int [] ini = {50};
		lst.init(ini);
		int [] exp = {50};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_toArray_2()
	{
		int [] ini = {50,25};
		lst.init(ini);
		int [] exp = {25,50};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_toArray_many()
	{
		int [] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		int [] exp = {7,11,18,25,28,34,50,65,70,90};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}


}
