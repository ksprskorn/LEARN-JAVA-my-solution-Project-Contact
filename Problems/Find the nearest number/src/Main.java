import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }

        int lastNumber = numbers.get(numbers.size() - 1);

        numbers.remove(numbers.size() - 1);

        int minNumber = Math.abs(lastNumber - numbers.get(0));

        for (int i : numbers) {
            if (Math.abs(lastNumber - i) < minNumber) {
                minNumber = Math.abs(lastNumber - i);
            }
        }
        Collections.sort(numbers);
        for (int k : numbers) {
            if (Math.abs(lastNumber - k) == minNumber) {
                System.out.print(k + " ");
            }
        }
    }
}