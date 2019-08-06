class LuhnValidator {
    private Integer sum=0;
    boolean isValid(String candidate) {
        if(candidate.length()<=1){
         return false;
        }
        for(int i=1;i<candidate.length();i+=2){
            int temp = candidate.charAt(i)*2;
            if(temp>9){
                temp=temp-9;
            }
            sum=sum+temp;
        }
        if(sum%10==0)
        {
            return false;
        }
        return false;}

}
