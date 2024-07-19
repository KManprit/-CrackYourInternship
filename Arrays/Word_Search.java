class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0 ;
        int n = height.length;
        int i = 0 ;
        int j = n-1;
        while(i<j){
            //calculate water area
            int ht = Math.min(height[i] , height[j]);
            int width = j-i;
            int currwater= ht*width;
            maxWater = Math.max(maxWater ,  currwater);
            //update pt
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}