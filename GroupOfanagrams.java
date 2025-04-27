import java.util.*;




public class GroupOfanagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> strMap = new HashMap<>();


        for(String s : strs){

            char[] ch = s.toCharArray();
                
            Arrays.sort(ch);

            String st = new String(ch) ;

            
            strMap.putIfAbsent(st, new ArrayList<>());

            strMap.get(st).add(s);




        }





        return new ArrayList<>(strMap.values());

        }
}






