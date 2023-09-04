package patterns;

public class que25 {

	public static void main(String[] args) {
		int n,nsp,nst, row;
		n=5;
		row=1;
		nst=1;
		nsp=n-1;
		int count=1;
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			int j=1;
			
			while(j<=nst) {
				System.out.print(" "+count);
				count++;
				j=j+1;
			}
			nst=nst+2;
			nsp=nsp-1;
			System.out.println();
			row=row+1;
		}

	}

}
