package intermidiate;

public class methodAccess
{
    String name;
    int grade;
	public static void main(String[] args) 
	{
		methodAccess s=new methodAccess();
		s.setGrade(13).setName("arun");
		s.setGrade(33).setName("hari");
		s.setGrade(14).setName("tharun");
		s.setGrade(99).setGrade(43);

		
	}

 public methodAccess setName(String name)
 {//this is used to get the instance or global variable
	  this.name=name;
      System.out.println(name);
      return this;
}
 
 public methodAccess setGrade(int grade)
 {
	 this.grade=grade;
	 System.out.println(grade);
	 return this;
 }
}
