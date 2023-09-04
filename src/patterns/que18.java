package patterns;

public class que18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, row, nst,nsp;
		n=7;
		row=1;
		nst=1;
		nsp=n/2;
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i++;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
				
			}
			if(row<n/2+1) {
				nsp=nsp-1;
				nst=nst+2;
			}
			else {
				nsp=nsp+1;
				nst=nst-2;
			}
			System.out.println();
			row=row+1;	
		}

		

	}

}
