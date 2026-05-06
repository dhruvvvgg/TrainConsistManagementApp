import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSearchExistingBogie() {

        List<String> bogieIds = new ArrayList<>();

        bogieIds.add("BG101");
        bogieIds.add("BG205");

        boolean result =
                TrainConsistManagementApp.searchBogie(
                        bogieIds,
                        "BG205"
                );

        assertTrue(result);
    }

    @Test
    void testSearchNonExistingBogie() {

        List<String> bogieIds = new ArrayList<>();

        bogieIds.add("BG101");
        bogieIds.add("BG205");

        boolean result =
                TrainConsistManagementApp.searchBogie(
                        bogieIds,
                        "BG999"
                );

        assertFalse(result);
    }

    @Test
    void testSearchEmptyTrain() {

        List<String> bogieIds = new ArrayList<>();

        Exception exception = assertThrows(
                IllegalStateException.class,
                () -> {
                    TrainConsistManagementApp.searchBogie(
                            bogieIds,
                            "BG101"
                    );
                }
        );

        assertEquals(
                "Cannot perform search. Train has no bogies.",
                exception.getMessage()
        );
    }

    @Test
    void testSearchSingleElement() {

        List<String> bogieIds = new ArrayList<>();

        bogieIds.add("BG500");

        boolean result =
                TrainConsistManagementApp.searchBogie(
                        bogieIds,
                        "BG500"
                );

        assertTrue(result);
    }

    @Test
    void testSearchWithMultipleBogies() {

        List<String> bogieIds = new ArrayList<>();

        bogieIds.add("BG101");
        bogieIds.add("BG205");
        bogieIds.add("BG309");
        bogieIds.add("BG450");

        boolean result =
                TrainConsistManagementApp.searchBogie(
                        bogieIds,
                        "BG450"
                );

        assertTrue(result);
    }
}