class Index0Occuence {
    public int strStr(String haystack, String needle) {
        int i, k;
        int compteur = 0;

        for (i = 0; i < haystack.length()-needle.length(); i++) {
            for (k = 0; k < needle.length(); k++) {
               if(haystack.charAt(i+k) == needle.charAt(k)){
                   compteur++;                   
               }else{
                compteur = 0;
                break;
               }
            }
            if(compteur == needle.length()){
                return i;
            }
        }
       

        return -1;

    }

    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(new Index0Occuence().strStr(haystack, needle));
    }
}
