import java.util.Collections;
import java.util.List;

public class RelationshipComputer<T> {
    public Relationship computeRelationship(List<T> firstList, List<T> secondList) {

        if ((firstList.isEmpty() && secondList.isEmpty()) || (firstList == secondList)) {
            return Relationship.EQUAL;
        }
        else if((firstList.isEmpty() && !(secondList.isEmpty()))) {
            return Relationship.SUBLIST;
        }
        else if(secondList.isEmpty() && !(firstList.isEmpty())) {
             return Relationship.SUPERLIST;
        }
        else if(secondList.containsAll(firstList)){
             if(Collections.indexOfSubList(secondList, firstList) >= 0) {
                return Relationship.SUBLIST;
            } }
        else if(firstList.containsAll(secondList)) {
                if(Collections.indexOfSubList(firstList, secondList) >= 0) {
                    return Relationship.SUPERLIST; }
        }
        return Relationship.UNEQUAL;
   }

}
