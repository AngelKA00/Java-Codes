package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestLarget {
	public static ArrayList<Integer>KthSmallLarge(ArrayList<Integer>arr, int n, int k){
		ArrayList<Integer> ans = new ArrayList<>();
		Collections.sort(arr);
		ans.add(arr.get(k-1));
		ans.add(arr.get(n-k));
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        int n = arr.size();
        int k = 3;

        ArrayList<Integer> result = KthSmallLarge(arr, n, k);

        System.out.println("Kth Smallest: " + result.get(0));
        System.out.println("Kth Largest: " + result.get(1));

	}

}
