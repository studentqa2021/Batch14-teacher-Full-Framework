package com.collection.practice;



public class PracticeArray {
	
	static int[] a= {2,3,4,77,11,6};//length =6 || index =5
	
	public static String getArray(){
		int max =a[0];//2
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {//max
				max=a[i];
			}	
			
			if(a[i]<min) {//min
				min=a[i];
			}
		}
		return max+"_"+min ;
	}
	public static void main(String[] args) {
		
		String value =PracticeArray.getArray();
		String max =value.split("_")[0];
		String min =value.split("_")[1];
		System.out.println("Max value ="+max);
		System.out.println("Min value ="+min);
		
	
	}

}
