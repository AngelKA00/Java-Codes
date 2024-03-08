package BasicPrograms;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range:");
		int s = sc.nextInt(); // start
		System.out.println("Enter end range:");
		int e = sc.nextInt(); // end
		System.out.println("Enter how many increment:");
		int w = sc.nextInt(); // per how many stops
		System.out.println("\n");
		System.out.println("Celcius to Fahrenheit");
		for(int i=s; i<=e; i+=w) {
			double fahrenheit = (i * 9.0 / 5.0) + 32;// celcius to fahrenheit
			System.out.println(i + "\t\t" + fahrenheit);
		}
		System.out.println("\n");
		System.out.println("Fahrenheit to Celcius");
		for (int i = s; i <= e; i += w) {
            double celsius = (i - 32) * 5.0 / 9.0; // fahrenheit to celsius
            System.out.println(i + "\t\t" + celsius);
        }
	}
}
