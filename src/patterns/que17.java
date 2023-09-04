package patterns;

public class que17 {

	public static void main(String[] args) {
		int n,row, nst, nsp;
		n= 7 ;
		row=1;
		nst=n/2;
		nsp=1;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			if(row<n/2+1) {
				nsp=nsp+2;
				nst=nst-1;
			}
			else {
				nsp=nsp-2;
				nst=nst+1;
			}
			System.out.println();
			row=row+1;
			
		}

	

	}

}
