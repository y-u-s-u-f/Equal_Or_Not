import java.util.Scanner;
public class isEqual {

    public static void main(String[] args) 

    {

        int first_number;
        int second_number;
        boolean result = false;

        Scanner number = new Scanner(System.in);

        System.out.print("Enter first number: ");

        first_number = number.nextInt();

        System.out.print("Enter second number: ");

        second_number = number.nextInt();

        if(first_number == second_number)
          result = true;
     
        System.out.println(result);
    }
	
}
