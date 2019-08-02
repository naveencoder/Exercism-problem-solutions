import java.util.HashMap;

class ResistorColor{
    int colorCode(String color) {
        String[] expectedcolors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < expectedcolors.length ; i++) {
            if(color==expectedcolors[i])
                return i;

        }
    return 0;}

    String[] colors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return expected;
    }
}
