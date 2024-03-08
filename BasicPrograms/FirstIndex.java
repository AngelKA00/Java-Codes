package BasicPrograms;

public class FirstIndex {
	public static int findFirst(int []nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int result = -1;
		while(left<=right) {
			int mid = (left + right)/2;
			if(target == nums[mid]) {
				result = mid;
				right = mid - 1;
			}
			else if(target < nums[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,5,5,5,6,6,8,9,9,9};
		int target = 9;
		int index = findFirst(nums,target);
		if(index != -1) {
			System.out.println(index);
		}else {
			System.out.println("Element not found");
		}

	}

}
