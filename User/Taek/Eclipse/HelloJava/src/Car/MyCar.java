package Car;

public class MyCar {

	public static void main(String[] args) {
		Car myCar1 = new Car("����", 0);
		Car myCar2 = new Car(0);
		Car myCar3 = new Car();
		
		System.out.println("����� ���� ���(���� �ʵ�) ==> " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) ==> " + Car.currentCarCount());

	}

}
