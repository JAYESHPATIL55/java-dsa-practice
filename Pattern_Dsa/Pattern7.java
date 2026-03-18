import java.util.Scanner;
class Pattern7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        int row = num;
        int star = 1;
        int space = 8;
        while(row!=0){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row--;
            space-=2;
            star++;
        }
    }
}
