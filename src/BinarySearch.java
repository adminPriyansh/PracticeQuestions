public class BinarySearch {
    public static void main(String[] args) {

        int nums[] = {5,7,9,11,13};

        int target = 11;

        // int result = linearSearch(nums, target);

        int result = binarySearch(nums,target);

        if(result!=-1){
            System.out.println("element found at "+result);
        } else {
            System.out.println("element not found  ");

        }
    }

    private static int linearSearch(int[] nums, int target) {

        for(int i = 0 ; i<nums.length; i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        //  {5,7,9,11,13};

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = (start+end)/2;

            if (nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid+1;
            } else
                end = mid-1;

        }
        return -1;
    }
}
