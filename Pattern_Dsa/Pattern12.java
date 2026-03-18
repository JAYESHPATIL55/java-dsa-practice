import java.util.Scanner;
class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row<=2*num-1){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(num>row){
                star++;
            }else{
                star--;
            }
            row++;
            System.out.println();
        }
    }
}