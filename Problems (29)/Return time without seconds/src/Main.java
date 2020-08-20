import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String inputTime = input.next();

        LocalTime time = LocalTime.parse(inputTime);
        System.out.println(LocalTime.of(time.getHour(), time.getMinute()));
    }
}