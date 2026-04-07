class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();

		permute(nums, result, new ArrayList<>(), new boolean[nums.length]);

		return result;

	}

	private static void permute(int nums[], List<List<Integer>> result, List<Integer> temp, boolean[] used) {

		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			
			if(used[i])
				continue;
			
			used[i] = true;

			temp.add(nums[i]);
			permute(nums, result, temp, used);
			temp.remove(temp.size() - 1);
			used[i] = false;
		}

		return;   
    }
}
