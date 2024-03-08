
public class MethodOverloadingNoOfArgumentEx {
	void sum(int a,long b){ 
		System.out.println(a+b);
	}
	void sum(int a,int b,int c){ 
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingNoOfArgumentEx obj=new MethodOverloadingNoOfArgumentEx();
		obj.sum(50,50);
		obj.sum(50,50,50);
	}

}
