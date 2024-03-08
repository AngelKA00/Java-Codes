package BasicPrograms;
import java.util.Scanner;
public class GreatestOfAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Enter a year: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 100 == 0) {
			if(n % 400 == 0) {
				System.out.println("Leap year");
			}else {
				System.out.println("Not a leap year");
			}
		}
		else {
			if(n % 4 == 0) {
				System.out.println("Leap year");
			}else {
				System.out.println("Not a leap year");
			}
		}
	}
}
