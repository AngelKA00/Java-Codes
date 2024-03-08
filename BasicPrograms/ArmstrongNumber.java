package BasicPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1422, arm, a, b, c, d;
		a = n % 10;
		b = n / 10;
		c = b % 10;
		d = b / 10;
		arm = (a*a*a) + (c*c*c) + (d*d*d);
		System.out.println(arm);
		if(arm == n) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
