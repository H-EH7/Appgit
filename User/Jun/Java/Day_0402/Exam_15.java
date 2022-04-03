// 출력값을 맞춰라
public class Exam_15 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5];
		int cnt =0;
		for(int x=0;x<5; x++) {
			if(x%2==0) {
				for(int y=0; y<5; y++) {
					cnt++;
					arr[x][y]=cnt;
				}
			}else {
				for(int y=4; y>=0; y--) {
					cnt++;
					arr[x][y]=cnt;
				}
			}
		}

	}

}
