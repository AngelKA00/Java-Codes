
public class MethodOverloadingDatatypeOfArgumentEx {
	void sum(int a,int b){ 
		System.out.println(a+b);
	}
	void sum(long a,long b){ 
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDatatypeOfArgumentEx obj=new MethodOverloadingDatatypeOfArgumentEx();
		obj.sum(50,50);
		obj.sum(50,50);
	}

}
