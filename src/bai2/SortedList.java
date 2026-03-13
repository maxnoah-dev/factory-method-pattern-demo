package bai2;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private final List<Integer> list = new ArrayList<>();
    private SortStrategy strategy;

    public void add(int number) {
        list.add(number);
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        if (strategy == null) {
            throw new IllegalStateException("Sort strategy is not set.");
        }
        strategy.sort(list);
        System.out.println("Applied: " + strategy.getName());
    }

    public void printList() {
        System.out.println(list);
    }
}
