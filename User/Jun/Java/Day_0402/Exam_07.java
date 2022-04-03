//진법변환(배열)
public class Exam_07 {

	public static void main(String[] args) {
		int dec = 25; //10진수
		int[] bin =new int[10];
		int cnt=0;
		do {
			int mok = dec/2;
			int na = dec%2;
			bin[cnt] =na;
			cnt++;
			/*
			 * int mok =dec/2
			 * dec=mok;
			 */
			dec /= 2; //dec = dec/2;
		}while(dec !=0);
		for(int i =cnt-1; i>=0; i--) {
			System.out.print(bin[i]+" ");
		}

	}

}
