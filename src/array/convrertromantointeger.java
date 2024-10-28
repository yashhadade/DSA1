package array;

public class convrertromantointeger {
	    static public int romanToInt(String s) {
	        int count=0;
	      int I=1;
	      int V=5;
	      int X=10;
	      int L=50;
	      int C=100;
	      int D=500;
	      int M=1000;
	     int k=s.length();
	      for(int i=0;i<k;i++){
	        if(s.charAt(i)==I||s.charAt(i)==V||s.charAt(i)==X||s.charAt(i)==L||s.charAt(i)==C||s.charAt(i)==D||s.charAt(i)==M){
	         int j = Character.getNumericValue(s.charAt(i));
	         System.out.println(j);	            
	         count+=j;
	        }
	      }
	      return count;
	    }
	public static void main(String[] args) {
		String s="III";
		int result;
		result=romanToInt(s);
		System.out.println(result);
		

	}

}
