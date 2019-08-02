class ReverseString {

    String reverse(String inputString) {
    String reverseString="";
        for(int iterator=inputString.length()-1;iterator >= 0 ;iterator--)
    {
        reverseString=reverseString + inputString.charAt(iterator);
    }
    return reverseString;
    }
  
}