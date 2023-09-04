package patterns;

import java.util.*;

public class quee6 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst, nsp;
		nst = n;
		nsp = 1;
		while (row <= n) {
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

			System.out.println();
			row = row + 1;
			nst = nst - 1;
			nsp = nsp + 2;
		}

	}

}
