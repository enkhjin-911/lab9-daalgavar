import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Programchlal");

        Predicate<String> longerThanFive = word -> word.length() > 5;

        Function<String, String> reverse = word -> {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            return reversed;
        };

        Consumer<String> printUppercase = word -> System.out.println("RESULT: " + word.toUpperCase());

        StringProcessor.processStrings(words, longerThanFive, reverse, printUppercase);

    }
}
