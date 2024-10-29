package array;

public class checkPrimeNumer {
public static void main(String args[]) {
	int b=12;
	int count=0;
	for(int i=1;i<=b;i++) {
		if(b%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("This Numeber is the prime Number "+b);
	}else {
		System.out.println("this Number is not the prime Number "+b);
	}
}
}
