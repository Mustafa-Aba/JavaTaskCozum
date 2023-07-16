package Task20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Task20.T03_Runner.lessons;

public class T03_Student {

    String name;
    int maxCredit;
    int toplamCredit = 0;
    T03_Lesson lesson = new T03_Lesson();

    static ArrayList<T03_Lesson> lessonList = new ArrayList<>();


    T03_Student(int maxCredit) {

    }

    int toplamKredisi() {
        return toplamCredit += lesson.credit;
    }

     void dersKayit() {
        System.out.println("*****Dersler*****");
        System.out.println(lessonList);

        int dersSecim;

        System.out.println("Ders secimi yapınız: ");


        if (10 > toplamKredisi()) {
            dersSecim = new Scanner(System.in).nextInt();
            lessonList.add(lessons.get(dersSecim-1));
            toplamCredit=toplamKredisi();
            dersKayit();
        } else
            System.out.println("Credit toplam 10 dan fazla olamaz. Ders Kaydı tamamlandı.");

    }

    @Override
    public String toString() {
        return "T03_Student{" +
                "name='" + name + '\'' +
                ", maxCredit=" + maxCredit +
                ", lesson=" + lesson +
                '}';
    }
}

