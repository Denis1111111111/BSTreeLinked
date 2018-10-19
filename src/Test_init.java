import static org.junit.Assert.*;

import org.junit.Test;

public class Test_init 
{
	BSTreeLink2 lst = new BSTreeLink2();
	@Test 
	public void test_init_null()
	{
		int[] ini = null;
		lst.init(ini);
		assertEquals(0, lst.size());
	}

	@Test 
	public void test_init_0()
	{
		int[] ini = {};
		lst.init(ini);
		assertEquals(0, lst.size());
	}

	@Test 
	public void test_init_1()
	{
		int[] ini = {5};
		lst.init(ini);
		assertEquals(1, lst.size());
	}

	@Test 
	public void test_init_2()
	{
		int[] ini = {2,6};
		lst.init(ini);
		assertEquals(2, lst.size());
	}

	@Test 
	public void test_init_many_event()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		assertEquals(10, lst.size());
	}

	@Test 
	public void test_init_many_odd()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65,69};
		lst.init(ini);
		assertEquals(11, lst.size());
	}

}
