

public class LargestElemtinArray{
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5,7};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.err.println("The Largest Elemet in the array " + max);
    }
}