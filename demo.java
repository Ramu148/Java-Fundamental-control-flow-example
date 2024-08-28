import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) 
        {
            System.out.println(" positive.");
        } 
        else if (number < 0) {
            System.out.println("negative.");
        } 
        else
         {
            System.out.println("zero.");
        }
        
        switch (number) 
        {
            case 0:
                System.out.println("zero.");
                break;
            case 1:
                System.out.println("one.");
                break;
            case 2:
                System.out.println("two.");
                break;
            default:
                System.out.println("this is the value.");
        }
        
 int i = 1;
        while (i <= number) {
     System.out.println("values: " + i);
            i++;
        }
        
        while (number>0) {
            System.out.println("values : "+number);
            number --;
        }
       scanner.close();
    }
}