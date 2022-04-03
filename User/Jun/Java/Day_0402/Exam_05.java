//score 정수 배열에 n개의 자료가 저장되어 있을경우
//합계구하기 ,최대값 구하기 ,최소값 구하기,평균에 가장 가까운값 구하기

public class Exam_05 {

	public static void main(String[] args) {
		int[] score = {90,55,77,88,35,67};
		int max= score[0];
		int min= score[0];
		int sum= score[0];
		for(int x=1; x<score.length; x++) {
			if(max < score[x]) {
				max=score[x];
			}else if(min > score[x]) 
			{
				min=score[x];
			}
			sum+=score[x];
		}
		System.out.println("Max :" + max);
		System.out.println("Min :" + min);
		System.out.println("Sum :" + sum);
	}

}
