package tasks08_forLoop;

public class Odev05 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        for (int i = 99; i >0 ; i-=2) {
            System.out.print(i+"-");
        }
        System.out.println();
        for (int i = 100; i >0; i--) {
            if (i%2==1) {
                System.out.print(i+"-");
            }
        }

    }
}
