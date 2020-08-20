import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        int inputMonth = scanner.nextInt();
        int offset = scanner.nextInt();

        LocalDate date = LocalDate.of(inputYear, inputMonth, 1);

        System.out.println(date.plusMonths(1).minusDays(offset));
    }
}