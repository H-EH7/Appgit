import java.util.Scanner;

//��ȣ, ����, ����, ���� �Է¹޾Ƽ� ��������� ���ϰ� 
//��տ� ���� ������ ���Ͽ� ���(100~90->A, 89~80->B, 79~70->C, 69~60->D 59~0->F)
public class Exam_13 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("input : ");
		int bun = s.nextInt();
		int kor = s.nextInt();
		int eng = s.nextInt();
		int mat = s.nextInt();
		int tot = kor+eng+mat;
		double ave = (double)tot/3;
		String hakjum="";
		if(ave<=100 && ave>=90) {hakjum="A";}
		else if(ave>=80) {hakjum="B";}
		else if(ave>=70) {hakjum="C";}
		else if(ave>=60) {hakjum="D";}
		else {hakjum="F";}
		
		System.out.println("�й�"+bun);
		System.out.println("����"+tot);
		System.out.println("���"+ave);
		System.out.println("����"+hakjum);

	}

}
