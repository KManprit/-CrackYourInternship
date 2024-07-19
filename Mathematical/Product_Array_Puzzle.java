class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] leftProducts = new long[n];
        long[] rightProducts = new long[n];
        long[] productArray = new long[n];

        // Initialize the left and right product arrays
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;

        // Fill the left product array
        for (int i = 1; i < n; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }

        // Fill the right product array
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }

        // Fill the product array by multiplying left and right product arrays
        for (int i = 0; i < n; i++) {
            productArray[i] = leftProducts[i] * rightProducts[i];
        }

        return productArray;
	} 
} 
