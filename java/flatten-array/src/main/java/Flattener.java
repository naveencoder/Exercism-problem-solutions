import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Flattener {

    public List<Object> flatten(List<Object> nestedList) {


        List<Object> flatList = new ArrayList<>();

        // flatList = flatList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        List<Object> resultList = new ArrayList<>();


        nestedList.forEach((Object n) -> {
            if (n instanceof List) {
                resultList.addAll(flatten((List) n));
            } else {
                resultList.add(n);
            }
        });

        return resultList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
