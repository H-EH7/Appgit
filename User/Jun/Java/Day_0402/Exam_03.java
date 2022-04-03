
public class Exam_03 {
//배열해봅시다
	public static void main(String[] args) {
		int a=10, b=30, c=50, d=80; //선언 +할당
		int[] arr;//선언 -> 참조형 변수
		arr = new int[10]; //할당
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int x=0; x<arr.length; x++) {
			System.out.println("arr["+x+"]"+arr[x]);
		
		}
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("arr[3]:"+arr[3]);
		System.out.println("arr[4]:"+arr[4]);
	}

}
