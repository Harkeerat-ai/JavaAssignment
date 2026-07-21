import java.util.*;
public class UsernameGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your first name : ");
        String fname = sc.next();
        System.out.println("Please enter your last name : ");
        String lname = sc.next();

        StringBuilder sb = new StringBuilder(fname);
        System.out.println("Your username is : " + sb.append('.'+lname));
    }
}