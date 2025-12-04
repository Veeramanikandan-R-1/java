class Box<T> {
    T value;

    void set(T setValue) {
        this.value = setValue;
    }

    T get() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        Box<Integer> boxObj = new Box<>();
        int intArr = 1;
        boxObj.set(intArr);
        System.out.println("Value: " + boxObj.get());

    }
}