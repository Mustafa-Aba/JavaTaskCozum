package tasks26_Exceptions_Handling.task08._02;


import tasks26_Exceptions_Handling.task08._02.Account;

public class BankaMain {
    public static void main(String[] args) {

       Account account1 = new Account("1111", 6000);
       Account account2 = new Account("2222", 4000);
       Account account3 = new Account("3333", 10000);

        account2.anaMenu();
    }
}