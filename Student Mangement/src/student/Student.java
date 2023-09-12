package student;

public class Student {
	Student[] s=new Student[5];
	private int rollno=0;
	private String name;
//	int dob;
//	String gender;
//	long mobile_no;
	double percent;
	static String clg="KIT";
	int i =0;
	


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	
	Student() {
		
		rollno++;
	}
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addStudent(Student s)
	{
		s[i]=rollno;
		i++;
		
	}
	public void displayStudent(Student s)
	{
		
		System.out.println("Name: "+name_arr[i]+"\tRoll no: "+roll_arr[i]);
	i++;
	}
}