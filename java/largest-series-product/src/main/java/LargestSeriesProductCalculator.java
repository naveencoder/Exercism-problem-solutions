import java.math.BigInteger;
import java.util.regex.Pattern;

class LargestSeriesProductCalculator {
    private String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) throws IllegalArgumentException {
        this.inputNumber = inputNumber;

    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long max = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            char c = inputNumber.charAt(i);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z'))
                throw new IllegalArgumentException("String to search may only contains digits.");
        }

        if (numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if (inputNumber.length() < numberOfDigits ){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        for (int i = 0; i + numberOfDigits <= inputNumber.length(); i++) {
            String sub = inputNumber.substring(i, (i + numberOfDigits));
            long product=1;
            for (int j = 0; j < sub.length(); j++) {
            if(sub.charAt(j)==0) break;
                product = product *(Character.getNumericValue(sub.charAt(j)));
            }
            if(product>max){
                max=product;
            }

        }
    return max;
    }
}
