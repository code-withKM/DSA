// index of first occurance

public class IndexFst{
    public static void main(String[] args) {
        String s1="sadbutsad";
        String s2="but";

        int res = strstr(s1,s2);
        System.out.println(res);
    }

    private static int strstr(String s1, String s2) {
       for(int i=0;i<s1.length()-s2.length();i++){
        if(s1.substring(i, i+s2.length()).equals(s2)){
            return i;
        }
       }
       return -1;
    }
}