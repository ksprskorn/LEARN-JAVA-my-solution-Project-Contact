import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int count = 0;
        for (int k = 0; k < size; k++) {
            if (array[k] == number) {
                count++;
            }
        }
        System.out.print(count);
    }
}