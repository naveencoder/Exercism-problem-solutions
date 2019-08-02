import java.util.Collections;
import java.util.List;

class BinarySearch {
    private List<Integer> unsortedList;
//    private List<Integer> sortedList;
    public BinarySearch(List<Integer> unsortedList){
       this.unsortedList=unsortedList;
       }
    public int indexOf(int value) throws ValueNotFoundException {
        if(!(unsortedList.contains(value)))
    {    String str = "Value not in array";
        throw  new ValueNotFoundException(str);
    }
        return searchingForIndex(value,0,unsortedList.size()-1);
    }
    int searchingForIndex(int value, int start, int end)
     {
         int mid = (start+end)/2;
         int check = this.unsortedList.get(mid);
         if (check == value){
             return mid;
         }
         else if(value < check) {
          return searchingForIndex(value,start,end=mid-1);
         }
         else if (value > check){
             return searchingForIndex(value,start=mid+1,end);
         }
         return -1;
         }


}