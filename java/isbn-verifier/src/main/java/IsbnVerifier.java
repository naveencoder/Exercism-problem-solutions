import java.util.regex.Pattern;

import static java.lang.Integer.valueOf;

class IsbnVerifier {
    private String check="";
    private static Pattern p = Pattern.compile("^[a-zA-Z]*$");
    boolean isValid(String stringToVerify) {
        Integer sum=0;
        check = stringToVerify.replaceAll("-","");
        if(stringToVerify.contains("X") || stringToVerify.contains("x")){
            sum+=10;
            check=check.replaceAll("X","");
            check=check.replaceAll("x","");
        }

        if(p.matcher(check).find())
        check=check.replaceAll("[A-Z]","");

        for (int i = 0,j=10; i < check.length() ; i++,j--) {
            if(check.charAt(i) != ' '){
                sum += (valueOf(check.charAt(i)) * (j));
            }
        }
        if (sum % 11 == 0){
            return true;
            }
        else
            return false;

    }

}
