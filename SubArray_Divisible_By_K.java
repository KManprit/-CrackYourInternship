class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         Map<Integer, Integer> remainderCountMap = new HashMap<>();
        remainderCountMap.put(0, 1);  // Initialize with 0 remainder having 1 count
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            
            // Normalize remainder to be in the range [0, k-1]
            if (remainder < 0) {
                remainder += k;
            }
            
            // If remainder has been seen before, add its count to result
            if (remainderCountMap.containsKey(remainder)) {
                count += remainderCountMap.get(remainder);
            }
            // Update the count of this remainder in the map
            remainderCountMap.put(remainder, remainderCountMap.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}