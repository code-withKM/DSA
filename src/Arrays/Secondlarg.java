public class Secondlarg {
    public static void main(String[] args) {
        int a[] = {100,5,18,20,15};
        int n = a.length;

        int res = sec(a,n);
        System.out.println(res);
    }

    private static int sec(int[] a, int n) {
        
        // naive
        int sec = -1;
        int l = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] > a[l]){
                l = i;
            }
          
        }

        for (int i = 0; i < n; i++) {
            if(a[i] != a[l]){
                
                if(sec==-1 || a[i]>a[sec]){
                    sec=i;
                }
            }
        }
        
        return sec;

        // naive

        // better

        // int sec = -1;
        // int l =0;

        // for (int i = 0; i < n; i++) {
        //     if(a[i] > a[l]){
                
        //         sec =l;
        //         l = i;
        //     }else if(a[i] != a[l]){
        //         if(sec==-1 || a[i] >a[sec]){
        //             sec = i;
        //         }
        //     }
        // }

        // return sec;

    }
}