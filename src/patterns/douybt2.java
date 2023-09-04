package patterns;
import java.util.*;
public class douybt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int nst=1; 
		int nsp=2*n-1;
		int row=1;
		
		int rowvalL=n; 
		int rowvalR=n;
		while(row<=2*n+1) {
//			left Star
			int i=1;
			int valL=rowvalL;
			while(i<=nst) {
				System.out.print(valL+" ");
				i++;
				valL--;
			}
			
//			space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			
//			Right star
			
			int k=1;
			int valR=rowvalR;
			if(row==n+1) {
				k=2;
				valR++;
			}
			while(k<=nst) {
				System.out.print(valR+" ");
				k++;
				valR++;
					
			}
			
//			preparation for next row
			if(row<n+1) {
				nst=nst+1;
				nsp-=2;
				rowvalR--;
			}
			else {
				nst--;
				nsp+=2;
				rowvalR++;
			}
			System.out.println();
			row++;
		}

	}

}
