package array;

public class pattaren8 {
	public static void main(String args[]) {
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
