import java.util.Scanner;
import java.time.*;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String datetimeString1 = scanner.nextLine();
        String datetimeString2 = scanner.nextLine();

        LocalDateTime dateTime1 = LocalDateTime.parse(datetimeString1);
        LocalDate date1 = LocalDate.of(dateTime1.getYear(), dateTime1.getMonth(), dateTime1.getDayOfMonth());
        int days1 = date1.getDayOfYear();
        LocalTime time1 = LocalTime.of(dateTime1.getHour(), dateTime1.getMinute());
        long seconds1 = time1.toSecondOfDay();

//        System.out.println(dateTime1.toString());
//        System.out.println(days1);
//        System.out.println(seconds1);

        LocalDateTime dateTime2 = LocalDateTime.parse(datetimeString2);
        LocalDate date2 = LocalDate.of(dateTime2.getYear(), dateTime2.getMonth(), dateTime2.getDayOfMonth());
        int days2 = date2.getDayOfYear();
        LocalTime time2 = LocalTime.of(dateTime2.getHour(), dateTime2.getMinute());
        long seconds2 = time2.toSecondOfDay();

//        System.out.println(dateTime2.toString());
//        System.out.println(days2);
//        System.out.println(seconds2);

        int daysToHours = Math.abs(days1 - days2) * 24;
//        System.out.println(daysToHours);
        double hoursLeft = (double)(seconds1 - seconds2) / 3600;

        System.out.println((int) ((double) daysToHours - hoursLeft) );


    }
}