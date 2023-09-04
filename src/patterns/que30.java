package patterns;

public class que30 {

	public static void main(String[] args) {
		int n, row, count, nsp,nst;
		n = 5;
		row = 1;
		count=5;
		nsp=0;
		nst=0;
		while (row <= n) {
			int i = 1;
			while (i <= nsp) {
				System.out.print(count + " ");
				i = i + 1;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("_"+" ");
				j=j+1;
			}
			count--;
			System.out.println();
			row = row + 1;
		}

		

	}

}
