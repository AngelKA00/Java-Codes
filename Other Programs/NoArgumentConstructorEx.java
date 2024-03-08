public class NoArgumentConstructorEx{ 
	int i; 
	NoArgumentConstructorEx(){
		i=10;
		System.out.println("Creating a No Argument constructor"); 
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgumentConstructorEx skillking = new NoArgumentConstructorEx();
	}
}
