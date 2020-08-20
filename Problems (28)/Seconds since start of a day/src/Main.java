import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int inputSeconds = input.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(inputSeconds);
        if (time.getSecond() == 0) {
            System.out.println(LocalTime.of(time.getHour(), time.getMinute()));
        } else {
            System.out.println(LocalTime.of(time.getHour(), time.getMinute(), time.getSecond()));
        }
    }
}