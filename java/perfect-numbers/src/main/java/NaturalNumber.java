class NaturalNumber {
    private int aliquot=0;
    private int input;
    public NaturalNumber(int input){
        this.input=input;
        if(input<=0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    for(int i=1 ; i<=input/2;i++)
    {
        if(input%i ==0){
            aliquot=aliquot+i;
    }
    }
    }
    Classification getClassification(){
        if (aliquot == input){
            return Classification.PERFECT;
        }
        else if (aliquot > input) {
            return Classification.ABUNDANT;
        }
        else{
            return Classification.DEFICIENT;
        }
        }

}