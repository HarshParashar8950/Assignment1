package patternTest;
import java.util.*;
public class simple {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst=1;
		while(row<=n) {
			int i=1;
			//Print stars
			while(i<=nst) {
			System.out.print("*"+" ");
			i++;
			
			}
			//Preparation for next rows
			System.out.println();
			row++;
			nst++;
			
		}

	}

}
