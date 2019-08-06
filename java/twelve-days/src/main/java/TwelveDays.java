class TwelveDays {
    String verse(int verseNumber) {
        String result = "";
        switch (verseNumber){
            case 1:
                result= new String("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n");
                break;
            case 2:
                result= new String("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 3:
                result= new String("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 4:
                result= new String("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 5:
                result= new String("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 6:
                result= new String("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 7:
                result= new String("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 8:
                result= new String("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 9:
                result= new String("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 10:
                result= new String("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 11:
                result= new String("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
            case 12:
                result= new String("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                break;
        }
    return result;
    }

    String verses(int startVerse, int endVerse) {
       String versesResult = "";
        for (int i=startVerse;i<=endVerse;i++){
            versesResult=versesResult+verse(i)+"\n";
        }
        return versesResult.substring(0,versesResult.length()-1);
    }
    
    String sing() {
     String singResult = "";
        singResult=verses(1,12);
        return singResult;
    }
}
