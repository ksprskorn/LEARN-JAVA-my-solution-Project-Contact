import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        int inputMonth = scanner.nextInt();
        LocalDate firstMonthDate = LocalDate.of(inputYear, inputMonth, 1);
        LocalDate lastMonthDate = LocalDate.of(inputYear, inputMonth, firstMonthDate.lengthOfMonth());

        System.out.println(firstMonthDate + " " + lastMonthDate);

    }
}