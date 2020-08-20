import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.next();
        LocalDate date = LocalDate.parse(inputDate);
        System.out.println(date.minusYears(30));
        System.out.println(date.plusYears(30));

    }
}