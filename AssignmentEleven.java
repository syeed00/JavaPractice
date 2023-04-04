import java.util.Scanner;
public class AssignmentEleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = input.nextInt();
        double factorial = 1;
        int i;

        for(i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.println("ANS:" +factorial);
    }
}