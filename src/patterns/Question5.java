package patterns;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int nst, nsp;
		nst = n;
		nsp = 1;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i < nsp) {
				System.out.print(" " +" ");
				i = i + 1;

			}
			int j=1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j=j+1;
			}
			System.out.println();
			row = row + 1;
			nst = nst - 1;
			nsp = nsp + 1;
		}

	}

}
