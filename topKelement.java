import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class topKelement {
    public int[] topKFrequent(int[] nums, int k) {
    
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            if(!map.containsKey(num)){
                map.put(num,0);
            }else{
                map.put(num,map.get(num)+1);
            }

        }

        
        ArrayList<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet() ) {
            list.add(new int[]{entry.getKey(),entry.getValue()});
        }


    

        list.sort((a,b)->(b[1] - a[1]));

        int[] result = new int[k];

        for(int i = 0 ; i< result.length ; i++){
            
            result[i] = list.get(i)[0];
        }


        return result;

        }
        
        

       
       



    }

