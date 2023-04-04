import java.util.Scanner;
public class AssignmentNine{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("select option:");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Hindi");
                break;
            default:
                System.out.println("English");
                break;
        }
    }
}
