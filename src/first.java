import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个非负整数: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("阶乘只定义在非负整数上。");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println(number + " 的阶乘是: " + factorial);
        }

        scanner.close();
    }

    // 计算阶乘的方法
    private static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // 0 的阶乘是 1
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
