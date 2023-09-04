package patterns;

import java.util.*;

public class ques4 {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int n = 5;
		int row, nst, nsp;
		nsp = n - 1;
		nst = 1;
		row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= nsp) {
				System.out.print("_" + " ");
				i = i + 1;
			}
			int j = 1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j = j + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst=nst+1;
		}
	}

}
