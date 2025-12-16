// 1. **Car Class Example**

//    - Create a `Car` class with `brand`, `model`, and `year`.
//    - Add methods: `displayInfo()` and `isOld()` (returns `true` if year < 2015).

package programs;

class BankAccount {
    int balance;

    public BankAccount(int b) {
        balance = b;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withDraw(int amount) {
        balance -= amount;
    }

    public void getBalance() {
        System.out.println("Account balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankObj = new BankAccount(0);
        bankObj.getBalance();
        bankObj.deposit(1000);
        bankObj.getBalance();
        bankObj.withDraw(500);
        bankObj.getBalance();
    }
}
