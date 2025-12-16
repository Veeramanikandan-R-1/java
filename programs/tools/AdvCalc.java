package programs.tools;

public class AdvCalc extends Calc {
    public int test1 = 9;

    public int mult(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Calc calcObj = new Calc();
        int ste = calcObj.test;
    }
}
