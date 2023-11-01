package test;
import java.util.*;
public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,2,3,4,5,7};
		int n = arr.length;
		Arrays.sort(arr);
		int x=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]==x) {
				x++;
			}
			else {
				System.out.println(x);
			}
			
		}

	}

}
