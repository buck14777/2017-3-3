package text;

public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�m�W\t�s��\t�ʧO\t�X�ͦ~��");
		//��1��
		Stuff s1 = new Stuff("Tony","001");
		System.out.print(s1.getNane()+"\t"+s1.getId()+"\t");
		s1.setGender('m');
		s1.setBirthYear(56);
		System.out.print(s1.getGender()+"\t");
		System.out.println(s1.getBirthYear());
		//��2��
		Stuff s2 = new Stuff("Tina","002");
		System.out.print(s2.getNane()+"\t"+s2.getId()+"\t");
		s2.setGender('f');
		s2.setBirthYear(64);
		System.out.print(s2.getGender()+"\t");
		System.out.println(s2.getBirthYear());
		//��3��
		Stuff s3 = new Stuff("Frank","003");
		System.out.print(s3.getNane()+"\t"+s3.getId()+"\t");
		s3.setGender('m');
		s3.setBirthYear(43);
		System.out.print(s3.getGender()+"\t");
		System.out.println(s3.getBirthYear());
		//��4��
		Stuff s4 = new Stuff("Aaron","004");
		System.out.print(s4.getNane()+"\t"+s4.getId()+"\t");
		s4.setGender('m');
		s4.setBirthYear(66);
		System.out.print(s4.getGender()+"\t");
		System.out.println(s4.getBirthYear());
		//��5��
		Stuff s5 = new Stuff("Alice","005");
		System.out.print(s5.getNane()+"\t"+s5.getId()+"\t");
		s5.setGender('f');
		s5.setBirthYear(70);
		System.out.print(s5.getGender()+"\t");
		System.out.println(s5.getBirthYear());
	}
		
}
