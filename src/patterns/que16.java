package patterns;

public class que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, row, nst, nsp;
		n = 5;
		row = 1;
		nst = n;
		nsp = n - 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= nsp) {
				System.out.print(" " + " ");
				i = i + 1;
			}
			int j = 1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j = j + 1;

			}
			//For Mirror Image formation
			if (row < n) {
				nsp = nsp - 1;
				nst = nst - 1;
			} else {
				nsp = nsp + 1;
				nst = nst + 1;

			}
			//Preparation for next row
			System.out.println();
			row = row + 1;
		}

	}

}
