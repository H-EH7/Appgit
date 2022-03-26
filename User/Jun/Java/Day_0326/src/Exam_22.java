
public class Exam_22 {

	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			for(int k=1; k<=5-x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=x; y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
