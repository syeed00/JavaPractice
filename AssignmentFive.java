import java.util.Scanner;
public class AssignmentFive {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Whats your age :");
        int age =input.nextInt();

        if (age == 18 && age > 18){
            System.out.println("valid voter");
        }
        else{
            System.out.println("invalid voter");
        }

    }
}
