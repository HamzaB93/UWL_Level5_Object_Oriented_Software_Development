package assignment;
// Student will be used by the server to make Student instances
public class Student
{
	// Properties
	private int id;
	private static int baseId = 20;
	private String fName;
	private String sName;
	private int age;
	private String course;

	// Constructors
	public Student()
	{
		id = baseId;
		baseId++;
		fName = "First Name Unknown";
		sName = "Second Name Unknown";
		age = 0;
		course = "Course Unknown";
	}
	public Student(String fName, String sName, int age, String course)
	{
		this.id = baseId;
		baseId++;
		this.fName = fName;
		this.sName = sName;
		this.age = age;
		this.course = course;
	}

	// toString
	public String toString()
	{
		return ("ID: " + id +", Name: " + fName +" " + sName + ", Age: " + age + ", Course: " + course );
	}

	// Setters
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}

	// Getters
	public int getId()
	{
		return id;
	}
	public String getFName()
	{
		return fName;
	}
	public String getSName()
	{
		return sName;
	}
	public int getAge()
	{
		return age;
	}
	public String getCourse()
	{
		return course;
	}
}