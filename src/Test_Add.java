import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Add 
{
	BSTreeLink2 lst = new BSTreeLink2();

	@Test 
	public void test_add_null()
	{
		int[] ini = null;
		lst.init(ini);
		lst.add(50);
		int[] exp = {50};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_add_0()
	{
		int[] ini = {};
		lst.init(ini);
		lst.add(50);
		int[] exp = {50};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_add_1()
	{
		int[] ini = {50};
		lst.init(ini);
		lst.add(25);
		int[] exp = {25,50};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_add_2()
	{
		int[] ini = {50,25};
		lst.init(ini);
		lst.add(11);
		int[] exp = {11,25,50};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test 
	public void test_add_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90};
		lst.init(ini);
		lst.add(28);
		int[] exp = {7,11,18,25,28,34,50,70,90};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

}
