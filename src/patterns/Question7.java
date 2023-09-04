package patterns;

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		int n, row, nst, nsp;
		n = 5;
		row = 1;
		nst = n;
		
		nsp = n-2;
		while(row<=n) {
		if (row == 1|| row==n) {
			int i = 1;
			while (i <= n) {
				System.out.print("*" + " ");
				i++;
			} 
			}
			else{
				System.out.print("*"+" ");
				int i=1;
				while(i<=n-2) {
					System.out.print(" "+" ");
					i++;}
					
				System.out.print("*"+" ");	
				}
		row=row+1;
		System.out.println();
		
				
				
				
				
				
				
			}
		}
			
	}
