package patterns;

public class question_28  {

	public static void main(String[] args) {
		int n,row,nst,nsp;
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
			int val=row; 
			
			while(j<=nst) {
				System.out.print(val+" ");
				if(j<nst/2+1) {
					val=val+1;
				}
				else {
					val=val-1;
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

