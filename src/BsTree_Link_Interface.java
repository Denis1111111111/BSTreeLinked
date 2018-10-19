public interface BsTree_Link_Interface 
{
	void clear();
	void init ( int[] ar );
	int size();
	void add ( int val );
	int nodes(); // ���������� �����
	int leaves(); // ������� �����
	int height(); // ���� ��. ������
	int width(); // ������ ������ 
	String toString();
	int[] toArray();
	void del ( int val ); // �� ������ ��.
	void reverse();
}
