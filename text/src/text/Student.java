package text;

	public class Student {
		private String name, id; //�m�W,�s��
		private char gender; //�ʧO
	public Student(String name1,String id1){
		name = name1;
		id = id1;
	}
	public void setName(String name1){
		name=name1;
	}
	public String getNane(){
		return name;
	}
	public void setId(String id1){
		id=id1;
	}
	public String getId(){
		return id;
	}
	public void setGender(char gender1){
		gender=gender1;
	}
	public char getGender(){
		return gender;
	}
}
