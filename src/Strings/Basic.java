public class Basic{
    public static void main(String[] args) {
        String str="geeksforgeeks";

        int[] count = new int[26];
        for(int i=0;i<str.length();i++){
            int k = str.charAt(i) - 'a';
            count[k] ++ ;
          
        }

        for(int i=0;i<26;i++){
            if(count[i] > 0){
                System.out.println((char)(i +'a') + " " + count[i]);
            }
        }
    }
}


