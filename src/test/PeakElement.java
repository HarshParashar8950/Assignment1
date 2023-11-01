package test;
import java.util.*;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,7,11,15};
		int target=9;
		for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                if(target==sum){
System.out.println(i+" "+j);
                    
                }
            }
        }
	}

}
