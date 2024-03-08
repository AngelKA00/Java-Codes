
//Creating a parent class. 
class Books{
//defining a method 
	void run(){
		System.out.println("Book not in stock");
	}
}
//Creating a child class

public class MethodOverridingOverriddenEx extends Books{
	void run(){
		System.out.println("Book is available");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingOverriddenEx obj = new MethodOverridingOverriddenEx(); //creating object 
		obj.run(); //calling method
	}
}
