//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 
package patternTest;
import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=n) {
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i++;
				
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			row++;
			nst=nst-1;
			nsp=nsp+1;
		}
	}

}
