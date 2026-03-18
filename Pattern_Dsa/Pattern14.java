import java.util.Scanner;
class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row= 1;
        int star= num;
        int space=-1;
        while(row<=num){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(row==1 || row==num){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<=num/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
    }
}
