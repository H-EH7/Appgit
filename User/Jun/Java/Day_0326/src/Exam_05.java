//���迬����(>,<,>=,<= -> ==,!=) ==> ����� true/false
//boolean(�ڹٿ��� ����)
//�������� !(not) , &&(and) , ||(or)
//��Ʈ������ &(and) |(or) ^(xor) ~(not) <<(���ʽ���Ʈ) >>(�����ʽ���Ʈ)
//����Ʈ ���� x<<n = x*2^n
//����Ʈ ���� x>>n = x/2^n
//���׿����� ++,--
//������ ������ y=y+x -> y+=x


public class Exam_05 {

	public static void main(String[] args) {
		System.out.println("7>4="+(7>4));
		System.out.println("7>4 && 5<3="+((7>4)&&(5<3)));
		System.out.println("7>4 || 5<3="+((7>4)||(5<3)));
		System.out.println("!(7>4)="+!(7>4));
	}

}
