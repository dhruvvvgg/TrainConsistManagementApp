import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSortBogieTypesNormalCase() {

        String[] bogieTypes = {
                "Cylindrical",
                "Open",
                "Box"
        };

        TrainConsistManagementApp.sortBogieTypes(bogieTypes);

        String[] expected = {
                "Box",
                "Cylindrical",
                "Open"
        };

        assertArrayEquals(expected, bogieTypes);
    }

    @Test
    void testSortAlreadySortedArray() {

        String[] bogieTypes = {
                "Box",
                "Cylindrical",
                "Open"
        };

        TrainConsistManagementApp.sortBogieTypes(bogieTypes);

        String[] expected = {
                "Box",
                "Cylindrical",
                "Open"
        };

        assertArrayEquals(expected, bogieTypes);
    }

    @Test
    void testSortSingleElement() {

        String[] bogieTypes = {
                "Tank"
        };

        TrainConsistManagementApp.sortBogieTypes(bogieTypes);

        String[] expected = {
                "Tank"
        };

        assertArrayEquals(expected, bogieTypes);
    }

    @Test
    void testSortEmptyArray() {

        String[] bogieTypes = {};

        TrainConsistManagementApp.sortBogieTypes(bogieTypes);

        String[] expected = {};

        assertArrayEquals(expected, bogieTypes);
    }

    @Test
    void testSortMixedNames() {

        String[] bogieTypes = {
                "Flat",
                "Box",
                "Tank",
                "Open"
        };

        TrainConsistManagementApp.sortBogieTypes(bogieTypes);

        String[] expected = {
                "Box",
                "Flat",
                "Open",
                "Tank"
        };

        assertArrayEquals(expected, bogieTypes);
    }
}