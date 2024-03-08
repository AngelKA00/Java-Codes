interface MUL{
	public void print_MUL();
}

interface LUM{
	public void print_LUM();
}

interface MLU extends MUL, LUM{
	public void print_MLU();
}

class child implements MLU{
	public void print_MUL(){
		System.out.println("Cooking");
	}
	public void print_LUM(){
		System.out.println("Emerging Technology");
	}
	public void print_MLU(){
		System.out.println("IoT");
	}
}

public class MultipleInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child d = new child();
		d.print_MUL(); 
		d.print_LUM(); 
		d.print_MLU();
	}

}
