//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

package patternTest;
import java.util.*;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst = n;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				//Print Stars
				
				System.out.print("*"+" ");
				
				i++;
				
			}
			System.out.println();
			nst--;
			row++;
		}
	}

}


