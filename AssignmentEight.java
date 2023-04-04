import java.util.Scanner;
public class AssignmentEight {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.println("have you completed your masters?");
        char ch=input.next().charAt(0);

        Scanner input1 = new Scanner(System.in);
        System.out.println("are you fulent in English?");
        char ch1=input1.next().charAt(0);

        if(ch=='y' && ch1=='y'){
            System.out.println("You are eligible to for the job interview");
        }
        else {
            System.out.println("You are not eligible to for the job interview");
        }
    }
}
