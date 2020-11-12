class Solution724 {
    main
    public int pivotIndex(int[] nums) {

        nums={1,7,3,6,5,6};

        for (int i = 0; i < nums.length; i++) {

            int sum1;
            int sum2;

            for (int j = i - 1; j >= 0; j--) {
                sum1 += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                sum2 += nums[k];
            }

            if (sum1 == sum2)
                return i;
                break;

        }
    }
}