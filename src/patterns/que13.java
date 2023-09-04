package patterns;

public class que13 {

	public static void main(String[] args) {
		int n, nst, nsp, row;
		n = 5;
		row = 1;
		nst = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= nst) {

				System.out.print("*" + " ");
				i++;
			}
			if (row < n) {
				nst = nst + 1;
			} else {
				nst = nst - 1;
			}

			System.out.println();
			row = row + 1;
		}

	}

}
