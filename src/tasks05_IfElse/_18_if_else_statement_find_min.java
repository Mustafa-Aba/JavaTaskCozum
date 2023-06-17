package tasks05_IfElse;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */

        int sayi1=14,sayi2=15,sayi3=12,min;

        if (sayi1<sayi2&& sayi1<sayi3) {
            min=sayi1;

        } else if (sayi2<sayi3) {
            min=sayi2;
        }else
            min=sayi3;

        System.out.println("min = " + min);
    }
}
