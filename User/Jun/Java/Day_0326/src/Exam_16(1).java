import java.util.Scanner;

//번호, 국어, 영어, 수학 입력받아서 평균학점을 구하고 
//평균에 대한 학점을 구하여 출력(100~90->A, 89~80->B, 79~70->C, 69~60->D 59~0->F)
public class Exam_16 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("input : ");
		int bun = s.nextInt();
		int kor = s.nextInt();
		int eng = s.nextInt();
		int mat = s.nextInt();
		int tot = kor+eng+mat;
		double ave = (double)tot/3;
		String hakjum="";
		switch((int)ave/10){
			case 10: hakjum="A"; break;
			case 9: hakjum="A"; break;
			case 8: hakjum="B"; break;
			case 7: hakjum="C"; break;
			case 6: hakjum="D"; break;
			default: hakjum="F";
			
		}
		
		System.out.println("학번"+bun);
		System.out.println("총점"+tot);
		System.out.println("평균"+ave);
		System.out.println("학점"+hakjum);

	}

}
