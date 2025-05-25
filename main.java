public class Main {
    public static void main(String[] args) {
        // Демонстрация структур данных
        demonstrateArrayList();
        demonstrateHashSet();
        
        // Демонстрация алгоритмов
        demonstrateSortingAlgorithms();
        demonstrateSearchAlgorithms();
        
        // Запуск бенчмарков
        DataStructureBenchmark.run();
        SortingBenchmark.run();
    }

    private static void demonstrateArrayList() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println("ArrayList: " + list.get(0));
    }

    private static void demonstrateSortingAlgorithms() {
        int[] array = {5, 3, 8, 1, 2};
        QuickSort.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
