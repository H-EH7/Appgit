//2차원 배열
public class Exam_12 {

	public static void main(String[] args) {
	int a[][] = new int[5][4]; //5(row)줄에, 1줄당 4칸(col)
	int cnt = 0;
	//배열에 게이터 입력
	for(int x=0; x<5; x++) {//a.length
		for(int y=0; y<4; y++) {//a[x].length
		cnt++;
		a[x][y]=cnt;
	}
	}

	//출력테스트
	for(int x=0; x<5; x++) {
		for(int y=0; y<4; y++) {
			System.out.print(a[x][y]+"\t");
		}
		System.out.println();
	}

}
}
