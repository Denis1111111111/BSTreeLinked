import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Reverse 
{
	BSTreeLink2 lst = new BSTreeLink2();
	
	@Test 
	public void test_reverse_null()
	{
		int [] ini = null;
		lst.init(ini);
		lst.reverse();
		int [] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_reverse_0()
	{
		int [] ini = {};
		lst.init(ini);
		lst.reverse();
		int [] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_reverse_1()
	{
		int [] ini = {50};
		lst.init(ini);
		lst.reverse();
		int [] exp = {50};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_reverse_2()
	{
		int [] ini = {50,25};
		lst.init(ini);
		lst.reverse();
		int [] exp = {50,25};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_reverse_3()
	{
		int [] ini = {50,25,11};
		lst.init(ini);
		lst.reverse();
		int [] exp = {50,25,11};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_reverse_many()
	{
		int [] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.reverse();
		int [] exp = {90,70,65,50,34,28,25,18,11,7};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
}
