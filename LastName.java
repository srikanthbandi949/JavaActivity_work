import java.util.*;

public class LastName {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        // System.out.println("Enter first player name : ");
        String player1 = s.nextLine();
        // System.out.println("Enter second player name : ");
        String player2 = s.nextLine();

        int index1 = player1.indexOf(" ");
        int index2 = player2.indexOf(" ");

        String l_name1 = player1.substring(index1+1);
        String l_name2 = player2.substring(index2+1);

        // System.out.println(l_name1);
        // System.out.println(l_name2);

        String player1_lname = l_name1;
        String player2_lname = l_name2;

        // System.out.println(player1_lname);
        // System.out.println(player2_lname);
        // System.out.println(l_name1 == l_name2);
        // System.out.println(player1_lname == player2_lname);
        // System.out.println(player1_lname.equals(player2_lname));

        if(player1_lname.equals(player2_lname) == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
    
}
