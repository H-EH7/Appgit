//진법변환(문자열)
public class Exam_08 {

	public static void main(String[] args) {
		int dec = 25; //10진수
		String bin="";
		
		while(dec !=0) {
			int na = dec%2;
			bin= na +bin;
			dec/=2;
		}
			System.out.print(bin);
		

	}

}
