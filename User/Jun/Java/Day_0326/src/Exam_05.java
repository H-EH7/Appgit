//관계연산자(>,<,>=,<= -> ==,!=) ==> 결과는 true/false
//boolean(자바에만 있음)
//논리연산자 !(not) , &&(and) , ||(or)
//비트연산자 &(and) |(or) ^(xor) ~(not) <<(왼쪽시프트) >>(오른쪽시프트)
//시프트 연산 x<<n = x*2^n
//시프트 연산 x>>n = x/2^n
//단항연산자 ++,--
//누적형 연산자 y=y+x -> y+=x


public class Exam_05 {

	public static void main(String[] args) {
		System.out.println("7>4="+(7>4));
		System.out.println("7>4 && 5<3="+((7>4)&&(5<3)));
		System.out.println("7>4 || 5<3="+((7>4)||(5<3)));
		System.out.println("!(7>4)="+!(7>4));
	}

}
