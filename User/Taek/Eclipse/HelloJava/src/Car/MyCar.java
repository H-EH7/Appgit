package Car;

public class MyCar {

	public static void main(String[] args) {
		Car myCar1 = new Car("빨강", 0);
		Car myCar2 = new Car(0);
		Car myCar3 = new Car();
		
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());

	}

}
