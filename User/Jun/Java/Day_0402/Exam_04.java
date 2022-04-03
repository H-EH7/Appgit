//배열의 선언과 할당 int[] score = new int[5];
//배열의 선언과 초기화 int[] score = {90,55,77,88,35,67};
//score 정수 배열에 n개의 자료가 저장되어 있을경우
//합계구하기 ,최대값 구하기 ,최소값 구하기,평균에 가장 가까운값 구하기

public class Exam_04 {

	public static void main(String[] args) {
		int[] score = {90,55,77,88,35,67};
		
		int sum =0;
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+(double)sum/score.length);
		System.out.println("--------------------------------");
		//(확장 for문)
		int tot =0;
		for(int s : score) {
			tot += s;
		}
		System.out.println("합계 :"+tot);
		System.out.println("평균 :"+(double)tot/score.length);
		
	}

}
