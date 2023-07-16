package Task20;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Task20.T03_Student.*;

public class T03_Runner {
    /*
    Task 03 ->
    T03_Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    T03_Student Class : fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    T01_Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
    static ArrayList<T03_Lesson> lessons=new ArrayList<>();
    public static void main(String[] args) {


        T03_Lesson lesson1=new T03_Lesson("Java",3);
        T03_Lesson lesson2=new T03_Lesson("Python",4);
        T03_Lesson lesson3=new T03_Lesson("C++",5);


        T03_Student student1=new T03_Student(10);


        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);

        System.out.println("*****Dersler*****");
        System.out.println(lesson1);
        System.out.println(lesson2);
        System.out.println(lesson3);


        student1.dersKayit();

        System.out.println("student1 = " + student1);


    }





}
