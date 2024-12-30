public class LeftNonRepeat{
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(nonrep(str));
    }

    private static int nonrep(String str) {
       int n= str.length();
    //    for(int i=0;i<n;i++){
    //     boolean flag=false;
    //     for(int j=0;j<n;j++){
    //         if(i!=j && str.charAt(i)==str.charAt(j)){
    //             flag = true;
    //             break;
    //         }
    //     }
    //     if(flag==false) return i;
    //    }
    //    return -1;

    // better

    int count[]=new  int[256];
    for(int i=0;i<n;i++){
        count[str.charAt(i)] ++ ;
    }
    for(int i=0;i<256;i++){
        if(count[str.charAt(i)]==1) return i;
    }
    return -1;
    }
}