//�迭�� ����� �Ҵ� int[] score = new int[5];
//�迭�� ����� �ʱ�ȭ int[] score = {90,55,77,88,35,67};
//score ���� �迭�� n���� �ڷᰡ ����Ǿ� �������
//�հ豸�ϱ� ,�ִ밪 ���ϱ� ,�ּҰ� ���ϱ�,��տ� ���� ���� ���ϱ�

public class Exam_04 {

	public static void main(String[] args) {
		int[] score = {90,55,77,88,35,67};
		
		int sum =0;
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
		}
		System.out.println("�հ� :"+sum);
		System.out.println("��� :"+(double)sum/score.length);
		System.out.println("--------------------------------");
		//(Ȯ�� for��)
		int tot =0;
		for(int s : score) {
			tot += s;
		}
		System.out.println("�հ� :"+tot);
		System.out.println("��� :"+(double)tot/score.length);
		
	}

}
