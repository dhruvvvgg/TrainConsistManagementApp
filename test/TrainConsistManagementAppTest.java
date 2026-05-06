import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSearchExistingBogieID() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        boolean result =
                TrainConsistManagementApp.linearSearch(
                        bogieIds,
                        "BG205"
                );

        assertTrue(result);
    }

    @Test
    void testSearchNonExistingBogieID() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        boolean result =
                TrainConsistManagementApp.linearSearch(
                        bogieIds,
                        "BG999"
                );

        assertFalse(result);
    }

    @Test
    void testSearchFirstElement() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        boolean result =
                TrainConsistManagementApp.linearSearch(
                        bogieIds,
                        "BG101"
                );

        assertTrue(result);
    }

    @Test
    void testSearchLastElement() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        boolean result =
                TrainConsistManagementApp.linearSearch(
                        bogieIds,
                        "BG309"
                );

        assertTrue(result);
    }

    @Test
    void testSearchEmptyArray() {

        String[] bogieIds = {};

        boolean result =
                TrainConsistManagementApp.linearSearch(
                        bogieIds,
                        "BG101"
                );

        assertFalse(result);
    }
}