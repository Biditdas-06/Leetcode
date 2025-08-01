class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;  // position of last unique element

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
                nums[count] = nums[i + 1];
            }
        }

        return count + 1;
    }
}
