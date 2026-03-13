package bai2;

public class SortApp {
    public static void main(String[] args) {
        SortedList test = new SortedList();
        test.add(1);
        test.add(5);
        test.add(3);
        test.add(9);
        test.add(4);

        test.setStrategy(new QuickSortAscendingStrategy());
        test.sort();
        test.printList();

        test.setStrategy(new InsertionSortDescendingStrategy());
        test.sort();
        test.printList();

        test.setStrategy(new SelectionSortDescendingStrategy());
        test.sort();
        test.printList();
    }
}
