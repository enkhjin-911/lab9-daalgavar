import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringProcessor {

    public static void processStrings(
            List<String> words,
            Predicate<String> predicate,
            Function<String, String> function,
            Consumer<String> consumer) {

        List<String> filtered = new ArrayList<>();
        for (String word : words) {
            if (predicate.test(word)) {
                filtered.add(word);
            }
        }

        List<String> transformed = new ArrayList<>();
        for (String word : filtered) {
            transformed.add(function.apply(word));
        }

        for (String word : transformed) {
            consumer.accept(word);
        }
    }
}
