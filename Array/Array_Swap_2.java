class Array_Swap_2 {
     public static void Swap(int[] arr, int[] other){
        int[] temp = arr;
        arr = other;
        other=temp;
    }
    public static void main(String []args){
        int[] arr={10, 20, 30, 40, 50};
        int[] other={100, 200, 300, 400, 600};
        System.out.println(arr[0]+" "+other[0]);
        Swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }    
   
}
