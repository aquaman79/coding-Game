class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        HashMap<Integer, Integer> mapResultas = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int resultas = target - nums[i];

            if (mapResultas.containsKey(resultas))
                return new int[]{mapResultas.get(resultas), i};

            mapResultas.put(nums[i],i);
        }

        return result;
    }
}
