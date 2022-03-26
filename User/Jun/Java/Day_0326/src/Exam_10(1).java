//3개의 정수 중에서 가장 큰값을 찾아서 출력
public class Exam_10 {

	public static void main(String[] args) {
	int a=90,b=77,c=95;
	int max =(a>b)?a : b;
	max = (max > c) ? max :c;
	System.out.println("max:"+max);
	
	}

}
