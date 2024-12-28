public class Reverse{
static void reverse(int a[], int n)
    {
        // int b[] = new int[n];
        // int j = 0;

        // for(int i=n-1;i>=0;i--){
        //     b[j] = a[i];
        //     j++;
        // }

        // System.out.println("");
        // for (int k = 0; k < n; k++) {
        //     System.out.println(b[k]);
        // }

        int l=0; int h=n-1;

        while(l<h){
            int t = a[l];
            a[l] =a[h];
            a[h] =t;

            l++;
            h--;
        }

        System.out.println("");
        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {10,5,7,30};
        reverse(arr, arr.length);
    }
}