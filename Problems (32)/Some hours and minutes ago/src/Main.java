import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputStringTime = scanner.nextLine();
        int inputIntHours = scanner.nextInt();
        int inputIntMinutes = scanner.nextInt();

        LocalTime time = LocalTime.parse(inputStringTime).minusHours(inputIntHours).minusMinutes(inputIntMinutes);
        System.out.println(time.toString());
    }
}