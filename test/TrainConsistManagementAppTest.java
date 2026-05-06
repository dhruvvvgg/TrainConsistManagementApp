import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testLoopFiltering() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistManagementApp.GoodsBogie("Open", "Coal"),
                new TrainConsistManagementApp.GoodsBogie("Box", "Grain")
        );

        List<TrainConsistManagementApp.GoodsBogie> result =
                TrainConsistManagementApp.filterUsingLoop(bogies);

        assertEquals(1, result.size());
        assertEquals("Petroleum", result.get(0).getCargo());
    }

    @Test
    void testStreamFiltering() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistManagementApp.GoodsBogie("Open", "Coal"),
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum")
        );

        List<TrainConsistManagementApp.GoodsBogie> result =
                TrainConsistManagementApp.filterUsingStream(bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testEmptyCollection() {

        List<TrainConsistManagementApp.GoodsBogie> bogies =
                new ArrayList<>();

        List<TrainConsistManagementApp.GoodsBogie> result =
                TrainConsistManagementApp.filterUsingLoop(bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testExecutionTimeMeasurement() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = Arrays.asList(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum")
        );

        long start = System.nanoTime();

        TrainConsistManagementApp.filterUsingStream(bogies);

        long end = System.nanoTime();

        long executionTime = end - start;

        assertTrue(executionTime > 0);
    }
}