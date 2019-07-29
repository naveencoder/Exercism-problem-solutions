import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    private static final Pattern WORD = Pattern.compile("\\w[\\w']*\\w|\\w");

    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> output = new HashMap<>();
        Matcher matcher = WORD.matcher(input.toLowerCase());
        while (matcher.find()) {
            output.merge(matcher.group(), 1, Integer::sum);
        }
        return output;
    }
}