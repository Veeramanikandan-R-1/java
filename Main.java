import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int a, String s) {
        this.age = a;
        this.name = s;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Student> listObj = new ArrayList<>();
        listObj.add(new Student(21, "Mani"));
        listObj.add(new Student(19, "Harish"));
        listObj.add(new Student(42, "Rani"));

        Comparator<Student> comp = (i, j) -> i.age > j.age ? 1 : -1;

        Collections.sort(listObj, comp);
        for (Student stud : listObj) {
            System.out.println(stud.name);
            System.out.println(stud.age);
        }
    }
}