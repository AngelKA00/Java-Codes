
class DEF{
	public void print_DEF(){
		System.out.println("Cooking");
	}
}
class ZYX extends DEF{
	public void print_ZYX(){
		System.out.println("Emerging Technology");
	}
}
class PQR extends ZYX{
	public void print_PQR(){
		System.out.println("IoT");
	}
}
public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PQR d = new PQR();
		d.print_DEF(); 
		d.print_ZYX(); 
		d.print_PQR();
	}

}

