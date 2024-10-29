package array;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAllDivisorsOfaGivenNumber {
public static void main (String args[]) {
	int n=12;
	ArrayList<Integer>Diviser=new ArrayList<Integer>();
	for(int i =1;i<=n;i++) {
		if(n%i==0) {
			Diviser.add(i);
		}
	}
	Iterator<Integer> itr=Diviser.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
