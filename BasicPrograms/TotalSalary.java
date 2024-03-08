package BasicPrograms;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		int basic = sc.nextInt();
		System.out.println("Enter his/her grade:");
		char grade = sc.next().charAt(0);
		double hra = 0.2 * basic;
		double da = 0.5 * basic;
		double pf = 0.11 * basic;
		int allow;
		if(grade == 'A') {
			allow = 2000;
		}else if(grade == 'B') {
			allow = 1500;
		}else {
			allow = 1000;
		}
		double TS = basic + hra + da+ allow - pf;
		long ts = Math.round(TS);
		System.out.println(ts);
	}

}
