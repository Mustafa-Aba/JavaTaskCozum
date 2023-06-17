package tasks03_Scanner;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours you sleep in a day: ");
        int numberOfHours =input.nextInt();
        double ratio = numberOfHours/24.0; // Gunluk oran
        int  monthly= (int) (ratio*30); // aylık hesaplanıp atandı
        int  yearly= (int) (ratio*365); // yıllık hesaplanıp atandı
        int fourYears= (int) (ratio*365*40); // 40 yıllık hesaplanıp atandı
        System.out.println("fourYears = " + fourYears);
        System.out.println("yearly = " + yearly);
        System.out.println("monthly = " + monthly);

    }
}
