import java.util.Scanner;
class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row = 1;
        int star = num;
        int space=num-1;
       while(row<=2*num-1){
        int i=1;
        while(i<=space){
            System.out.print("  ");
            i++;

        }
        int j=1;
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        if(row<num){
            star--;
            space--;
        }else{
            star++;
            space++;
        }
        row++;
        System.out.println();
       }
    }
}