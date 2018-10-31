package easy;

public class TwoSum {
//	https://leetcode.com/articles/two-sum/
	public int[] twoSumV1(int[] array, int target) throws IllegalArgumentException{
		for (int i=0; i<array.length; i++){
			for (int j=array.length-1; j> i; j--){
				if (array[i]+array[j]==target){
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException();
	}
	
	public int[] twoSum_v2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }                
        }
		return null;
    }
	
	
	public static void main(String[] args) {
		int[] res = new TwoSum().twoSumV1(new int[]{2, 7, 11, 15}, 9);
		Utils.printArray(res);
	}
}
