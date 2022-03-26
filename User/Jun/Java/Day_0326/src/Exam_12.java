import java.util.Scanner;
//정수3개를 입력박아서 가장 큰값을 찾아서 출력하는 프로그램 생성
public class Exam_12 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); //객체생성
	System.out.print("정수 3개 입력(구분,사용)=");
	int a= scn.nextInt(); // 정수를 입력받아서 a 변수에 대입
	int b= scn.nextInt(); // 정수를 입력받아서 b 변수에 대입
	int c= scn.nextInt(); // 정수를 입력받아서 c 변수에 대입
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
	System.out.println("최대값:"+max);
	
	

	}

}
