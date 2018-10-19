import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Del
{
	BSTreeLink2 lst = new BSTreeLink2();
	
	@Test ( expected = IllegalArgumentException.class)
	public void test_del_0()
	{
		int[] ini = {};
		lst.init(ini);
		lst.del(1);
	}
	
	@Test 
	public void test_del_1()
	{
		int[] ini = {50};
		lst.init(ini);
		lst.del(50);
		int [] exp = {};
		int [] act = lst.toArray();
		for (int v : act)
		    System.out.println(lst.size());
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_del_2()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.del(25);
		int [] exp = {7,11,18,28,34,50,65,70,90};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_del_meny_1()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.del(7);
		int [] exp = {11,18,25,28,34,50,65,70,90};
		int [] act = lst.toArray();
		for (int v : exp)
		    System.out.println(v);
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_del_meny_2()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.del(34);
		int [] exp = {7,11,18,25,28,50,65,70,90};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test 
	public void test_del_meny_3()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		lst.del(70);
		int [] exp = {7,11,18,25,28,34,50,65,90};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

}
