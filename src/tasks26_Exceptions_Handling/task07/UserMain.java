package tasks26_Exceptions_Handling.task07;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        getUser();


    }

    private static void getUser() {
        List<User> users = new ArrayList<User>();
        Scanner input = new Scanner(System.in);
       while (true) {
           System.out.println("Enter username:");
           String username = input.nextLine();

           System.out.println("Enter password:");
           String password = input.nextLine();
           try {
               if (password.length() < 6) {
                   throw new IllegalArgumentException("Password must be at least 6 characters.");
               } else {
                   users.add(new User(username, password, true, true));
               }
           } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
           }


           System.out.println("Enter username:");
           String username2 = input.nextLine();

           System.out.println("Enter password:");
           String password2 = input.nextLine();
           try {
               if (password2.length() < 6) {
                   throw new IllegalArgumentException("Password must be at least 6 characters.");
               } else {
                   users.add(new User(username2, password2, true, true));
                   break;
               }
           } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
           }
       }
        System.out.println("users.get(0).getId() = " + users.get(0).getId());
        System.out.println("users.get(1).getId() = " + users.get(1).getId());
        System.out.println("users = " + users);
    }

}
