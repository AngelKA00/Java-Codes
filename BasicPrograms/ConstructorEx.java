package BasicPrograms;

public class ConstructorEx {
	public int length;
	ConstructorEx(){ // no parameter
		this.length = 10;
	}
	ConstructorEx(int length){ // with parameter
		this.length = length; 
	}
	public void printArea() {
		System.out.println(length * length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx s1 = new ConstructorEx();
		s1.printArea();
		ConstructorEx s2 = new ConstructorEx(7);
		s2.printArea();
	}
}
