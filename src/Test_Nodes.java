import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Nodes 
{
	BSTreeLink2 lst = new BSTreeLink2();

	@Test 
	public void test_nodes_null()
	{
		int[] ini = null;
		lst.init(ini);
		int act = lst.nodes();
		assertEquals(0, act);
	}

	@Test 
	public void test_nodes_1()
	{
		int[] ini = {50};
		lst.init(ini);
		int act = lst.nodes();
		assertEquals(0, act);
	}

	@Test 
	public void test_nodes_2()
	{
		int[] ini = {50,25};
		lst.init(ini);
		int act = lst.nodes();
		assertEquals(0, act);
	}

	@Test 
	public void test_nodes_3()
	{
		int[] ini = {50,25,70};
		lst.init(ini);
		int act = lst.nodes();
		assertEquals(1, act);
	}

	@Test 
	public void test_nodes_many()
	{
		int[] ini = {50,25,11,7,34,18,70,90,28,65};
		lst.init(ini);
		int exp = 4;
		int act = lst.nodes();
		assertEquals(exp, act);
	}


}
