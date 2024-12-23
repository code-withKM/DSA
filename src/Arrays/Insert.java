package Arrays;

public class Insert {

	public static void main(String[] args) {
		int a[] = new int[5];
		int cap=5;
		int n=3;
		
		a[0] =5;
		a[1]=10;
		a[2]=20;
		
		System.out.println("Before Insertion");
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		
		 System.out.println();
		int x=7, pos=2;
		
		n =  insertele(a,cap,n,x,pos);
		
		System.out.println("After Insertion");
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}

	}

	 static int insertele(int a[], int cap, int n, int x, int pos) {
		
		 if(n==cap) return n;
		 int idx =pos-1;
		 
		 for(int i=n-1;i>=idx;i--) {
			 a[i+1] = a[i];
		 }
		 a[idx] = x;
		return n+1;
	}

}
