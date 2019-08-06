import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {
private String garden;
private String[] students = {"","Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
    KindergartenGarden(String garden) {
   this.garden = garden;

    }

    List<Plant> getPlantsOfStudent(String student) {
    List<Plant> result=new ArrayList<>();
    String[] temp = garden.split("\n");
    int position = pos(student);
    int start,end;
    if(position==1){
        start = 0;
        end = 1;
    }
        else{
            start = position*2-2;
end = position * 2 - 1;
        }
    for(int index=0 ; index < 2 ;index++) {
        for (int r = start; r < end; r++) {
            String row = temp[index];
            for (int i = r; i < position * 2; i++) {
                switch (row.charAt(i)) {
                    case 'R':
                        result.add(Plant.RADISHES);
                        break;
                    case 'C':
                        result.add(Plant.CLOVER);
                        break;
                    case 'G':
                        result.add(Plant.GRASS);
                        break;
                    case 'V':
                        result.add(Plant.VIOLETS);
                        break;
                }

            }
        }
    }
        return result;

    }
int pos(String chk){
    for (int i = 0; i < students.length; i++)
        if (students[i] == chk) {
        return i;
        }
        return 0;
}
}
