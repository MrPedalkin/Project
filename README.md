Проект: Анализ производительности структур данных и алгоритмов
Обзор проекта
Этот проект демонстрирует реализацию ключевых структур данных и алгоритмов на Java, включая сравнительный анализ их производительности. Проект включает:

Реализации основных структур данных

Алгоритмы сортировки и поиска

Тесты производительности

Визуализацию результатов

Структура проекта
src/
├── main/
│   ├── java/
│   │   ├── datastructures/
│   │   │   ├── custom/
│   │   │   │   ├── CustomArrayList.java
│   │   │   │   ├── CustomLinkedList.java
│   │   │   │   ├── CustomHashSet.java
│   │   │   │   ├── CustomBinaryTree.java
│   │   │   │   └── CustomHashMap.java
│   │   │   ├── algorithms/
│   │   │   │   ├── sorting/
│   │   │   │   │   ├── QuickSort.java
│   │   │   │   │   ├── MergeSort.java
│   │   │   │   │   └── HeapSort.java
│   │   │   │   └── search/
│   │   │   │       ├── BinarySearch.java
│   │   │   │       └── LinearSearch.java
│   │   │   └── benchmark/
│   │   │       ├── DataStructureBenchmark.java
│   │   │       └── SortingBenchmark.java
│   │   └── Main.java
│   └── resources/
└── test/
    └── java/
        └── datastructures/
            ├── custom/
            └── algorithms/
