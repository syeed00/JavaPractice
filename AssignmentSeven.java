import java.util.Scanner;

public class AssignmentSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you love java? ");
        char ch=input.next().charAt(0);

        if( ch == 'Y' || ch== 'y'){
            System.out.println("you are a java lover");
        }
        if( ch == 'N' || ch== 'n'){
            System.out.println("you are not a java lover");
        }
}
}
