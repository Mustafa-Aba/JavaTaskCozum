package tasks05_IfElse;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (quiz , ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner input=new Scanner(System.in);
        System.out.println("Quiz puanınızı giriniz: ");
        int quiz=input.nextInt();
        System.out.println("Ara sınav puanınızı giriniz: ");
        int araSinav=input.nextInt();
        System.out.println("Final puanınızı giriniz: ");
        int finalPuan=input.nextInt();

        int ortalama=(quiz+araSinav+finalPuan)/3;

        if (ortalama<50) {
            System.out.println("Notunuz : F") ;
        }else if (ortalama<70) {
            System.out.println("Notunuz : C") ;
        }else if (ortalama<90) {
            System.out.println("Notunuz : B") ;
        }else if (ortalama<=100) {
            System.out.println("Notunuz : A") ;
        }else
            System.out.println("Yanlış not girişi");


    }
}
