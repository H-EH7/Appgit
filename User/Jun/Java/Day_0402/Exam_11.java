//2지 검색
public class Exam_11 {

	public static void main(String[] args) {
		int score[] = {10,20,30,40,50,60,70,80,90};
	//80검색
		int val=40;
		int low =0, high=8;//score.length-1;
		while(low <= high) {
			int m =(low+high)/2;
			if(score[m]==val) {
				System.out.println("검색성공:"+m+"번째" );
				break;
			}else if(val> score[m]) {
				low=m+1;
			}else {
				high=m-1;				
			}
		}
		

	}

}
