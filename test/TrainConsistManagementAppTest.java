import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testBubbleSortNormalCase() {

        int[] capacities = {80, 40, 100, 60, 20};

        TrainConsistManagementApp.bubbleSort(capacities);

        int[] expected = {20, 40, 60, 80, 100};

        assertArrayEquals(expected, capacities);
    }

    @Test
    void testBubbleSortAlreadySorted() {

        int[] capacities = {10, 20, 30, 40};

        TrainConsistManagementApp.bubbleSort(capacities);

        int[] expected = {10, 20, 30, 40};

        assertArrayEquals(expected, capacities);
    }

    @Test
    void testBubbleSortReverseOrder() {

        int[] capacities = {50, 40, 30, 20, 10};

        TrainConsistManagementApp.bubbleSort(capacities);

        int[] expected = {10, 20, 30, 40, 50};

        assertArrayEquals(expected, capacities);
    }

    @Test
    void testBubbleSortSingleElement() {

        int[] capacities = {25};

        TrainConsistManagementApp.bubbleSort(capacities);

        int[] expected = {25};

        assertArrayEquals(expected, capacities);
    }

    @Test
    void testBubbleSortEmptyArray() {

        int[] capacities = {};

        TrainConsistManagementApp.bubbleSort(capacities);

        int[] expected = {};

        assertArrayEquals(expected, capacities);
    }
}