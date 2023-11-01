package test;
import java.util.*;
public class combiningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 3 };
		int[] nums2 = { -2,-1};

		  int x=nums1.length+nums2.length;
	       int a= nums1.length;
	        int b=nums2.length;
	        int [] fin=new int[x];
	        for(int i=0;i<a;i++){
	            fin[i]=nums1[i];
	        }
	        for(int i=0;i<b;i++){
	            fin[a+i]=nums2[i];
	        }
	        	System.out.println(Median(fin));
	    }
	    public static void BubbleSort(int [] arr){
	        for(int round =1; round<arr.length;round++){
	            for(int i=0;i<arr.length-1;i++){
	                if(arr[i]>arr[i+1]){
	                    int temp=arr[i];
	                    arr[i]=arr[i+1];
	                    arr[i+1]=temp;
	                }

	            }
	        }
	    }
	    public static double Median(int [] arr){
	    	Arrays.sort(arr);
	       
	        double w = arr.length;
	       
	       double mid=0;
	        if(w%2!=0){
	        	 mid = arr[(int)w / 2];
	        }
	        else{
	          int mid1 = arr[(int)(w - 1) / 2];
        int mid2 = arr[(int)w / 2];
        mid = (mid1 + mid2) / 2.0;
	        }
	        return mid;
	    }
	}