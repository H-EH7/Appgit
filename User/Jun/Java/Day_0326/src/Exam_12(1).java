import java.util.Scanner;
//����3���� �Է¹ھƼ� ���� ū���� ã�Ƽ� ����ϴ� ���α׷� ����
public class Exam_12 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); //��ü����
	System.out.print("���� 3�� �Է�(����,���)=");
	int a= scn.nextInt(); // ������ �Է¹޾Ƽ� a ������ ����
	int b= scn.nextInt(); // ������ �Է¹޾Ƽ� b ������ ����
	int c= scn.nextInt(); // ������ �Է¹޾Ƽ� c ������ ����
	int max=0;
	if(a>b) {
		if(a>c) {
			max=a;
			}else {
				max=c;
			}
		}else {
			if(b>c) {
				max=b;
			}else {
					max=c;
				}
		}
	
	
	/*
	int max = a;
	if(max < b) {
		max=b;}
	if(max <c) {
		max=c;}
*/	
	System.out.println("�ִ밪:"+max);
	
	

	}

}
