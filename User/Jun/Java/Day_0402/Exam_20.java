class Phone{
	//��� ����(�ʵ�)
	String company;
	String os;
	int inch;
	
	//��� �޼ҵ�
	void send(String tel) {//��������
		System.out.println(tel+"��ȣ�� ��ȭ�� �Ǵ�");
	}
	void reserve() {
		System.out.println("��ȭ�� ����");
	}
}

public class Exam_20 {

	public static void main(String[] args) {
		int a;
		Phone p1,p2,p3;//���� ����(�ν��Ͻ� ����)
		p1 = new Phone();//��ü ����(�ν��ͽ��� ����)
		p1.company="�Ｚ";
		p1.os ="�ȵ���̵�";
		p1.inch =12;
		p1.send("01012341234");
		p1.reserve();
		System.out.println("�ڵ��� �������"+p1.company);
	}

}
