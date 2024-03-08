
public class MethodOverloadingSwapArgumentEx {
	void sum(int a,double b){ 
		System.out.println(a+b);
	}
	void sum(double b,int a){ 
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingSwapArgumentEx obj=new MethodOverloadingSwapArgumentEx();
		obj.sum(50,50.0);
		obj.sum(50.0,50);
	}

}
