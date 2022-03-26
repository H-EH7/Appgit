
public class Exam_04 {

	public static void main(String[] args) {
		int k=7,e=8,m=8;
		int t = k+e+m;
		double a= (double)t/3;
		int d = (int)3.14; //°­Á¦ Çüº¯È¯
		
		
		System.out.println("ÃÑÁ¡:"+t);
		System.out.println("Æò±Õ:"+a);
		a= (int)(t/3.*100+0.5)/100.;
		//767.6666 --> 767/100. ->7.67
		System.out.println("Æò±Õ: " +a);
				

	}

}
