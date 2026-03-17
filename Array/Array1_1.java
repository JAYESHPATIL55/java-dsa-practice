import java.util.Scanner;

class Array1_1 {
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int[] arr ={1,2,3,4,5,6,7};
      int k=3;
      rotate(arr,k);
      for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
    public static void rotate(int[] arr,int k){
      int n = arr.length;
    Reverse(arr, 0, n-k-1);/*arr / 0 for starting number which number we want / n-k-1 for 
                                    from where number we want to get to front or the array*/
      Reverse(arr, n-k, n-1);/*arr,n-k for from where the number is we want to reverse, n-1 for where we add it */
      Reverse(arr, 0, n-1);/* arr, 0 for where we add ,n-1 from the last of array bcz array index is 0 not 1*/


    }
    public static void Reverse(int[] arr , int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
    }
}
