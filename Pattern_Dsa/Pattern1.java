//import java.util.Scanner;
class Pattern1 {
    public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        int num = 5;
        int row = num;
        while (row!=0){
        int col = num;
        while(col>=row){
        col--;
        System.out.print("* ");
        }
        row--; 
        System.out.println("");
        }
    }
}