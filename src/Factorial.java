import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        double pi_num = calculatePi(i);
        System.out.println(pi_num);
    }

    public static double calculatePi(int numPoints) {
        int numInsideCircle = 0;
        for (int i = 0; i < numPoints; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                numInsideCircle++;
            }
        }
        return 4.0 * numInsideCircle / numPoints;
    }



}
