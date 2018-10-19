import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Size
{
	BSTreeLink2 lst = new BSTreeLink2();

	@Test 
	public void test_size_null()
	{
		int [] ini = null;
		lst.init(ini);
		assertEquals(0, lst.size());
	}
	@Test 
	public void test_size_0()
	{
		int [] ini = {};
		lst.init(ini);
		assertEquals(0, lst.size());
	}
	@Test 
	public void test_size_1()
	{
		int [] ini = {50};
		lst.init(ini);
		assertEquals(1, lst.size());
	}
	@Test 
	public void test_size_2()
	{
		int [] ini = {50,25};
		lst.init(ini);
		assertEquals(2, lst.size());
	}
	@Test 
	public void test_size_many()
	{
		int [] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		assertEquals(10, lst.size());
	}

}
