//����(����, ����)
public class Exam_09 {

	public static void main(String[] args) {
		int score[] = {78,56,80,95,77,65};
		System.out.print("Data :" );
		for(int x=0; x<6; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		System.out.print("Sort : ");
		for(int x=0; x<5; x++){//������ �Ǵ� ��
			for(int y=x+1; y<6; y++) {//�񱳵ǻ�
				if(score[x]>score[y]) {
					int temp = score[x];
					score[x] = score[y];
					score[y] = temp;
		}
	}

}
	for(int x=0; x<6; x++) {
		System.out.print(score[x]+"\t");
	}
	}
}

