//Ư�� ���� ���� ����� �� ã��

public class Exam_06 {
	public static void main(String[] args) {
		int[] val = {78,85,90,57,70,65,95};
		//80�� ���� ����� �� ã��
		int min=(val[0]>80)?val[0]-80 : 80-val[0];//���� Math.abs �� ���� ȿ��
		//int min = Math.abs(val[0]-80);
		int value =val[0];
		for(int x =1; x<val.length; x++) {
			int temp;
			if(val[x]>80) {
				temp= val[x]-80;
			}else {
				temp = 80-val[x];
			}
			//������ �ּҰ� ã��
			if(min > temp) {
				min=temp;
				value = val[x];
			}
		}
		System.out.println("80�� ���� ����� ���� : " + value);
	}

}
