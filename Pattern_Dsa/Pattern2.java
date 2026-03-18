//import java.util.Scanner;
class Pattern2 {
    public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        int num = 5;
        int row = num;
        while (row!=0){
        int col = num;
        while(col!=0){
        if(col<=row)
        {
            System.out.print(" *");
        }else {
            System.out.print(" ");
        }
        col--;
        }
        row--; 
        System.out.println("");
        }
    }
}