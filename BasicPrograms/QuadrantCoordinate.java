package BasicPrograms;

import java.util.Scanner;

public class QuadrantCoordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		if(x == 0 && y == 0) {
			System.out.println("Origin");
		}
		else if(x > 0 && y > 0) {
			System.out.println("1st Quadrant");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2nd Quadrant");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3rd Quadrant");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4th Quadrant");
		}
		else if(x > 0 || x < 0 && y == 0) {
			System.out.println("x axis");
		}
		else {
			System.out.println("y axis");
		}
	}

}
