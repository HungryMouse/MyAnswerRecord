package lintcode;

public class Train41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this maxSum:" + maxSubArray(new int[] { -2, 2, -3, 4, -1, 2, 1, -5, 3 }));
	}

	public static int maxSubArray(int[] nums) {
		int ThisSum = 0;
		int MaxSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			ThisSum += nums[i];
			if (ThisSum > MaxSum)
				MaxSum = ThisSum;
			else if (ThisSum < 0)//当前所加的和小于0，加上下一个数后的和，必定小于下一个数
				ThisSum = 0;
		}
		return MaxSum;

	}

}
