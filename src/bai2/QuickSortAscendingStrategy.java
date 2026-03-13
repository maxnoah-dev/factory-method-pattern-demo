package bai2;

import java.util.Collections;
import java.util.List;

public class QuickSortAscendingStrategy implements SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        Collections.sort(list);
    }

    @Override
    public String getName() {
        return "QuickSort Ascending";
    }
}
