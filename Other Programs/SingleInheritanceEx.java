
class ABC{
	public void print_ABC(){
		System.out.println("Cooking");
	}
}
class XYZ extends ABC{
	public void print_XYZ(){
		System.out.println("Emerging Technology");
	}
}
public class SingleInheritanceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ d = new XYZ();
		d.print_ABC();
		d.print_XYZ();
	}
}
