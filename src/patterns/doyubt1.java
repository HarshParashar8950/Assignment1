package patterns;

import java.util.*;

public class doyubt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp1 = n - 1;
		int nsp2 = -1;
		int rowvalL = 1;
		int rowvalR = 1;

		while (row <= n) {
//			Space 1
			int i = 1;
			while (i <= nsp1) {
				System.out.print(" " + " ");
				i++;
			}
//			left star;
			int j = 1;
			int valL = rowvalL;
			while (j <= nst) {
				System.out.print(valL + " ");
				j++;
				valL--;
			}
//			space 2 
			int k = 1;
			while (k <= nsp2) {
				System.out.print(" " + " ");
				k++;
			}
//			right star;
			int m = 1;
			int valR = rowvalR;
			if (row == 1 || row == n) {
				m = 2;
			}
			while (m <= nst) {
				System.out.print(valR + " ");
				m++;
				valR++;
			}
//			Next row;

			if (row < n / 2 + 1) {
				nsp1 = nsp1 - 2;
				nst = nst + 1;
				nsp2 = nsp2 + 2;
				rowvalL++;
			} else {
				nsp2 = nsp2 - 2;
				nsp1 = nsp1 + 2;
				nst = nst - 1;
				rowvalL--;
			}
			System.out.println();
			row = row + 1;

		}

	}

}
