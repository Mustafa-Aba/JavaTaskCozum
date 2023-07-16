package Task20;

import java.util.ArrayList;

public class T03_Lesson {

    String name;
    int credit;

    public T03_Lesson(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public T03_Lesson() {
    }




    @Override
    public String toString() {
        return "T03_Lesson{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
