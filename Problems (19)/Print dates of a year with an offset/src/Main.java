import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        int offsetInDays = scanner.nextInt();
        LocalDate date = LocalDate.parse(inputDate);
        System.out.println(date);
        int year = date.getYear();


        do {
            date = date.plusDays(offsetInDays);
            if (date.getYear() != year) {
                break;
            }
            System.out.println(date);
        } while (true);

    }
}