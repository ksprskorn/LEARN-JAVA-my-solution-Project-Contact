import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        int inputYearDay;
        LocalDate date;
        while (scanner.hasNextInt()) {
            inputYearDay = scanner.nextInt();
            date = LocalDate.ofYearDay(inputYear, inputYearDay);
            System.out.println(date);
        }
    }
}