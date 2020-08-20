import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        System.out.println(date.minusDays(10));

    }
}