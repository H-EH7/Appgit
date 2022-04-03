//참조에 의한 호출 예제

public class Exam_19 {

	public static void main(String[] args) {
		int score[] = {90,67,80,75,67,55,90};
		System.out.println("data print");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+"\n");
		}
		int tot = sum(score);
		System.out.print("\ntot="+tot);
		ascSort(score);
		System.out.print("sort:");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		
	}
	static int sum(int data[]) {
		int s=0;
		for(int x=0; x<data.length; x++) {
			s+=data[x];
		}
		return s;
	}
	static void ascSort(int a[]) {
		for(int x=0; x < a.length-1; x++) {
			for(int y=x+1; y<a.length;y++) {
				if(a[x]>a[y]) {
					int t =a[x];
					a[x]=a[y];
					a[y]=t;
				}
			}
		}
	}

}
