import java.util.Scanner;
//Ű����� ���� �Է��� �޾Ƽ� Ȧ�� ¦�� �����ϱ�

public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int val = scn.nextInt();
		if(val%2==0) {System.out.println(val+"�� ¦���Դϴ�"); }
		else {System.out.println(val+"�� Ȧ���Դϴ�"); }
	}

}
