class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i< nums.length; i++){
            hm.put(nums[i],i);
        }
        int a=0;
        for(int i=0;i< nums.length;i++){
            a=target-nums[i];
            if(hm.containsKey(a) && hm.get(a) != i){
                return new int[]{i,hm.get(a)};
                
            }
        }
        
        return new int[0];
    }
}
