//매서드의 호출 (call by value, call by reference)
public class Exam_17 {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("a="+a+",b="+b);
		swap(a,b);
		System.out.println("a="+a+",b="+b);
	}

	static void swap(int a, int b) {
		int c=a;
		a=b;
		b=c;
		
	}
}
