
public class Student {
	
	String Matno, dept, gender;
	int level;
	
	public void setMat(String a) {
		this.Matno = a;
	}
	
	public String getMat() {
		return Matno;
	}
	
	public void setDept(String b) {
		this.dept = b;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setGen(String c) {
		this.gender = c;
	}
	
	public String getGen() {
		return gender;
	}
	
	public void setLev(int d) {
		this.level = d;
	}
	
	public int getLev() {
		return level;
	}
	
	
	public void ShowInfo() {
		System.out.println("Matric number is: " + Matno + " Department is: " + dept + " Gender is: " + gender + " and Level is: " + level);
	}
	
	public class StudentTest extends Student{
	public static void main(String[] args) {
		Student A = new Student();
		A.setMat("AEB/2018/2014");
		A.setDept("Animal Biology");
		A.setGen("Female");
		A.setLev(300);
		A.ShowInfo();
		
		Student B = new Student();
		B.setMat("CSC/2018/0001");
		B.setDept("Computer Science");
		B.setGen("Male");
		B.setLev(400);
		B.ShowInfo();
	}
	}

}
