/*�޼��� ���� �� ȣ��
��ȯŸ�� �޼ҵ� �̸�(�Ű����� ����Ʈ)*/

public class Exam_16 {
	public static void main(String[] args) {
	int s = sum();
	System.out.println("�ż��� ȣ���׽�Ʈ");
	print();
	test(10,20);
	add(2,20);
	System.out.println("s="+s);
	System.out.println("s="+s);
	System.out.println("�ż��� ȣ�� ��");
	
	}
	//��ȯŸ��x �Ű�����o
	static void test(int n, int m) {
		int s= n+m;
		System.out.println("s"+s);
	}
	//��ȯŸ��x �Ű�����x
	static void print() {
		System.out.println("print() �żҵ尡 ȣ���");
	}
	//��ȯŸ��o �Ű�����x
	static int sum() {
		int sum =0;
		for(int x=1; x<=10; x++) {
			sum+=x;
		}
		return sum;
	}
	//��ȯŸ��o �Ű�����o
	static int add(int n, int m) {
		int s=0;
		for(int x=n; x<=m; x++) {
			s+=x;
		}
		return s;
	}
}
