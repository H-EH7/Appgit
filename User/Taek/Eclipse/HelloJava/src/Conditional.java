
public class Conditional {
	public static void main(String[] args) {
		int speed = 56;
		if (speed >= 30) {
			System.out.println("����");
		} else {
			System.out.println("���� �ӵ�");
		}
		
		int limitspeed = 30;
		switch (limitspeed) {
		case 100:
			System.out.println("���Ѽӵ� 100km/h");
			break;
		case 50:
			System.out.println("���Ѽӵ� 50km/h");
			break;
		case 30:
			System.out.println("���Ѽӵ� 30km/h");
			break;
		default:
			break;
		}
	}
}
