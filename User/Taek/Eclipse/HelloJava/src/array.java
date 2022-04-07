
public class array {

	public static void main(String[] args) {
		String myCar[] = new String[2];
		myCar[0] = "Hyundai";
		myCar[1] = "Kia";
		
		System.out.println("내 차");
		for(int i=1; i<=myCar.length;i++)
		{
			System.out.println(i+"대");
		}
		
		String[][] newCar = new String[4][2];
		newCar[0][0] = "BMW";
		newCar[0][1] = "Benz";
		newCar[1][0] = "Audi";
		newCar[1][1] = "Porsche";
		newCar[2][0] = "Benz";
		newCar[2][1] = "Benz";
		
		System.out.println("새 차");
		for(int j=1; j<=newCar.length;j++)
		{
			System.out.println(j+"대");
		}
		
	}

}
