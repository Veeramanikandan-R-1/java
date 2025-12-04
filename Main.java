import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scannerObj.nextLine();

        System.out.println("name " + name);

        String age = scannerObj.nextLine();

        System.out.println("age " + age);

    }
}