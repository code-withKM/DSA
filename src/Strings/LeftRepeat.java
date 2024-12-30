

public class LeftRepeat{

    public static int leftmost(String str){

        // int[] count = new int[256];
        // for(int i=0;i<str.length();i++){
        //     count[str.charAt(i)] ++ ;
        // }

        // for(int i=0;i<256;i++){
        //     if(count[str.charAt(i)] > 1){
        //         return i;
        //     }
        // }
        // return -1;

        // efficient

        boolean visited[] = new boolean[256];`
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                res =i;
            }else{
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abccbd";
        int res = leftmost(str);
        System.out.println(res);
    }
}