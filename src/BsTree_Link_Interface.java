public interface BsTree_Link_Interface 
{
	void clear();
	void init ( int[] ar );
	int size();
	void add ( int val );
	int nodes(); // количество узлов
	int leaves(); // крайняя точка
	int height(); // макс ур. дерева
	int width(); // ширина дерева 
	String toString();
	int[] toArray();
	void del ( int val ); // уд олного эл.
	void reverse();
}
