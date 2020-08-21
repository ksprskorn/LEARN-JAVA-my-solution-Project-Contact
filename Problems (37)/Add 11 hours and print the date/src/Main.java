import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        LocalDateTime date = LocalDateTime.parse(dateString).plusHours(11);
        LocalDate shortDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        System.out.println(shortDate.toString());
    }
}
