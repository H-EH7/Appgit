//������ȯ(���ڿ�)
public class Exam_08 {

	public static void main(String[] args) {
		int dec = 25; //10����
		String bin="";
		
		while(dec !=0) {
			int na = dec%2;
			bin= na +bin;
			dec/=2;
		}
			System.out.print(bin);
		

	}

}
