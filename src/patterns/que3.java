package patterns;

import java.util.*;

public class que3 {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int i = 1;
			while (i <= nst) {
				System.out.print("*" + " ");
				i=i+1;
			}
			System.out.println();
			row=row+1;
			nst=nst-1;
		}

	}

}
