

public class AnagramCheck{
    public static void main(String[] args) {
        String s1 = "hello";
        // char a[] =  s1.toCharArray();
        // Arrays.sort(a);
        // s1= new String(a);
        // System.out.println(s1);

        String s2 = "llheq";
        // char[] b = s2.toCharArray();
        // Arrays.sort(b);
        //  s2= new String(b);
        // System.out.println(s2);

        // System.out.println(s1.equals(s2));

        // efficient

        if(s1.length() != s2.length()){
            System.out.println("not anagram");
        }

        int[] c =new int[256];
        for(int i=0;i<s1.length();i++){
            c[s1.charAt(i)] ++ ;
            c[s2.charAt(i)] -- ;
        }

        for(int i=0;i<256;i++){
            if(c[i] !=0){
                System.out.println("not anagram");
                break;
            }
                System.out.println("anagram");
            
        }
        
        
    }
}