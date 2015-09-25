package week1Ship;

public class MyShip 
{
	public static void main(String[] args) 
	{
		// Testing Ship Class
		System.out.println("Testing the Ship class.\n");
		
		// Constructing default Ship
		Ship ssJoe = new Ship();
		
		ssJoe.report();
		
		// Plain line
		System.out.println(" ");
		
		// Giving ssJoe values
		ssJoe = new Ship("SSJoe", 50.00, 90, "Joe Land", true, true);
		
		ssJoe.report();
		
		// Plain line
		System.out.println("");
		
		Ship ssHamza = new Ship("SSHamza" , 100.00 , 180 , "England", false, true);
		
		ssHamza.report();
		
		// Plain line
		System.out.println(" ");
		
		int currentCourse = ssHamza.getCourse();
		System.out.println("SSHamza current course: \n" + currentCourse);
		
		ssHamza.setCourse(100);
		
		int newCourse = ssHamza.getCourse();
		System.out.println("SSHamza's new course: \n" + newCourse);
		
		String ship = ssHamza.toString();
		System.out.println(ship);
		
		
	}

}
/*private String name;
private double speed;
private int course;
private String destination;
private boolean cargo;
private boolean moving;
*/