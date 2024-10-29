package array;

public class Armstrong {
	public static void main (String args[] ) {
		int a=153;
		int b=a;
		int amstrong=0;
		while(b>0) {
			int c=b%10;
			amstrong=amstrong+c*c*c;
			b=b/10;
		}
		if(a==amstrong) {
		System.out.println("This is the Amstrong Number "+amstrong);
		
		}else {
			System.out.println("this is not the Amstrong number "+a);
		}
	}

}
