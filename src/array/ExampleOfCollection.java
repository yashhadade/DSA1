package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfCollection {
public static void main(String args[]) {
	ArrayList <String> list =new ArrayList<String>();
	list.add("Yash");
	list.add("Ashok");
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
