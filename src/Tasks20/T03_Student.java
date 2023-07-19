package Tasks20;

import java.util.ArrayList;
import java.util.Scanner;


public class T03_Student {

    String name;
    int maxCredit;
    int toplamCredit = 0;

    T03_Lesson lesson = new T03_Lesson();

    static ArrayList<T03_Lesson> lessonList = new ArrayList<>();
    static ArrayList<T03_Lesson> newlessonList = new ArrayList<>();


    T03_Student(int maxCredit) {
        this.maxCredit = maxCredit;
    }

    void toplamKredisi(int credit) {
        toplamCredit += credit;
    }

    void dersKayit() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Ders secimi yapınız: ");
            int dersSecim = input.nextInt();
            toplamKredisi(lessonList.get(dersSecim - 1).credit);

            if (maxCredit > toplamCredit) {
                newlessonList.add(lessonList.get(dersSecim - 1));
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "T03_Student{" +
                "name='" + name + '\'' +
                ", maxCredit=" + maxCredit +
                ", toplamCredit=" + toplamCredit +
                ", lesson=" + lesson +
                '}';
    }
}

