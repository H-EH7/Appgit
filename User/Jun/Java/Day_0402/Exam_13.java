
public class Exam_13 {
//칸수가 다 달라도 만들수 있음
	public static void main(String[] args) {
		int score[][] = {{1,2,3,4,5},
						 {7,8},
						 {10,20,30,40},
						 {100,200,300,}};
	for(int x=0; x < score.length; x++) {
		for(int y=0; y < score[x].length; y++) {
			System.out.print(score[x][y]+"\t");
		}
		System.out.println();
	}
	
	
	}

}
