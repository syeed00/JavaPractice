import java.util.Scanner;
public class AssinFour {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of installments?");
        int InstallmentNUM=input.nextInt();
        int phonePrice = 1800;
        //int InstallmentNUM;

        int installmentPerMonth = phonePrice/InstallmentNUM;

        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
    }
}

