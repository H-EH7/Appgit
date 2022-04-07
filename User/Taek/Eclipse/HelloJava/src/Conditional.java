
public class Conditional {
	public static void main(String[] args) {
		int speed = 56;
		if (speed >= 30) {
			System.out.println("과속");
		} else {
			System.out.println("정상 속도");
		}
		
		int limitspeed = 30;
		switch (limitspeed) {
		case 100:
			System.out.println("제한속도 100km/h");
			break;
		case 50:
			System.out.println("제한속도 50km/h");
			break;
		case 30:
			System.out.println("제한속도 30km/h");
			break;
		default:
			break;
		}
	}
}
