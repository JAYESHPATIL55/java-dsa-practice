import java.util.Scanner;
class Pattern15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int num=sc.nextInt();
       int row=1;
       int star=1;
       int space1=-1;
       int space2=num/2;
       while(row<=num){
        int i=1;
        while(i<=space2){
            System.out.print("  ");
            i++;
        }
        System.out.print("* ");
        int j=1;
        while(j<=space1){
            System.out.print("  ");
            j++;
        }
        if(row==num || row==1){
            System.out.print("");
        }else{
        System.out.print("* ");
        }
        if(row<=num/2){
            space2--;
            space1+=2;
        }else{
            space2++;
            space1-=2;
        }
        row++;
        System.out.println();
       }
    }    
}
