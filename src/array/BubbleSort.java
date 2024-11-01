package array;

import java.util.Arrays;

public class BubbleSort {
	public static void main (String args[]) {
		int a []= {13,46,52,24,20,9};
		for(int i=a.length-1;i>=0;i--) {
			
			for (int j=0;j<=i-1;j++) {
				if (a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("Sorted Array with bubble sort "+Arrays.toString(a));
	}

}
