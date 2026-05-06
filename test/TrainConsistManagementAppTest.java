import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSafeCargoAssignment() {

        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie(
                        "Cylindrical"
                );

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testUnsafeCargoAssignment() {

        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie(
                        "Rectangular"
                );

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testNonPetroleumCargoAllowed() {

        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie(
                        "Rectangular"
                );

        bogie.assignCargo("Coal");

        assertEquals("Coal", bogie.getCargo());
    }

    @Test
    void testApplicationContinuesAfterException() {

        TrainConsistManagementApp.GoodsBogie bogie1 =
                new TrainConsistManagementApp.GoodsBogie(
                        "Rectangular"
                );

        TrainConsistManagementApp.GoodsBogie bogie2 =
                new TrainConsistManagementApp.GoodsBogie(
                        "Cylindrical"
                );

        bogie1.assignCargo("Petroleum");

        bogie2.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie2.getCargo());
    }
}