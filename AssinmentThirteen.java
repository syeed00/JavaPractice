import java.util.Scanner;
public class AssinmentThirteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("which fibonacci number you want to see? ");
        int n = input.nextInt();

        int first = 0;
        int Second = 1;
        int fibo;

        for(int i=1;i<n;i++){
            fibo=first+Second;
            System.out.println(" "+fibo);
            first=Second;
            Second=fibo;
    }
    }
}