package Arrays.BinarySearchProblem;

public class CilingOfAnumber {

    static int cilingOfAnumber(int nums[],int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                    start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start ;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,5,9,14,16,18};
        int target = 13;
        System.out.println(cilingOfAnumber(nums,target));;
    }
}
