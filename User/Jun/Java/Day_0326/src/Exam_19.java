import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수입력:");
		int score = scn.nextInt();//4
		int x;
		for(x=2; x<=score; x++) {
			if(score%x==0)
				break;
		
		}
		if(score==x)
			System.out.println(score);
		else
			System.out.println("Error");

	}

}
