package patterns;

public class que11 {

	public static void main(String[] args) {
		int n,nsp,nst, row;
		n=5;
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				if(j%2==1)
				System.out.print("*"+" ");
				else {
					System.out.print(" "+" ");
				}
				j=j+1;
			}
			nst=nst+2;
			nsp=nsp-1;
			System.out.println();
			row=row+1;
		}

	}

}
