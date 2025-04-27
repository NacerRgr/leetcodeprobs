import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0 ){
            return 0;
        }
        int j = 0 ;
        int compteur = 0 ; 
        int k = nums.length;
        for(int i = 0 ; i <  k ; i++){
            if(nums[i]==val){
                for(j=i; j < k-1 ; j++){
                    nums[j] = nums[j+1];
                }
                System.out.println(Arrays.toString(nums));
                k--;
                i--;
            }

        }

        

        return k;
    }

    public  static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(new RemoveElement().removeElement(nums,val));
    }
}
