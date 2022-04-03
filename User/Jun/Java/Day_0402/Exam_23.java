class Cal{
	void add(int a,int b){
		System.out.println(a+"+"+b+"="+(a+b));
		
	}
	int add(int[]a) {
		int s=0;
		for(int x=0; x<a.length; x++) {
			s+=a[x];
		}
		return s; 
	}
	double add(double a[]) {
		double s=0;
		for(int x=0; x<a.length; x++) {
			s+=a[x];
		}
		return s;
	}
	int sum(int ...m) {//가변인자
	int t=0;
	for(int x=0; x<m.length; x++) {
		t += m[x];
	}
}

public class Exam_23 {

	public static void main(String[] args) {
		Cal cal =new Cal();
		cal.add(100,200);
		int s = cal.add(new int[] {1,2,3,4,5});
		System.out.println("s="+s);
		double t = cal.add(new double[] {1,2,3,4,5});
		System.out.println("s="+s);

	}

}
