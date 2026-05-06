import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testBinarySearchExistingID() {

        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG205"
        };

        Arrays.sort(bogieIds);

        boolean result =
                TrainConsistManagementApp.binarySearch(
                        bogieIds,
                        "BG205"
                );

        assertTrue(result);
    }

    @Test
    void testBinarySearchNonExistingID() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        Arrays.sort(bogieIds);

        boolean result =
                TrainConsistManagementApp.binarySearch(
                        bogieIds,
                        "BG999"
                );

        assertFalse(result);
    }

    @Test
    void testBinarySearchFirstElement() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        Arrays.sort(bogieIds);

        boolean result =
                TrainConsistManagementApp.binarySearch(
                        bogieIds,
                        "BG101"
                );

        assertTrue(result);
    }

    @Test
    void testBinarySearchLastElement() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        Arrays.sort(bogieIds);

        boolean result =
                TrainConsistManagementApp.binarySearch(
                        bogieIds,
                        "BG309"
                );

        assertTrue(result);
    }

    @Test
    void testBinarySearchEmptyArray() {

        String[] bogieIds = {};

        boolean result =
                TrainConsistManagementApp.binarySearch(
                        bogieIds,
                        "BG101"
                );

        assertFalse(result);
    }
}