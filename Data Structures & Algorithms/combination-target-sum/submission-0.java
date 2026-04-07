class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
     List<List<Integer>> result = new ArrayList<List<Integer>>();
		combinationSum(nums, target, result, new ArrayList<Integer>(), 0);
		return result;
	}
	
	public void combinationSum(int nums[], int target, List<List<Integer>> result, List<Integer> temp, int start) {
		if(target == 0)
			result.add(new ArrayList<Integer>(temp));
		
		if(target < 0)
			return;
		
		for(int i = start; i < nums.length; i++) {
			int remainder = target - nums[i];
			temp.add(nums[i]);
			combinationSum(nums, remainder, result, temp, i);
			temp.remove(temp.size()-1);
		}   
    }
}
