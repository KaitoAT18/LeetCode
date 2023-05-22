public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            //Sum Left
            if (i == 0) {
                sumLeft = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    sumLeft += nums[j];
                }
            }

            //Sum Right
            if (i == nums.length-1) {
                sumRight = 0;
            } else {
                for (int j = i+1; j < nums.length; j++) {
                    sumRight += nums[j];
                }
            }

            //Compare
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
