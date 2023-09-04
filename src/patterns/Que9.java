package patterns;

public class Que9 {

	public static void main(String[] args) {
		int n,nsp,nst, row;
		n=5;
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=n*2+1) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			if (row < n) {
				nst=nst+2;
				nsp=nsp-1;
			} else {
				nst=nst-2;
				nsp=nsp+1;	
			}
			
			System.out.println();
			row=row+1;
		}

	}

}
