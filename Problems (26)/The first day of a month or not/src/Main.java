import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        int inputDayOfYear = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(inputYear, inputDayOfYear);
        System.out.println(date.getDayOfMonth() == 1 ? true : false);
    }
}