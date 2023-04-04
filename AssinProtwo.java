import java.util.Scanner;
public class AssinProtwo {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("id:");
        int id=input.nextInt();

        Scanner input1=new Scanner(System.in);

        System.out.println("title:");
        String title=input1.nextLine();

        System.out.println("price:");
        String price=input1.nextLine();

        System.out.println("description:");
        String description=input1.nextLine();

        System.out.println("category:");
        String category=input1.nextLine();

        System.out.print("id:"+id);
        System.out.print("\ntitle:"+title);
        System.out.print("\nprice:"+price);
        System.out.print("\ndescription:"+description);
        System.out.print("\ncategory:"+category);

    }
}
