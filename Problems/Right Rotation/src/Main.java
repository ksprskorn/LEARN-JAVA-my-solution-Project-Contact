import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        int number = scanner.nextInt();
        if (number > stringArray.length) {
            number = number % stringArray.length;
        }

        String[] stringArray2 = new String[stringArray.length];
        for (int i = 0; i < number; i++) {
            stringArray2[0] = stringArray[stringArray.length - 1];
            for (int k = 1; k < stringArray.length; k++) {
                stringArray2[k] = stringArray[k - 1];
            }
            for (int j = 0; j < stringArray.length; j++) {
                stringArray[j] = stringArray2[j];
            }

        }
        for (int p = 0; p < stringArray.length; p++) {
            System.out.print(stringArray[p] + " ");
        }
    }
}