import java.time.LocalTime;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String timeString1 = scanner.nextLine();
        String timeString2 = scanner.nextLine();

        int timeInSecond1 = LocalTime.parse(timeString1).toSecondOfDay();
        int timeInSecond2 = LocalTime.parse(timeString2).toSecondOfDay();

        System.out.println(Math.abs(timeInSecond1 - timeInSecond2));

    }
}