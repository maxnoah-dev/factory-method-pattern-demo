package bai2;

import java.util.List;

public class SelectionSortDescendingStrategy implements SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

    @Override
    public String getName() {
        return "SelectionSort Descending";
    }
}
