//특정 값에 가장 가까운 값 찾기

public class Exam_06 {
	public static void main(String[] args) {
		int[] val = {78,85,90,57,70,65,95};
		//80에 가장 가까운 값 찾기
		int min=(val[0]>80)?val[0]-80 : 80-val[0];//간격 Math.abs 와 같은 효과
		//int min = Math.abs(val[0]-80);
		int value =val[0];
		for(int x =1; x<val.length; x++) {
			int temp;
			if(val[x]>80) {
				temp= val[x]-80;
			}else {
				temp = 80-val[x];
			}
			//간격의 최소값 찾기
			if(min > temp) {
				min=temp;
				value = val[x];
			}
		}
		System.out.println("80에 가장 가까운 값은 : " + value);
	}

}
