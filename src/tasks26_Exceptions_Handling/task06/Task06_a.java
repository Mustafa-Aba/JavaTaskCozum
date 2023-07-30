package tasks26_Exceptions_Handling.task06;

import java.util.Random;

public class Task06_a {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.


        random12();


    }

    static void random12() {
        Random rnd=new Random();
        int random1= rnd.nextInt(11);//0-10 dahil (int) (Math.random()*10+1);//1-10 dahil
        int random2= rnd.nextInt(11);//0-10 dahil

        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);

        try {
            int toplam=random1+random2;
            if (toplam<12) {
                throw new Exception();
            }else
                System.out.println("toplam = " + toplam);
        } catch (Exception e) {
            System.out.println("Sayı 12'den küçük ise hata verir");
        }

    }

}
