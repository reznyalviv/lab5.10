public class Main4 {
    public static void main(String[] args) {
        int num = 10;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
