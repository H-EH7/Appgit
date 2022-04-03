//객체지향 예제
class Student{
	int hakbun;
	String name;
	int age;
	
	Student(){}
	Student(int hakbun){
		this.hakbun=hakbun;
	}
	
	void hakprint() {
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
public class Exam_21 {

	public static void main(String[] args) {
		Student stu1 = new Student();//생성자
		stu1.hakbun =1101;
		stu1.name ="김학생";
		stu1.age =25;
		stu1.hakprint();
	}

}
