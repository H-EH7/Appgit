//출력의 가로세로 바꾸기
public class Exam_14 {

	public static void main(String[] args) {
		int value[][] = new int[5][5];
		//배열 데이터 입력
		int cnt=0;
		for(int x=0; x<5; x++) {
			for(int y=0; y<x+1; y++) {
				cnt++;
				value[y][x]=cnt; // <- 요부분만 [x][y]를 [y][x]만 바쭤서 출력가능 
			}
		}
		//배열데이터 출력
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print(value[x][y]+"\t");
			
			}
			System.out.println();
		}
	}

}
