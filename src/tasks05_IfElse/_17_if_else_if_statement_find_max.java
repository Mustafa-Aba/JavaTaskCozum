package tasks05_IfElse;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        int num1=18;
        int num2=25;
        int num3=13;
        int max;

        if (num1>num2 &&num1>num3) {
            max=num1;
        } else if (num2>num3) {
            max=num2;
        }else
            max=num3;
        System.out.println("Max olan sayı= "+ max);

    }
}
