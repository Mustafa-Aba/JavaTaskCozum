package tasks24_Encapsulation.task01;

import java.util.Scanner;

public class Main {

    /* TODO
        Burada iki class vardır. Biri Main diğeri ise Subscribe.
        Subscribe class'ının içinde;
        Bu variables'ları private oluşturunuz.
        String name
        boolean doYouWanaSubscribe
        String whichMember
        3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

    todo    Main class'ın içinde;
        Örnek;
        Name is Victoria, doYouWanaSubscribe true, whichMember Gold

        Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;

        Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
        all homework and see you soon. yazdırınız.

        Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
        Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

        Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
        Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

        Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
        See you when you want to be a member. Thanks yazdırınız.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String whichMember = "";
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Do you want to subscribe?\nYes-->(Y)\t****No-->(N)");
        boolean doYouWanaSubscribe = input.next().toUpperCase().charAt(0) == 'Y';

        if (doYouWanaSubscribe) {
            System.out.println("Which membership do you want?\nGold-->'G'\nSilver-->'S'\nBronze-->'B' ");
            whichMember = input.next().toUpperCase();
            Subscribe subscribe = new Subscribe(name, doYouWanaSubscribe, whichMember);
            System.out.println(subscribe);
        } else
            System.out.println("See you when you want to be a member.");

    }

}

class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;


    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWanaSubscribe = doYouWanaSubscribe;
        this.whichMember = whichMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        System.out.print("Welcome to membership: " + name.toUpperCase());
        switch (getWhichMember()) {
            case "G":
                return " .Your membership is 40 dollar " +
                        "for month you can enjoy the videos ,all homework and see you soon.";
            case "S":
                return " .Your membership is 20 dollar " +
                        "for month you can enjoy the videos and all homework.";
            case "B":
                return " .Your membership is 10 dollar " +
                        "for month you can enjoy the videos.";
            default:
                System.out.println("Invalid enter.Try again");
                break;

        }
        return "";

    }
}