//참조에 의한 호출
public class Exam_18 {
	public static void main(String[] args) {
		int data[] = {10,20};
		System.out.println("data[0]="+data[0]+",data[1]="+data[1]);
		swap(data);
		System.out.println("data[0]="+data[0]+",data[1]="+data[1]);
	}
	static void swap(int data[]) {
		int c=data[0];
		data[0]=data[1];
		data[1]=c;
	}
}
