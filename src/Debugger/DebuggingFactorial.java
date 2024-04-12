package Debugger;

public class DebuggingFactorial { // Java314_Гиниятуллин
    public static void main(String[] args) {
        int n = 1;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);

        }
    }
}


