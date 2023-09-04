package patterns;

import java.util.*;

public class question1 {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int n=5, row;
		row = 1;
		while (row <= n) {

			int i = 1;
			while (i <= n) {
				System.out.print("*" + " ");

				i=i+1;
			}		
			System.out.println();
			row=row+1;
		}

	}

}
