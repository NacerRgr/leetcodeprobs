import java.util.HashMap;
public class AnargamHashmapMethod {

    public static void main(String[] args) {
        String s = "abcl";
        String t = "cbaa";
        System.out.println(new AnargamHashmapMethod().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }

        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        int count1 = 0 ;
        int count2 = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i)==t.charAt(j)){
                    count1 ++;
                }
                if(t.charAt(i)==s.charAt(j)){
                    count2 ++;
                }

            }
            hashMap1.put(s.charAt(i), count1);
            hashMap2.put(t.charAt(i), count2);
            count1 = 0;
            count2 = 0;
      
        }





        return hashMap1.equals(hashMap2);
}
}