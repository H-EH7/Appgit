//score ���� �迭�� n���� �ڷᰡ ����Ǿ� �������
//�հ豸�ϱ� ,�ִ밪 ���ϱ� ,�ּҰ� ���ϱ�,��տ� ���� ���� ���ϱ�

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
