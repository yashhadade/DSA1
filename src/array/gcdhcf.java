package array;

public class gcdhcf {
public static void main (String args[]) {
	int n1=9;
	int n2=12;
	int gcd=1;
	for (int i=1;i<=Math.min(n1,n2);i++) {
		if(n1 % i==0 && n2 % i==0) {
			gcd=i;
		}
		
	}
	System.out.println(gcd);
}
}
