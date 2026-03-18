import java.util.Scanner;
class Pattern10 {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int num = sc.nextInt();
    int row = num;
    int space = 2*num-3;
    int star= 1;
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
            if(k==num){
            System.out.print(" ");
            break;
            }
            System.out.print("* ");
            k++;
        }
        System.out.println();
        row--;
        star++;
        space-=2;

    }
}    
}
