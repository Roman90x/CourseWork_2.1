import java.util.LinkedHashMap;
import java.util.Map;

public class WordOrder {
    private final Map<String, Integer> words = new LinkedHashMap<>();
    public WordOrder(String string) {
        for (String word : string.split("\\s")) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
    }

    public void printInfo(){
        System.out.printf("В тексте %d слов%n", words.size());
        words.entrySet().stream()
                .limit(100)
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(entry.getValue() + " - " + entry.getKey()));
    }
}
