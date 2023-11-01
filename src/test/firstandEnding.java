package test;
import java.util.*;
public class firstandEnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {5,7,7,8,8,10};
		int target =8;
		Arrays.sort(nums);
		StartEnd(nums, target);
		
		
	}
	public static  int [] StartEnd(int [] nums,int target) {
		int [] result=new int[2];
		
		int w=nums.length-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
//				System.out.println("Start = "+i);
				result[0]=i;
				break;
			}
		}
		for(int i=w;i>=0;i--) {
			if(nums[i]==target) {
				result[1]=i;
//				System.out.println("End = "+i);
				break;
			}
		}
//		for(int i=0;i<result.length;i++) {
//			System.out.print(result[i]+" ");
//		}
		return result;
		
	}

}
