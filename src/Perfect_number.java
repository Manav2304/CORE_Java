import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean b = isPerfect(n);

        if (b) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is NOT a Perfect Number");
        }

        sc.close();
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}