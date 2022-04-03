/*메서드 생성 및 호출
반환타입 메소드 이름(매개변수 리스트)*/

public class Exam_16 {
	public static void main(String[] args) {
	int s = sum();
	System.out.println("매서드 호출테스트");
	print();
	test(10,20);
	add(2,20);
	System.out.println("s="+s);
	System.out.println("s="+s);
	System.out.println("매서드 호출 끝");
	
	}
	//반환타입x 매개변수o
	static void test(int n, int m) {
		int s= n+m;
		System.out.println("s"+s);
	}
	//반환타입x 매개변수x
	static void print() {
		System.out.println("print() 매소드가 호출됨");
	}
	//반환타입o 매개변수x
	static int sum() {
		int sum =0;
		for(int x=1; x<=10; x++) {
			sum+=x;
		}
		return sum;
	}
	//반환타입o 매개변수o
	static int add(int n, int m) {
		int s=0;
		for(int x=n; x<=m; x++) {
			s+=x;
		}
		return s;
	}
}
