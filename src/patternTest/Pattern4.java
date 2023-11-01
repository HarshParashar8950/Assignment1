//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * *

package patternTest;
import java.util.*;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			int  i=1;
//			Printing spaces
			while(i<=nsp) {
				System.out.print(" "+" ");
				i++;
				
			}
			int j=1;
//			Printing stars
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			 //next row
			System.out.println();
			nsp-=1;
			nst+=1;
			row+=1;
		}
	}

}
