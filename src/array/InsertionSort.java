package array;

import java.util.Arrays;

public class InsertionSort {
public static void main(String args[]) {
	int a[]= {13,46,24,52,20,9};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<=i;j++) {
			if (a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
		}
	}
	System.out.println("Sorted Array with Insertion sort"+Arrays.toString(a));
}
}
