package BasicPrograms;

public class StudentNameAge {
	String Name;
	int Age;
	public StudentNameAge(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentNameAge s1 = new StudentNameAge("Angel", 23);
		System.out.println("The name of the person is " + s1.getName());
		System.out.println("and age is " + s1.getAge());

	}

}
