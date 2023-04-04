import java.util.Scanner;
public class InputPrac {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("ENTER ANY Name");

        name=input.nextLine();
        System.out.println("welcome" +name);
    }
}
