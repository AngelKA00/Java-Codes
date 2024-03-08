import java.util.Scanner;

public class KpopFandoms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************************************************************");
		System.out.println("        My Favourite K pop bands and their fandom names        ");
		System.out.println("*******************************************************************");
		
		// get input from user
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Fandom name for SHINEe: ");
		String str1 = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Fandom name for Bangtan Sonyeondan: ");
		String str2 = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Fandom name for IU: ");
		String str3 = sc3.nextLine();
		
		// display all inputs from users
		System.out.println("*******************************************************************");
		System.out.println("Fandom name for SHINEe is: " +str1);
		System.out.println("Fandom name for Bangtan Sonyeondan is: " +str2);
		System.out.println("Fandom name for IU is: " +str3);
		System.out.println("*******************************************************************");

	}

}
