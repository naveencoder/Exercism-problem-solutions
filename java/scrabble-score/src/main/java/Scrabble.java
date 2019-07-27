import java.util.*;

class Scrabble {
    Map<String, Integer> pointMap = new HashMap<>();

    private List<String> pointOne = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T", "y");
    private List<String> pointTwo = Arrays.asList("D", "G");
    private List<String> pointThree = Arrays.asList("B", "C", "M", "P");
    private List<String> pointFour = Arrays.asList("F", "H", "V", "W", "Y");
    private List<String> pointFive = Collections.singletonList("K");
    private List<String> pointEight = Arrays.asList("J", "X");
    private List<String> pointTen = Arrays.asList("Q", "Z");
    private String word;

    Scrabble(String word) {
        this.word = word;

        pointOne.forEach(c -> pointMap.put(String.valueOf(c), 1));
        pointTwo.forEach(c -> pointMap.put(String.valueOf(c), 2));
        pointThree.forEach(c -> pointMap.put(String.valueOf(c), 3));
        pointFour.forEach(c -> pointMap.put(String.valueOf(c), 4));
        pointFive.forEach(c -> pointMap.put(String.valueOf(c), 5));
        pointEight.forEach(c -> pointMap.put(String.valueOf(c), 8));
        pointTen.forEach(c -> pointMap.put(String.valueOf(c), 10));
    }

    int getScore() {
        Integer score = 0;

        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            score += pointMap.get(String.valueOf(word.charAt(i)));
        }
        return score;
    }
}
