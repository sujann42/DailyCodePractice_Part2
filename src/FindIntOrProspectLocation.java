public class FindIntOrProspectLocation {

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 11, 12, 14, 19, 25};
        System.out.println(searchInsert(nums, 100));
    }

    public static int searchInsert(int[] nums, int target) {
        int indexOfNum = 0;
        int result = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                indexOfNum = i;
                found = true;
            }
            result = indexOfNum;
        }
        if(!found)
        for (int i = 0; i < nums.length; i++) {
            if(target < nums[0]){
                indexOfNum = 0;
            }else if(target > nums[nums.length-1]){
                indexOfNum = nums.length;
            }else if(target > nums[i]){
                indexOfNum = i+1;
            }
        }


        return indexOfNum;
    }
}
