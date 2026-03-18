import java.util.Scanner;
class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        int row = num;
        int star = num;
        int space = 0;
        while(row!=0){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                if(k>=num){
                System.out.print("  ");
                }else {
                System.out.print("* ");
                }
                k++;
            }
            row--;
            if(space>=1){
                space+=2;
            }else{
            space++;
            }
            star--;
            System.out.println();
        }


    }
}
