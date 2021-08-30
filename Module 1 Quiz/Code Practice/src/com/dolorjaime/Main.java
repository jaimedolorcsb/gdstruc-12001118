package com.dolorjaime;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {35, 69, 1, 10, -50, 320, 63, 58, 26, 13};
        print("Before bubble sort: ");
        printArrElem(numbers);
        print("\n");

        print("After bubble sort (ASC): ");
        bubbleSort(numbers);
        printArrElem(numbers);
        print("\n");

        print("After bubble sort (DESC): ");
        bubbleSortRev(numbers);
        printArrElem(numbers);
        print("\n\n");

        int[] numbers2 = {68, 419, -32, 38, 54, 82, -4};
        print("Before selection sort: ");
        printArrElem(numbers2);
        print("\n");

        print("After selection sort (ASC): ");
        selectSort(numbers2);
        printArrElem(numbers2);
        print("\n");

        print("After selection sort (DESC): ");
        selectSortRev(numbers2);
        printArrElem(numbers2);
        print("\n");

        print("After selection sort V2 (DESC): ");
        selectSortRev(numbers2);
        printArrElem(numbers2);
    }

    private static void printArrElem(int[] arr) {
        for (int x : arr) {
            print(x);
            print (", ");
        }
    }

    private static void print(String str) {
        System.out.print(str);
    }

    private static void print(int x) {
        System.out.print(x);
    }

    private static void print(float x){
        System.out.print(x);
    }

    private static void bubbleSort(int[] arr) {

        //we know that in the first iteration of the i loop, the largest int will be at the last index
        //We work our way down from the last index until we reach the first index
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            //at first pass, find the largest int and push to last index
            //at consequent passes, you will only have to iterate until the last unsorted element,
            // since we know that the later elements are already sorted
            for (int i = 0; i < lastSortedIndex; i++) {
                // if a > b, swap the values
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortRev(int[] arr) {

        for (int lastSortedIndex = 0; lastSortedIndex < arr.length - 1; lastSortedIndex++) {

            for (int i = arr.length - 1; i > lastSortedIndex; i--) {
                if (arr[i] > arr[i - 1]){
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }

        }
    }

    private static void selectSort(int[] arr) {
        //after first pass of i loop, largest int will be at the last index
        //we mark the last sorted index to save resources and avoid sorting through already sorted elements
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0 ; lastSortedIndex--) {

            int largest = 0;

            //we start at i = 1 because we already start the comparison with arr[largest] (which is arr[0])
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            
            //swap the largest with the last unsorted index
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largest];
            arr[largest] = temp;
        }
    }

    private static void selectSortRev(int[] arr) {

        for (int lastSorted = arr.length - 1; lastSorted > 0 ; lastSorted--) {

            int smallest = 0;

            for (int i = 1; i <= lastSorted ; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }

            //swap
            int temp = arr[lastSorted];
            arr[lastSorted] = arr[smallest];
            arr[smallest] = temp;
        }

    }

    private static void selectSortRev2(int[] arr){

        for (int lastSorted = 0; lastSorted < arr.length - 1; lastSorted++) {

            int largest = arr[arr.length - 1];
            for (int i = 1; i <= arr.length; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }

            //swap
            int temp = arr[lastSorted];
            arr[lastSorted] = arr[largest];
            arr[largest] = temp;

        }

    }
}
