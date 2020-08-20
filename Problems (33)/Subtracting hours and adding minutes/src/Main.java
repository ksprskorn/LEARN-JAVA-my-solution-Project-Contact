import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.next();
        int inputHours = scanner.nextInt();
        int inputMinutes = scanner.nextInt();
        LocalDateTime time = LocalDateTime.parse(inputTime).minusHours(inputHours).plusMinutes(inputMinutes);
        System.out.println(time.toString());

    }
}