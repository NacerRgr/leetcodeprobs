import java.util.Arrays;

public class twoSums {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new twoSums().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int i , j = 0 ; 
        int[] array = new int[2];
        for(int k = 0 ; k < nums.length ; k++){
            for(i = 0 ; i < nums.length ; i++){
                if(nums[i] + nums[k] == target){

                    array[0] = i;
                    array[1] = k;
                    Arrays.sort(array);

                    return array;
                }
            }
        }
        return new int[]{-1,-1};

    }   
}
