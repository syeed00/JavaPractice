import java.util.Scanner;
public class AssignmentSeventeen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Eneter the line number: ");
        int n =input.nextInt();
//Assending:
        //for(int row=1;row<=n;row++){
          //   for(int col=1;col<=row;col++){
            //     System.out.print(" "+col);
             //}
            // System.out.println();
         //}
//Decending:
 //       for(int row=n;row>=1;row--){
   //         for(int col=1;col<=row;col++){
     //           System.out.print(" "+col);
       //     }
         //   System.out.println();
        //}
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j%2);
            }
            System.out.println();
        }

    }
}
