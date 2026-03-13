package bai2;

import java.util.List;

public interface SortStrategy {
    void sort(List<Integer> list);

    String getName();
}
