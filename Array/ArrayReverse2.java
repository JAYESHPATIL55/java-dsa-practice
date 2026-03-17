import java.util.Scanner;
class ArrayReverse2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For The Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter The Number From reverse:");
        int i = sc.nextInt();
        System.out.println("Enter The Number To reverse:");
        int j = sc.nextInt();
        Reverse(arr,i,j);
        System.out.println(arr);
        System.out.println("The Array After Update:");
        for (int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void Reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
