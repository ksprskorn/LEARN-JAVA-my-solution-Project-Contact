import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        LocalDateTime date = LocalDateTime.parse(dateString);
        int hours = (date.getDayOfYear() - 1) * 24 + date.getHour();

        System.out.println(hours);
    }
}