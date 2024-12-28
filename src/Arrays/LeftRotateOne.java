public class LeftRotateOne{
    public static void main(String[] args) {
        int a[]={30,5,20};
        int n = a.length;
        
        int temp=a[0];

        for (int i = 1; i < n; i++) {
            a[i-1] = a[i];
        }

        a[n-1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "," + " ");
        }
    }
}