import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int minNumber = array[0];
        for (int k = 1; k < size; k++) {
            if (array[k] < minNumber) {
                minNumber = array[k];
            }
        }
        System.out.print(minNumber);
    }
}