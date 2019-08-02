import java.util.stream.IntStream;

class RaindropConverter {

    private String dropSpeaks="";
    String convert(int number) {

            if(number%3==0)
            {
                dropSpeaks=dropSpeaks+"Pling";
            }
            if(number%5==0)
            {
                dropSpeaks=dropSpeaks+"Plang";
            }
            if(number%7==0)
            {
                dropSpeaks=dropSpeaks+"Plong";
            }

                if (dropSpeaks.length()==0)
                    return Integer.toString(number);

        return dropSpeaks;}
    }


