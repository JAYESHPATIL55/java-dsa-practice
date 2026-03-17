class Array_Reverse {
    public static void main(String []args){
        int[] arr = {121,22,344,54,65,63,87,98,9};
        Reverse(arr);
    }
public static void Reverse(int[] arr){
        int j =arr.length-1;
    for (int i = 0; i <arr.length; i++,j--) {
        Swap(arr, i, j);
    }
}
public static void Swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
