

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    // [1,2,3,4,5,6,8,9,10,11]
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) continue;
            if (target < nums[i]) return i;
        }
        return nums.length;
        // return -1;
        // int mid = (nums.length-1) / 2;
        // int end = nums.length-1;
        // int start = 0;
        // int count = 0;
        // while (true) {
        //     if (mid <= start) break;
        //     if (mid >= end) break;
        //     int temp = mid;
        //     if (target < nums[mid])  {
        //         mid = (mid+start) / 2;
        //         end = temp;
                
        //     }
        //     else if (target > nums[mid])  {                
        //         mid = (mid+end) /2; 
        //         start = temp;
        //     } 
        //     count++;
        // }
        // return mid;
    }
}
