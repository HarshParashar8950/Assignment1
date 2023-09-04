package patterns;

import java.util.*;

public class que15 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst, nsp;
		nst = n;
		nsp = 1;
		while (row <= 2*n-1) {
			int i = 1;
			while (i < nsp) {
				System.out.print(" " + " ");
				i = i + 1;
			}
			int j = 1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j = j + 1;
			}
if(row<n) {
	nst = nst - 1;
	nsp = nsp + 2;
}
else {
	nst=nst+1;
	nsp=nsp-2;
}
			System.out.println();
			row = row + 1;

		}

	}

}
