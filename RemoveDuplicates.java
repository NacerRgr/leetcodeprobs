import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0 ){
            return 0;
        }

        int i = 1 , j =0 ;


        for(i=1 , j=1 ; i<nums.length ; i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

            System.out.println(Arrays.toString(nums));

        }
        for(int k = j ; k < nums.length ; k++){
            nums[k] = -1;
        }

        return j;
    }



    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,2,3,4,4};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

}
