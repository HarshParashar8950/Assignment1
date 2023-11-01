package patternTest;
import java.util.*;
public class Pattern10 {

//	* * * * * * * * * 
//	  * * * * * * * 
//	    * * * * * 
//	      * * * 
//	        * 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int row=1;
			int nst=2*n-1;
			int nsp=0;
			while(row<=n) {
				int i=1;
				int j=1;
				while(i<=nsp) {
					System.out.print(" "+" ");
					i++;
				}
				while(j<=nst) {
					System.out.print("*"+" ");
					j++;
					
				}
				System.out.println();
				nst=nst-2;
				nsp++;
				row=row+1;
			}
	}	

}
