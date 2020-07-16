import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        // write your code here
        Pattern pattern = Pattern.compile("\\b" + part + "|\\B" + part + "[\\W.,!?]" + "|" + part + "$",Pattern.CASE_INSENSITIVE);
        //Pattern pattern = Pattern.compile("\\b" + part + "|" + part + "\\b",Pattern.CASE_INSENSITIVE);
        //Pattern pattern = Pattern.compile("((\\s|\\W|^)" + part + ")|(" + part + "(\\W|\\s|$))|(\\W" + part + "\\W)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");

    }
}