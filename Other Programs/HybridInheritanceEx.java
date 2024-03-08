interface A{
	public void methodA();
}
interface B extends A{
	public void methodB();
}
interface C extends A{
	public void methodC();
}

public class HybridInheritanceEx implements B, C{
	public void methodA(){
		System.out.println("Inside A");
	}
	public void methodB(){
		System.out.println("Inside B");
	}
	public void methodC(){
		System.out.println("Inside C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridInheritanceEx obj1= new HybridInheritanceEx();
		obj1.methodA(); 
		obj1.methodB(); 
		obj1.methodC();
	}
}
