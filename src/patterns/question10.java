package patterns;

public class question10 {

	public static void main(String[] args) {
		int n,row,nst,nsp;
		n=5;
		row=1;
		nst=2*n-1;
		nsp=0;
		while(row<=n*2+1) {
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
				
			}
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
				
			}
			if (row < n) {
				nst=nst-2;
				nsp=nsp+1;
			} else {
				nst=nst+2;
				nsp=nsp-1;	
			}
			
			System.out.println();
			row=row+1;
			
		}

	}

}
