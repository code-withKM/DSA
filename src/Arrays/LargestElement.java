public class LargestElement {

    static int largest(int a[],int n){

        // naive
        // for (int i = 0; i < n; i++) {
        //     boolean flag = true;
        //     for(int j=0;j<n;j++){
        //         if(a[j] >a[i]){
        //             flag =false;
        //             break;
        //         }
        //     }

        //     if(flag == true) 
        //     return i;
            
        // }

        // efficient

        int l =0;

        for (int i = 1; i < n; i++) {
            if(a[i] > a[l]){
                l =i ;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int a[] = {10,5,20,80};
        int n=4;

        int res = largest(a,n);
        System.out.println(res);

    }
}
