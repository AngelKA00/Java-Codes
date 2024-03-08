package BasicPrograms;

import java.util.Scanner;

public class RotateArray {
	
	private static void rotateArray(int[]arr, int rotations) {
		int length= arr.length;
		rotations = rotations % length;
		if(rotations<0) {
			rotations = length + rotations;
		}
		int[]temp = new int[rotations];
		for(int i=0; i<rotations; i++) {
			temp[i] = arr[i];
		}
		for(int i=rotations; i<length; i++) {
			arr[i - rotations] = arr[i];
		}
		for(int i=0; i<rotations; i++) {
			arr[length - rotations + i] = temp[i];
		}
					
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		System.out.println("Enter the values of an array: ");
		int[]arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the rotation count of an array: ");
		int rotations = sc.nextInt();
		rotateArray(arr,rotations);
		for(int i=0; i<size; i++) {
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}

}
