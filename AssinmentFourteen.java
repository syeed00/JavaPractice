import java.util.Scanner;
// 1. generate and print palindrome numbers from m-n
// 2. count and print number of palindrome numbers
public class AssinmentFourteen {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("start number: ");
            int m = input.nextInt();

            System.out.print("end number: ");
            int n = input.nextInt();
            int totalPalindromeNumber=0;

            for (int i =m; i <= n; i++){
                int temp=i ,r;
                int sum=0;
                while(temp!=0){
                    r=temp%10;
                    sum=sum*10+r;
                    temp=temp/10;
                }
                if(sum==i){
                    System.out.println(""+sum);
                    totalPalindromeNumber++;
                }
            }
            System.out.println("Total Palindrome numbers : "+totalPalindromeNumber);
        }
    }
}