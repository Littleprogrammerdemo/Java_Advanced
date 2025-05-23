package Generics.ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtilities {
    public static <T extends Comparable<T>> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.min(list);
    }
    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.max(list);
    }
}
