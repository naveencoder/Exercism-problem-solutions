import java.util.Random;
import java.util.stream.IntStream;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;
    Random random=new Random();
    public DnDCharacter(){
        this.strength=ability();
        this.dexterity=ability();
        this.constitution=ability();
        this.intelligence=ability();
        this.wisdom=ability();
        this.charisma=ability();
        this.hitpoints=ability();
        this.hitpoints=getHitpoints();
    }
    int ability() {
     return IntStream.generate(()->(1+random.nextInt(6))).limit(4).sorted().skip(1).sum();
    }

    int modifier(int input) {
     return Math.floorDiv((input-10),2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
    return constitution;
    }

    int getIntelligence() {
    return intelligence;
    }

    int getWisdom() {
    return wisdom;
    }

    int getCharisma() {
    return charisma;
    }

    int getHitpoints() {
       return  10+modifier(constitution);
    }


}
