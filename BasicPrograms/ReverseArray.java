package BasicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	static void reverse(Integer a[]) {
		Collections.reverse(Arrays.asList(a)); // this reverses the array
		System.out.println(Arrays.asList(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]arr = {10, 20, 30, 40, 50};
		reverse(arr);

	}

}
