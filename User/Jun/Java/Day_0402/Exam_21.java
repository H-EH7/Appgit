//��ü���� ����
class Student{
	int hakbun;
	String name;
	int age;
	
	Student(){}
	Student(int hakbun){
		this.hakbun=hakbun;
	}
	
	void hakprint() {
		System.out.println("�й�:"+hakbun);
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}
public class Exam_21 {

	public static void main(String[] args) {
		Student stu1 = new Student();//������
		stu1.hakbun =1101;
		stu1.name ="���л�";
		stu1.age =25;
		stu1.hakprint();
	}

}
