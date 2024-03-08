class CBA{
	public void print_CBA(){
		System.out.println("Cooking");
	}
}
class MNO extends CBA{
	public void print_MNO(){
		System.out.println("Emerging Technology");
	}
}
class RQP extends CBA{
	public void print_RQP(){
		System.out.println("IoT");
	}
}
public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RQP d = new RQP();
		d.print_CBA();
		MNO f = new MNO();
		f.print_MNO();
	}

}
