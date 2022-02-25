import java.util.*;
public class StringUpper {
 
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter First name : ");
        String input1 = s.nextLine();
        System.out.println("Enter Last name : ");
        String input2 = s.nextLine();

        String first_letter = input1.substring(0,1);
        String remaining_letters = input1.substring(1);

        System.out.println(first_letter.toUpperCase()+remaining_letters.toLowerCase()+" "+input2.toUpperCase());

    }
}
