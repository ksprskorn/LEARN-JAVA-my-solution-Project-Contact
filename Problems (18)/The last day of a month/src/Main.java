import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);
        int dayOfMonth = date.getDayOfMonth();
        int lenOfMonth = date.lengthOfMonth();
        System.out.println(dayOfMonth == lenOfMonth ? true : false);
    }
}