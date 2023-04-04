// 1. generate and print armstrong numbers from m-n
// 2. count and print number of armstrong numbers
import java.util.Scanner;
public class AssignmentFifteen {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("start number: ");
            int m = input.nextInt();

            System.out.print("end number: ");
            int n = input.nextInt();

            int totalArmstrongNumber=0;

            for(int i=m;i<=n;i++){
                int temp=i,r ;
                int sum=0;
                while (temp!=0){
                    r=temp%10;
                    sum=sum+(r*r*r);
                    temp=temp/10;
                }
                if(i==sum){
                    System.out.println(""+sum);
                    totalArmstrongNumber++;
                }
                sum=0;

            }


            System.out.println("Total armstrong numbers : "+totalArmstrongNumber);
        }
    }
}