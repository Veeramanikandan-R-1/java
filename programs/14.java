// 1. **Car Class Example**

//    - Create a `Car` class with `brand`, `model`, and `year`.
//    - Add methods: `displayInfo()` and `isOld()` (returns `true` if year < 2015).

package programs;

class Car {
    String brand;
    String model;
    int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + " model: " + model + " year: " + year);
    }

    public void isOld() {
        System.out.println("Is old: " + (year < 2015));
    }
}

public class Main {
    public static void main(String[] args) {
        Car carObj = new Car("b1", "m1", 2025);
        carObj.displayInfo();
        carObj.isOld();
    }
}
