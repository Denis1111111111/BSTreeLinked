import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_Clear 
{
	BSTreeLink2 lst = new BSTreeLink2();
	
	@Test 
	public void test_clear_null()
	{
		int [] ini = null;
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test 
	public void test_clear_1l()
	{
		int [] ini = {50};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test 
	public void test_clear_2()
	{
		int [] ini = {50,25};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test 
	public void test_clear_many()
	{
		int [] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}
}
