import java.util.ArrayList;
import java.util.List;

public class encodeDecode {
     public String encode(List<String> strs) {


        String res = "";


        for(String s : strs){
            
            int length = s.length();
            res += length + "#" + s; 
        }


        return res ;
    }

    public List<String> decode(String str) {

        int i = 0  , j = 0  ;
        int length = 0 ;
       

        List<String> arr = new ArrayList<>();


        while(i<str.length()){
        
            while(str.charAt(j)!='#'){
                j++;
            }

        length = Integer.parseInt(str.substring(i, j));
        i = j+1;
        String s = str.substring(i, i+length);
        arr.add(s);

        j = i+length;

        }


        return arr;
    }
}
