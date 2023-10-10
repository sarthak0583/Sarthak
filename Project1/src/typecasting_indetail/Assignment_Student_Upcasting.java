package typecasting_indetail;
class Teacher
{
	void teachername()
	 {
		System.out.println("MKT"); 
	 }
	 void teacherage()
	 {
		System.out.println("33"); 
	 }
	 void teacherdetails()
	 {
		System.out.println("Bangalore"); 
	 }
}
class Mentor extends Teacher
{
	void mentorname()
	 {
		System.out.println("Manish"); 
	 }
	 void mentorage()
	 {
		System.out.println("32"); 
	 }
	 void mentordetails()
	 {
		System.out.println("GTM"); 
	 }
}
public class Assignment_Student_Upcasting extends Mentor
{
 void studentname()
 {
	System.out.println("Sarthak"); 
 }
 void studentage()
 {
	System.out.println("28"); 
 }
 void studentdetails()
 {
	System.out.println("AB 34"); 
 }
	public static void main(String[] args)
	{
		/*Teacher t1=new Assignment_Student_Upcasting();
		t1.teachername();
		t1.teacherage();
		t1.teacherdetails();*/
		Mentor m1=new Assignment_Student_Upcasting();//Upcasting
		m1.mentorname();
		m1.mentorage();
		m1.mentordetails();
		m1.teacherage();
		m1.teacherdetails();
		m1.teachername();
		Assignment_Student_Upcasting a1=(Assignment_Student_Upcasting)m1;//Downcasting
	    a1.mentorage();
		a1.mentordetails();
		a1.mentorname();   //for downcasting you need to upcast first
		a1.studentage();
		a1.studentdetails();
		a1.studentname();
		a1.teacherage();
		a1.teacherdetails();
		a1.teachername();
	}
	
}
