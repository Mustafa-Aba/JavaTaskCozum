package tasks08_forLoop;

public class Odev03 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */
        int toplam=0;
        int n=9;
        for (int i = 0; i < 10; i++) {
            toplam=toplam+i;
        }
        System.out.println("ilk 10 dogal sayının toplamı = " + toplam);
        System.out.println("formul ile toplam= "+n*(n+1)/2);

    }
}
