
public class Exam_24 {

	public static void main(String[] args) {
		int cnt=0;
		int sum=0;
/*		while(cnt>10) {
			cnt++;
			sum+=cnt;
		}
		*/
		do{
			cnt++;
			sum+=cnt;
		}while(cnt>10); 
		
		System.out.println("cnt="+cnt);
		System.out.println("sum="+sum);
	}

}
