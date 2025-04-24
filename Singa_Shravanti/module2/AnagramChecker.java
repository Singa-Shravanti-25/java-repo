import java.util.*;

public class AnagramChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String normalizedFirst = firstString.toLowerCase();
        String normalizedSecond = secondString.toLowerCase();

        char[] firstCharArray = normalizedFirst.toCharArray();
        char[] secondCharArray = normalizedSecond.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        if (Arrays.equals(firstCharArray, secondCharArray))
            System.out.println("Anagram");
        else
            System.out.println("Not an anagram");

        scanner.close();
    }
}
