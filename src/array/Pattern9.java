package array;

public class Pattern9 {
	public static void main(String args[]) { 
	for(int i =5;i>=1;i--) {
		for (int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*(5-i)+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int n=5;
	for(int i =0;i< n;i++) {
		
		for (int j=0;j< i;j++) {
			System.out.print(" ");
		}
	     for(int j=0;j< 2*(n-i)-1;j++) {
			System.out.print("*");
		}
	     
		System.out.println();
	}
	}
}
