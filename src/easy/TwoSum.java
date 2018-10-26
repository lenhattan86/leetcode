package easy;

public class TwoSum {
//	https://leetcode.com/articles/two-sum/
	public int[] twoSumV1(int[] array, int target) throws IllegalArgumentException{
		for (int i=0; i<array.length; i++){
			for (int j=array.length-1; j>= 0; j--){
				if (array[i]+array[j]==target){
					return new int[]{array[i], array[j]};
				}
			}
		}
		throw new IllegalArgumentException();
	}
	
	public int[] twoSumV2(int[] array, int target) throws IllegalArgumentException{
		throw new IllegalArgumentException();
	}
	
	
	public static void main(String[] args) {
		int[] res = new TwoSum().twoSumV1(new int[]{2, 7, 11, 15}, 9);
		Utils.printArray(res);
	}
}
