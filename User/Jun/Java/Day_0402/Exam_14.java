//����� ���μ��� �ٲٱ�
public class Exam_14 {

	public static void main(String[] args) {
		int value[][] = new int[5][5];
		//�迭 ������ �Է�
		int cnt=0;
		for(int x=0; x<5; x++) {
			for(int y=0; y<x+1; y++) {
				cnt++;
				value[y][x]=cnt; // <- ��κи� [x][y]�� [y][x]�� ���弭 ��°��� 
			}
		}
		//�迭������ ���
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print(value[x][y]+"\t");
			
			}
			System.out.println();
		}
	}

}
