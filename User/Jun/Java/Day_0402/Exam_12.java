//2���� �迭
public class Exam_12 {

	public static void main(String[] args) {
	int a[][] = new int[5][4]; //5(row)�ٿ�, 1�ٴ� 4ĭ(col)
	int cnt = 0;
	//�迭�� ������ �Է�
	for(int x=0; x<5; x++) {//a.length
		for(int y=0; y<4; y++) {//a[x].length
		cnt++;
		a[x][y]=cnt;
	}
	}

	//����׽�Ʈ
	for(int x=0; x<5; x++) {
		for(int y=0; y<4; y++) {
			System.out.print(a[x][y]+"\t");
		}
		System.out.println();
	}

}
}
