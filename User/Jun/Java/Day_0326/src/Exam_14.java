import java.util.Scanner;
//키보드로 정수 입력을 받아서 홀수 짝수 구분하기

public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int val = scn.nextInt();
		if(val%2==0) {System.out.println(val+"은 짝수입니다"); }
		else {System.out.println(val+"은 홀수입니다"); }
	}

}
