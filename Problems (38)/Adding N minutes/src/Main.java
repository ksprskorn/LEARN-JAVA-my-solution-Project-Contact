import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        long minutes = scanner.nextInt();
        LocalDateTime date = LocalDateTime.parse(dateString).plusMinutes(minutes);
        LocalTime time = LocalTime.of(date.getHour(), date.getMinute(), date.getSecond());
        System.out.println(date.getYear() + " " + date.getDayOfYear() + " " + time.toString());
    }
}