package Searching;
import java.util.Scanner;
class Binary_Search {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={ 2, 3, 4, 5, 6, 7, 8, 9};
        int item = 7;
        System.out.println(search(arr,item)+" ");
    }
    public static int search(int[] arr,int item){
        int lo = 0;
        int hi=arr.length-1;
        int mid;
        while(lo<=hi){
         mid=  ( lo + hi ) / 2;
        if(arr[mid] == item ){
            return mid;
        }else if( arr[mid] > item ){
            hi=mid-1;
        }else{
            lo=mid+1;
        }
    }
        return -1;    
}
}
