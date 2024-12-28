public class Movezeros{
    public static void main(String[] args) {
        int a[] ={10,8,0,0,12,0};
        int n= a.length;
        int res=0;

        for(int i=0;i<n;i++){
            if(a[i] != 0){
                int t=a[i];
                a[i]=a[res];
                a[res] =t;
                res++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "," + " ");
        }
    }
}