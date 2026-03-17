class Max_Array {
    public static void main(String []args){
        int[] arr= { 2, 3, 21, 51, 7, 49, 101, 27, 56, 89};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max=-9;
        for (int i = 0; i < arr.length; i++) {
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
