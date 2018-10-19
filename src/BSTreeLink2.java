public class BSTreeLink2  implements BsTree_Link_Interface 
{
	Link root = new Link();

	class Link
	{
		Node node = null;
	}

	class Node 
	{
		Link left = new Link();
		Link right = new Link();
		Link link = new Link();
		int val;

		public Node ( int val )
		{
			this.val = val;
		}
	}

	@Override
	public void clear() 
	{
		root.node = null;
	}

	@Override
	public void init(int[] ini) 
	{
		if ( ini == null )
		{
			ini = new int[0];
		}
		clear();
		for ( int i = 0; i < ini.length; i++ )
		{
			add( ini[i] );
		}
	}

	@Override
	public int size() 
	{
		return sizeNode(root);
	}

	private int sizeNode(Link p) 
	{
		if ( p.node == null )
		{
			return 0;
		}
		int res = 0;
		res += sizeNode(p.node.left);
		res++;
		res += sizeNode(p.node.right);
		return res;
	}

	@Override
	public void add( int val ) 
	{
		addNode ( root, val );
	}

	private void addNode ( Link p, int val ) 
	{
		if ( p.node == null )
		{
			p.node = new Node(val);
			p.node.link = p;
		}		
		else 
			if ( val < p.node.val )
			{
				addNode( p.node.left, val );
			}
			else 
			{
				addNode( p.node.right, val );
			}
	}

	@Override
	public int nodes() 
	{
		return nodesNode(root);
	}

	private int nodesNode ( Link p ) 
	{
		int count = 0;
		if ( p.node == null )
		{
			return 0;
		}
		if ( p.node.left.node != null && p.node.right.node != null  )
		{
			count += nodesNode(p.node.left) + nodesNode(p.node.right);
			count ++;
		}
		return count;
	}

	@Override
	public int leaves() 
	{
		return nodeLeaves ( root );
	}

	private int nodeLeaves ( Link p ) 
	{
		int count = 0;
		if ( p.node == null )
		{
			return 0;
		}
		if ( p.node.left.node == null && p.node.left.node == null )
		{
			count++;
		}
		count += nodeLeaves(p.node.left) + nodeLeaves(p.node.right);
		return count;
	}
	@Override
	public int height()
	{
		int res = 0;
		if(root.node == null)
		{
			return res;
		}
		else
			res = heightNode(root);
		return res;
	}

	private int heightNode(Link p)
	{
		if(p.node == null)
		{
			return 0;
		}
		else
		{
			return 1 + Math.max(heightNode(p.node.left), heightNode(p.node.right));
		}
	}

	@Override
	public int width() 
	{
		int[]ar = new int[height()];
		widthNode ( root, ar, 0 );
		return max(ar);
	}

	private void widthNode(Link p, int[] ar, int lvl) 
	{
		if ( p.node == null )
		{
			return;
		}
		widthNode(p.node.left, ar, lvl+1);
		ar[lvl]++;
		widthNode(p.node.right, ar, lvl+1);
	}

	private int max(int[] ar) 
	{
		if ( ar == null || ar.length == 0 )
		{
			return 0;
		}
		int val = ar[0];
		for ( int i = 0; i < ar.length; i++ )
		{
			if ( ar[i] > val )
			{
				val = ar[i];
			} 
		}
		return val;
	}

	@Override
	public int[] toArray() 
	{
		int [] ar = new int[size()];
		nodeToArray ( root, ar, new Counter() );
		return ar;
	}

	private void nodeToArray ( Link p, int[] ar, Counter ii ) 
	{
		if ( p.node == null )
		{
			return;
		}
		nodeToArray(p.node.left, ar, ii);
		ar [ ii.i++ ] = p.node.val;
		nodeToArray(p.node.right, ar, ii);
	}

	class Counter
	{
		int i = 0;
	}

//	@Override
//	public void del(int val)
//	{
//		if ( root.node == null )
//			return;
//		delNode(val,root);
//	}
//	
//	
//	private void delNode(int val,Link p)
//	{
//		if ( p.node == null )
//			 throw new IllegalArgumentException();
//
//		 if ( val < p.node.val )
//		 {
//			 delNode(val , p.node.left );
//		 }
//		 else if ( val > p.node.val )
//		 {
//			 delNode(val, p.node.right );
//		 }
//		 else
//		 {
//			 if ( p.node.left == null && p.node.right == null )
//			 {
//				 if ( p.node == root.node )
//				 {
//					 root.node = null;
//				 }
//				 else 
//				 {
//					 if ( cur == par.left )
//					 {
//						 par.left = null;
//					 }
//					 else 
//					 {
//						 par.right = null;
//					 }
//				 }
//			 }
//	}
	
	
	
	
	
	
//	@Override
//	public void del(int val) 
//	{
//		if ( root == null )
//			throw new IllegalArgumentException();
//		delNode(val,root);
//	}
//
//	private void delNode(int val,Link p)
//	{
//		if ( p.node == null )
//			throw new IllegalArgumentException();
//
//		if(val < p.node.val)
//		{
//			delNode(val,p.node.left);
//		}
//
//		if(val > p.node.val)
//		{
//			delNode(val,p.node.right);
//		}
//
//		else 
//		{
//			if(p.node.left == null && p.node.right == null)
//			{
//				p.node = null;
//			}
//
//			if(p.node.left == null)
//			{
//				p.node = p.node.right.node;
//				p.node.link = p;
//			}
//
//			if(p.node.right == null)
//			{
//				p.node = p.node.left.node;
//				p.node.link = p;
//			}
//
////			if(p.node.right != null && p.node.left != null)
////			{
////				p.node.right.node.left = p.node.left;
////				//	p.node.left.node.link = p.node.right.node.left;
////
////				p.node.right.node.link = p;
////				p.node = p.node.right.node;
//				
//				 else if ( p.node.right.node != null && p.node.left.node != null )
//				   {
//				    p.node.right.node.right.node = p.node.right.node.left.node;
//				    p.node.right.node.left.node = p.node.left.node;
//				    p.node = p.node.right.node;
//				    p.node.link = p;
//				   }
//			}
//		}
////	}
	
	@Override
	 public void del(int val) 
	 {
	  nodeDell ( root, val );
	 }

	 private void nodeDell(Link p, int val) 
	 {
	  if ( p.node == null )
	   throw new IllegalArgumentException();
	  if ( val < p.node.val )
	  {
	   nodeDell(p.node.left, val);
	  }
	  else if ( val > p.node.val )
	  {
	   nodeDell(p.node.right, val);
	  }
	  else
	  {
	   if ( p.node.left.node == null && p.node.right.node == null )
	   {   
	    p.node = null;
	   }
	   else if ( p.node.left.node == null )
	   {
	    p.node = p.node.right.node;
	    p.node.link = p;
	   }

	   else if ( p.node.right.node == null )
	   {
	    p.node = p.node.left.node;
	    p.node.link = p;
	   }
	   else if ( p.node.right.node != null && p.node.left.node != null )
	   {
		    p.node.right.node.left = p.node.left;
		    p.node.left.node.link = p.node.right.node.left;
		
		    p.node.right.node.link = p;
		    p.node = p.node.right.node;
	   }
	  }
	 }

	@Override
	public void reverse() 
	{
		{
			reverseNode(root);
		}

	}
	private void reverseNode(Link p)
	{
		if(p.node == null)
			return;
		Link tmp = p.node.left;
		p.node.left = p.node.right;
		p.node.right = tmp;

		reverseNode(p.node.left);
		reverseNode(p.node.right);  
	}



	public boolean chek()
	{
		return checkNode(root);
	}

	private boolean checkNode(Link p) 
	{
		if ( p.node == null )
			return true;
		return checkNode(p.node.left) && p.node.link == p && checkNode(p.node.right);
	}


	public boolean equals(BSTreeLink2 tr)
	{
		return equalsNode ( root, tr.root );
	}

	private boolean equalsNode(Link p, Link k) 
	{
		if ( p.node == null && k.node == null )
			return true;
		return equalsNode(p.node.left, k.node.left) && equalsNode(p.node.right, k.node.right) &&  p.node.val == k.node.val && p.node.link == p && k.node.link == k;
	}
}
