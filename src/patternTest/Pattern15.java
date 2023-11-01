// * * * * * 
//     * * * * 
//         * * * 
//             * * 
//                 * 
//             * * 
//         * * * 
//     * * * * 
// * * * * * 
package patternTest;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int rows=2*n-1;
		int nst=n;
		int nsp=0;
		while(row<=rows) {
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
				row++;
				if(row<=n) {
					nst--;
					nsp+=2;
				}
				else {
					nst++;
					nsp-=2;
					
				}
		}
	}

}
