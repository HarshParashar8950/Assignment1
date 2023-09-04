package patterns;

public class ques29 {

	public static void main(String[] args) {
		int n, row,nst, nsp;
		n=5;
		row=1;
		nsp=n-1;
		nst=1;

		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			int j=1;
			int val=row;
			int w=row*2-1;			
			while(j<=nst) {
				if(j==1||j==w) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("0"+" ");
				}
				j=j+1;
				
				
			}
			nsp=nsp-1;
			nst=nst+2;
			row=row+1;
			
			System.out.println();
		}

	}

}
