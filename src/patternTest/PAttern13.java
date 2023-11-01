package patternTest;
import java.util.*;
public class PAttern13 {
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" " );
				i++;
			}
			System.out.println();
			row++;
			if(row<=n) {
				nst++;
			}
			else {
				nst--;
			}
		}
	}

}
