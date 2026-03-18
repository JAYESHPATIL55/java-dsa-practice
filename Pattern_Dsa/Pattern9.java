import java.util.Scanner;
class Patttern9 {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = num-1;
        while(row<=num){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                if(j%2==0){
                System.out.print("! ");
                }
                else{
                System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;
        }
    }
}
