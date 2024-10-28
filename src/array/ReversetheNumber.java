package array;

public class ReversetheNumber {
public static void main(String args[]) {
	int n=12345;
	int Reverse = 0;
	while (n>0) {
		int c =n%10;
		Reverse=Reverse*10+c;
		
		n=n/10;
	}
//	Reverse=Reverse/10;
	System.out.println(Reverse);
}
}
