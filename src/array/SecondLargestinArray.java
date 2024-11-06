public  class SecondLargestinArray{
    public static void main(String[] args) {
        int arr[]={12 ,35 ,1 ,10, 34 ,1};
        int max=arr[0];
        int max2=max;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.err.println("Max number in the array "+max);
        System.err.println("2 Lowest Max number in the array "+max2);

    }
}