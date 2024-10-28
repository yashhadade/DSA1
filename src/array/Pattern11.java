package array;

public class Pattern11 {
 public static void main(String args[]) {
	int Start=1;
	for(int i=0;i<=4;i++) {
		if(i%2==0) {
			Start=1;
		}
		else {
			Start=0;
		}
		for(int j=0;j<=i;j++) {
			System.out.print(Start);
			Start=1-Start;
		}
		System.out.println();
	}
 }
}
