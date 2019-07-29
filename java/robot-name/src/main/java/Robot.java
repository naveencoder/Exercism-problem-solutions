import java.util.Random;

public class Robot {
    private String[] Alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String name;

    public Robot() {
        nameGeneration();
    }

    public void reset(){
        nameGeneration();
    }

    public void nameGeneration(){
        String name = "";
        Random rdm=new Random();
        for (int i = 0; i < 2; i++) {
            name = name + Alphabets[rdm.nextInt(26)];
        }
        for (int i = 0; i < 3; i++) {
            name = name + String.valueOf(rdm.nextInt(10));
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}