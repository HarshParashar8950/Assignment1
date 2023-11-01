//* * * * *
//*       *
//*       *
//*       *
//* * * * *
package patternTest;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int row=1;
			int nst = n;
			int nsp=n-2;
			
			while(row<=n) {
				int i=1;
				int j=1;
				
				if(row==1||row==n) {
					while(i<=nst) {
				
					System.out.print("*"+" ");
					i++;
				}
				}
				else {	
					System.out.print("*"+" ");
					while(j<=nsp) {
						System.out.print("-"+" ");
						j++;
					}
					System.out.print("*"+" ");
				
			}
				System.out.println();
				row++;
			}
	}

}
