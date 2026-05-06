import java.util.*;

public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Display Array
    public static void displayArray(int[] capacities) {

        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] capacities = {80, 40, 100, 60, 20};

        System.out.println("Original Capacities:");
        displayArray(capacities);

        bubbleSort(capacities);

        System.out.println("Sorted Capacities:");
        displayArray(capacities);
    }
}