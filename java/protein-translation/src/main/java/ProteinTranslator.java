import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> codons;
        List<String> result = new ArrayList<String>();
        int limit = (rnaSequence.length() + 1) / 3;
        codons = Arrays.asList(rnaSequence.split("(?<=\\G...)"));
        for (int i = 0; i < limit; i++) {
            if (codons.get(i) == "AUG") {
                result.add("Methionine");
            }
            if (codons.get(i) == "UUC" || codons.get(i) == "UUU") {
                result.add("Phenylalanine");
            }
            if (codons.get(i) == "UUA" || codons.get(i) == "UUG") {
                result.add("Leucine");
            }
            if ((codons.get(i) == "UCU" || codons.get(i) == "UCC") || (codons.get(i) == "UCG" || codons.get(i) == "UCA")) {
                result.add("Serine");
            }
            if (codons.get(i) == "UAU" || codons.get(i) == "UAC") {
                result.add("Tyrosine");
            }
            if (codons.get(i) == "UGU" || codons.get(i) == "UGC") {
                result.add("Cysteine");
            }
            if (codons.get(i) == "UGG") {
                result.add("Tryptophan");
            }
            if ((codons.get(i) == "UAA" || codons.get(i) == "UAG") || (codons.get(i) == "UGA")) {
                return result;
            }

            return result;
        }
        return result;
    }
}