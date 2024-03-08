
class Student {
	// static variable 
	public static double fees;
	public static String name = "A";
}
public class StaticVariable {
	public static void main(String[] args) { 
		Student.fees = 50000;
		System.out.println(Student.name + "'s annual fees : " + Student.fees);
	}
}