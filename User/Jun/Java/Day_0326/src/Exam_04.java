
public class Exam_04 {

	public static void main(String[] args) {
		int k=7,e=8,m=8;
		int t = k+e+m;
		double a= (double)t/3;
		int d = (int)3.14; //���� ����ȯ
		
		
		System.out.println("����:"+t);
		System.out.println("���:"+a);
		a= (int)(t/3.*100+0.5)/100.;
		//767.6666 --> 767/100. ->7.67
		System.out.println("���: " +a);
				

	}

}
