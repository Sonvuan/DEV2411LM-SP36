package com.devmaster.lesson02.tight_loosely_coupling;

import java.util.Arrays;

// Lớp BubbleSortAlgorithm sửa lỗi thuật toán
class BubbleSortAlgorithm {
    public void sort(int[] arr) {
        System.out.println("Sắp xếp theo giải thuật Bubble Sort");
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // So sánh các phần tử liền kề
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // Nếu không có swap nào, dừng vòng lặp
                break;
            }
        }
    }
}

public class TightCouplingService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    // Constructor khởi tạo đối tượng BubbleSortAlgorithm
    public TightCouplingService() {
        this.bubbleSortAlgorithm = new BubbleSortAlgorithm();
    }

    public TightCouplingService(BubbleSortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public void complexBusinessSort(int[] arr) {
        bubbleSortAlgorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        TightCouplingService tCouplingService = new TightCouplingService();
        tCouplingService.complexBusinessSort(new int[]{1, 11, 4, 55, 0});
    }
}
