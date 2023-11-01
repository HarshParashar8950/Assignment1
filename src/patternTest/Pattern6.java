package patternTest;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=n) {
			int i=1;
			int j=1;
//			Printing stars
			while(i<=nst) {
				System.out.print("*"+" ");
				i++;
			}
//Printing spaces			
			while(j<=nsp) {
				System.out.print("-"+" ");
				j++;
			}
			System.out.println();
			row++;
			nst--;
			nsp++;
			
		}
	}

}
