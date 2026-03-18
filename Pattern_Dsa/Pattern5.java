import java.util.Scanner;
class Pattern5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num;i!=0;i--){
            for(int j=1;j<=num;j++){
                if(j>=i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        int row = num;
        while (row!=0){
        int col = num;
        while(col!=0){
        if(col<=row)
        {
            System.out.print("* ");
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