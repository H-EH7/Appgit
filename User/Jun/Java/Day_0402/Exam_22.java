//��ü���� ���� ����
class Hak{
	int bun;
	String name;
	int kor,eng,mat,tot;
	double ave;
	Hak(int bun, String name, int kor, int eng, int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		totAve();
		//titleprint();
		//hakprint();
	}
	
	void totAve() {
		tot = kor+eng+mat;
		ave=tot/3.;
	}
	void titleprint() {
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
	}
	void hakprint() {
		System.out.print(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+"\n");
	}
	
}

public class Exam_22 {

	public static void main(String[] args) {
	Hak hak = new Hak(11,"���л�",90,80,70);	
	hak.titleprint();
	hak.hakprint();
	hak = new Hak(21,"���л�",92,10,40);
	hak.hakprint();
	hak = new Hak(31,"���л�",91,12,44);
	hak.hakprint();
	
	}

}
