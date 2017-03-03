package text;

	public class Stuff {
		private String name, id; //姓名,編號
		private char gender; //性別
		int birthYear; //出生年
	public Stuff(String name1,String id1){
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
	public void setBirthYear(int birthYear1){
		birthYear=birthYear1;
	}
	public int getBirthYear(){
		return birthYear;
	}
}
