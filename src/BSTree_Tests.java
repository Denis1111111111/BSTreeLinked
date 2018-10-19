
import static org.junit.Assert.*;
import org.junit.Test;

public class BSTree_Tests 
{
	BSTreeLink2 lst = new BSTreeLink2();
//	BsTree lst = new BsTree();

//	//===========================================================
//	// clear
//	//===========================================================
//
//	@Test 
//	public void test_clear_null()
//	{
//		int [] ini = null;
//		lst.init(ini);
//		lst.clear();
//		assertEquals(0, lst.size());
//	}
//
//	@Test 
//	public void test_clear_1l()
//	{
//		int [] ini = {50};
//		lst.init(ini);
//		lst.clear();
//		assertEquals(0, lst.size());
//	}
//
//	@Test 
//	public void test_clear_2()
//	{
//		int [] ini = {50,25};
//		lst.init(ini);
//		lst.clear();
//		assertEquals(0, lst.size());
//	}
//
//	@Test 
//	public void test_clear_many()
//	{
//		int [] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		lst.clear();
//		assertEquals(0, lst.size());
//	}
//
//	//===========================================================
//	// init
//	//===========================================================
//
//	@Test 
//	public void test_init_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		assertEquals(0, lst.size());
//	}
//
//	@Test 
//	public void test_init_0()
//	{
//		int[] ini = {};
//		lst.init(ini);
//		assertEquals(0, lst.size());
//	}
//
//	@Test 
//	public void test_init_1()
//	{
//		int[] ini = {5};
//		lst.init(ini);
//		assertEquals(1, lst.size());
//	}
//
//	@Test 
//	public void test_init_2()
//	{
//		int[] ini = {2,6};
//		lst.init(ini);
//		assertEquals(2, lst.size());
//	}
//
//	@Test 
//	public void test_init_many_event()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		assertEquals(10, lst.size());
//	}
//
//	@Test 
//	public void test_init_many_odd()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65,69};
//		lst.init(ini);
//		assertEquals(11, lst.size());
//	}
//
//	//===========================================================
//	// size
//	//===========================================================
//
//	@Test 
//	public void test_size_null()
//	{
//		int [] ini = null;
//		lst.init(ini);
//		assertEquals(0, lst.size());
//	}
//	@Test 
//	public void test_size_0()
//	{
//		int [] ini = {};
//		lst.init(ini);
//		assertEquals(0, lst.size());
//	}
//	@Test 
//	public void test_size_1()
//	{
//		int [] ini = {50};
//		lst.init(ini);
//		assertEquals(1, lst.size());
//	}
//	@Test 
//	public void test_size_2()
//	{
//		int [] ini = {50,25};
//		lst.init(ini);
//		assertEquals(2, lst.size());
//	}
//	@Test 
//	public void test_size_many()
//	{
//		int [] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		assertEquals(10, lst.size());
//	}
//
//	//===========================================================
//	// add
//	//===========================================================
//
//	@Test 
//	public void test_add_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		lst.add(50);
//		int[] exp = {50};
//		int[] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_add_0()
//	{
//		int[] ini = {};
//		lst.init(ini);
//		lst.add(50);
//		int[] exp = {50};
//		int[] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_add_1()
//	{
//		int[] ini = {50};
//		lst.init(ini);
//		lst.add(25);
//		int[] exp = {25,50};
//		int[] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_add_2()
//	{
//		int[] ini = {50,25};
//		lst.init(ini);
//		lst.add(11);
//		int[] exp = {11,25,50};
//		int[] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_add_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90};
//		lst.init(ini);
//		lst.add(28);
//		int[] exp = {7,11,18,25,28,34,50,70,90};
//		int[] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	//===========================================================
//	// nodes
//	//===========================================================
//
//	@Test 
//	public void test_nodes_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		int act = lst.nodes();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_nodes_1()
//	{
//		int[] ini = {50};
//		lst.init(ini);
//		int act = lst.nodes();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_nodes_2()
//	{
//		int[] ini = {50,25};
//		lst.init(ini);
//		int act = lst.nodes();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_nodes_3()
//	{
//		int[] ini = {50,25,70};
//		lst.init(ini);
//		int act = lst.nodes();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_nodes_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		int exp = 4;
//		int act = lst.nodes();
//		assertEquals(exp, act);
//	}
//
//	//===========================================================
//	// leaves
//	//===========================================================
//
//	@Test 
//	public void test_leaves_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		int act = lst.leaves();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_leaves_0()
//	{
//		int[] ini = {};
//		lst.init(ini);
//		int act = lst.leaves();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_leaves_1()
//	{
//		int[] ini = {50};
//		lst.init(ini);
//		int act = lst.leaves();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_leaves_2()
//	{
//		int[] ini = {50,25};
//		lst.init(ini);
//		int act = lst.leaves();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_leaves_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		int exp = 5;
//		int act = lst.leaves();
//		assertEquals(exp, act);
//	}
//
//	//===========================================================
//	// height
//	//===========================================================
//
//	@Test 
//	public void test_height_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		int act = lst.height();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_height_0()
//	{
//		int[] ini = {0};
//		lst.init(ini);
//		int act = lst.height();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_height_1()
//	{
//		int[] ini = {50};
//		lst.init(ini);
//		int act = lst.height();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_height_2()
//	{
//		int[] ini = {50,25};
//		lst.init(ini);
//		int act = lst.height();
//		assertEquals(2, act);
//	}
//
//	@Test 
//	public void test_height_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		int exp = 4;
//		int act = lst.height();
//		assertEquals(exp, act);
//	}
//
	//===========================================================
	// width
	//===========================================================

//	@Test 
//	public void test_width_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		int act = lst.width();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_width_0()
//	{
//		int[] ini = {};
//		lst.init(ini);
//		int act = lst.width();
//		assertEquals(0, act);
//	}
//
//	@Test 
//	public void test_width_1()
//	{
//		int[] ini = {50};
//		lst.init(ini);
//		int act = lst.width();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_width_2()
//	{
//		int[] ini = {50,25};
//		lst.init(ini);
//		int act = lst.width();
//		assertEquals(1, act);
//	}
//
//	@Test 
//	public void test_width_3()
//	{
//		int[] ini = {50,25,70};
//		lst.init(ini);
//		int act = lst.width();
//		assertEquals(2, act);
//	}
//
//	@Test 
//	public void test_width_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		int exp = 4;
//		int act = lst.width();
//		assertEquals(exp, act);
//	}

//	//===========================================================
//	// toString
//	//===========================================================
//
//	@Test 
//	public void test_toString_null()
//	{
//		int[] ini = null;
//		lst.init(ini);
//		String exp = "";
//		String act = lst.toString();
//		assertEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toString_0()
//	{
//		int[] ini = {};
//		lst.init(ini);
//		String exp = "";
//		String act = lst.toString();
//		assertEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toString_1()
//	{
//		int[] ini = {1};
//		lst.init(ini);
//		String exp = "1 ";
//		String act = lst.toString();
//		assertEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toString_2()
//	{
//		int[] ini = {1,7};
//		lst.init(ini);
//		String exp = "1 7 ";
//		String act = lst.toString();
//		assertEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toString_many()
//	{
//		int[] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		String exp = "7 11 18 25 28 34 50 65 70 90 ";
//		String act = lst.toString();
//		assertEquals(exp, act);
//	}
//
//	//===========================================================
//	// toArray
//	//===========================================================
//
//	@Test 
//	public void test_toArray_null()
//	{
//		int [] ini = null;
//		lst.init(ini);
//		int [] exp = {};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toArray_0()
//	{
//		int [] ini = {};
//		lst.init(ini);
//		int [] exp = {};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toArray_1()
//	{
//		int [] ini = {50};
//		lst.init(ini);
//		int [] exp = {50};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toArray_2()
//	{
//		int [] ini = {50,25};
//		lst.init(ini);
//		int [] exp = {25,50};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	@Test 
//	public void test_toArray_many()
//	{
//		int [] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		int [] exp = {7,11,18,25,28,34,50,65,70,90};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//
//	//===========================================================
//	// del
//	//===========================================================
//	
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
		int[] ini = {50,25};
		lst.init(ini);
		lst.del(25);
		
		    System.out.println(6);
		int [] exp = {50};
		for (int v : ini)
		    System.out.println(v);
		int [] act = lst.toArray();
		for (int v : act)
		    System.out.println(v);
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
//
//	//===========================================================
//	// reverse
//	//===========================================================
//
//	@Test 
//	public void test_reverse_null()
//	{
//		int [] ini = null;
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//	
//	@Test 
//	public void test_reverse_0()
//	{
//		int [] ini = {};
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//	
//	@Test 
//	public void test_reverse_1()
//	{
//		int [] ini = {50};
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {50};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//	
//	@Test 
//	public void test_reverse_2()
//	{
//		int [] ini = {50,25};
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {50,25};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//	
//	@Test 
//	public void test_reverse_3()
//	{
//		int [] ini = {50,25,11};
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {50,25,11};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
//	
//	@Test 
//	public void test_reverse_many()
//	{
//		int [] ini = {50,25,11,7,34,18,70,90,28,65};
//		lst.init(ini);
//		lst.reverse();
//		int [] exp = {90,70,65,50,34,28,25,18,11,7};
//		int [] act = lst.toArray();
//		assertArrayEquals(exp, act);
//	}
}