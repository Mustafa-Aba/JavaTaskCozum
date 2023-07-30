package tasks20_Constructor;


import static tasks20_Constructor.T03_Student.*;

public class T03_Runner {
    /*
    Task 03 ->
    T03_Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    T03_Student Class : fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    T01_Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
   // static ArrayList<T03_Lesson> lessons=new ArrayList<>();

    public static void main(String[] args) {


        T03_Lesson lesson1=new T03_Lesson("Java",3);
        T03_Lesson lesson2=new T03_Lesson("Python",4);
        T03_Lesson lesson3=new T03_Lesson("C++",5);


        T03_Student student1=new T03_Student(10);


        lessonList.add(lesson1);
        lessonList.add(lesson2);
        lessonList.add(lesson3);



        System.out.println("*****Dersler*****");
        System.out.println(lessonList);

        student1.dersKayit();
        System.out.println("Toplam Credit 10 dan fazla olamaz. \nDers Kaydı tamamlandı.");
        System.out.println("Alınan dersleri=\n" + newlessonList);

        System.out.println("Alınamayan dersler= " );

        for (T03_Lesson each: lessonList ) {
            if(!newlessonList.contains(each)){
                System.out.println(each);
            }
        }



    }





}
