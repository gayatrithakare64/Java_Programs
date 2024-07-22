package com.programs.JavaPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp = 0;
int[] arr = {10, 66, 88, 98, 23, 45};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
		}
	}
	
}
System.out.println("Second Largest Number is: = "+arr[arr.length-2]);
	}

}
