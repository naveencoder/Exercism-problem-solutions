import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private static String alphabets = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String line = "";
    private int iterator;

    List<String> printToList(char a) {
                    List<String> result = new ArrayList<>();
         iterator = alphabets.indexOf(a);
        if (iterator == 1) {
            result.add("A");
            return result;
        }
        if (iterator % 2 == 0) {
            iterator += 1;
        }
        line =lineGenerate(iterator);
        line.indexOf()iterator/2] = alphabets.charAt(1);   //first Line

        for (int i = 2; i <= iterator; i++){
               line=lineGenerate(iterator);
               line(iterator/2-(i-1))=alphabets.charAt(i);
               line(iterator/2+(i-1))=alphabets.charAt(i);
        }
        result.add(line);
        return result;
    }


    private String lineGenerate(int iterator){
        for (int i = 1; i <= iterator; i++) {
            line = line + " ";
        }
        return line;
    }

}