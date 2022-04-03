
public class Exam_10 {

	public static void main(String[] args) {
		int score[] = {78,56,80,95,77,65};
		System.out.print("Data :" );
		for(int x=0; x<6; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		for(int x=0; x<6-1; x++){
			for(int y=0; y<6-1; y++) {
				if(score[y] > score[y+1]) {
					int temp = score[x];
					score[y]=score[y+1];
					score[y+1]=temp;
				}
			}
		}
		System.out.print("sort:");
		for(int x=0; x<6; x++) {
			System.out.print(score[x]+"\t");
		}

	}

}
