import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        int inputMonth = scanner.nextInt();
        LocalDate date = LocalDate.of(inputYear, inputMonth, 1);
        int lastDay = date.lengthOfMonth();
        for (int i = 0; i < lastDay; i++) {

            if (date.getDayOfWeek().toString().equals("MONDAY")) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}