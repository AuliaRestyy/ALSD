public class SortingMain4 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting4 sorting = new Sorting4(a);

        System.out.println("Original array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting.print();

        int[] b = {30, 20, 2, 8, 14};
        Sorting4 sorting2 = new Sorting4(b);

        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();

        int[] c = {40, 10, 4, 9, 3};
        Sorting4 sorting3 = new Sorting4(c);

        System.out.println("Original array:");
        sorting3.print();
        sorting3.selectionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}
