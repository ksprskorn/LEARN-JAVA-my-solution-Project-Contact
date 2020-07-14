import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int maxNumber = 0;
        int firstPosition = 0;
        for (int k = size - 1; k >= 0; k--) {
            if (array[k] >= maxNumber) {
                maxNumber = array[k];
                firstPosition = k;
            }
        }
        System.out.print(firstPosition);
    }
}