class ParentClass1{
	int a = 10;
	public int b = 20; 
	protected int c = 30; 
	private int d = 40;
	void showData() {
		System.out.println("Inside ParentClass"); 
		System.out.println("a = " + a);
		System.out.println("b = " + b); 
		System.out.println("c = " + c); 
		System.out.println("d = " + d);
	}
}
class ChildClass1 extends ParentClass1{
	void accessData() {
		System.out.println("Inside ChildClass"); 
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
		System.out.println("c = " + c);
		//System.out.println("d = " + d); // private member can't be accessed
	}
}
public class ParameterizedConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 obj = new ChildClass1();
		obj.showData();
		obj.accessData();
	}

}
