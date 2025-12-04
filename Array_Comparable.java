import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Car implements Comparable {
    public String model;
    public String brand;
    public int year;

    public Car(String m, String b, int y) {
        model = m;
        brand = b;
        year = y;
    }

    public int compareTo(Object obj) {
        Car otherObj = (Car) obj;
        if (year > otherObj.year)
            return 1;
        if (year < otherObj.year)
            return -1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> arr1 = new ArrayList<Car>();
        arr1.add(new Car("m1", "b1", 1998));
        arr1.add(new Car("m2", "b2", 1971));
        arr1.add(new Car("m3", "b3", 1909));

        Collections.sort(arr1);

        for (Car obj1 : arr1) {
            System.out.println(obj1.brand);
        }
    }
}