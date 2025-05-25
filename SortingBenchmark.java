public class SortingBenchmark {
    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(1_000);
        int[] largeArray = generateRandomArray(100_000);

        System.out.println("Small array (1,000 elements):");
        benchmarkSort(smallArray.clone(), "QuickSort", QuickSort::sort);
        benchmarkSort(smallArray.clone(), "MergeSort", MergeSort::sort);

        System.out.println("\nLarge array (100,000 elements):");
        benchmarkSort(largeArray.clone(), "QuickSort", QuickSort::sort);
        benchmarkSort(largeArray.clone(), "MergeSort", MergeSort::sort);
    }

    private static void benchmarkSort(int[] array, String name, Consumer<int[]> sorter) {
        long start = System.nanoTime();
        sorter.accept(array);
        long end = System.nanoTime();
        System.out.printf("%s: %.2f ms%n", name, (end - start) / 1_000_000.0);
    }
}
