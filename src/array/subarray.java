package array;

import java.util.HashMap;

public class subarray {

static void SubArrSum(int arr[],int sum ) {
	int start =0;
	int end=-1;
	int currSum=0;
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		currSum+=arr[i];
		if(currSum==sum) {
			start=0;
			end=i;
			break;
		}
		if(map.containsKey(currSum-sum)) {
			start=map.get(currSum-sum)+1;
			end=i;
		}
		map.put(currSum, i);
	}
	if(end==-1) {
		System.out.println("Not Found");
	}
	else {
//		start+=1;
//		end+=1;
		System.out.println(start+" "+ end);
	}
}
public static void main (String [] args) {
	int arr[]= {2,5,7,8,6};
	int sum=12;
	SubArrSum(arr,sum);
}

	

}
