class Phone{
	//멤버 변수(필드)
	String company;
	String os;
	int inch;
	
	//멤버 메소드
	void send(String tel) {//지역변수
		System.out.println(tel+"번호로 전화를 건다");
	}
	void reserve() {
		System.out.println("전화가 오다");
	}
}

public class Exam_20 {

	public static void main(String[] args) {
		int a;
		Phone p1,p2,p3;//참조 변수(인스턴스 변수)
		p1 = new Phone();//객체 생성(인스터스가 생성)
		p1.company="삼성";
		p1.os ="안드로이드";
		p1.inch =12;
		p1.send("01012341234");
		p1.reserve();
		System.out.println("핸드폰 제조사는"+p1.company);
	}

}
