public class Palindrome{
    public static void main(String[] args) {
        String str = "ABBA";
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev = rev + str.charAt(i);
        // }

        // System.out.println(str.equals(rev));

        // method2

        // StringBuilder rev = new StringBuilder(str);

        // rev.reverse();
        // System.out.println(rev);
        // System.out.println(str.equals(rev.toString()));

        // efficient

        int l=0; int h=str.length()-1;
        while(l<h){
            if(str.charAt(l) != str.charAt(h)) System.out.println("false");
            l++; h--;
            // System.err.println("");

        }
    }
}