import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testValidPassengerBogieCreation() {

        assertDoesNotThrow(() -> {

            TrainConsistManagementApp.PassengerBogie bogie =
                    new TrainConsistManagementApp.PassengerBogie(
                            "Passenger Coach A",
                            100
                    );

            assertEquals(100, bogie.getCapacity());
        });
    }

    @Test
    void testInvalidPassengerBogieCreation() {

        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> {
                    new TrainConsistManagementApp.PassengerBogie(
                            "Passenger Coach B",
                            -5
                    );
                }
        );

        assertEquals(
                "Capacity must be greater than zero",
                exception.getMessage()
        );
    }

    @Test
    void testZeroCapacityValidation() {

        assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> {
                    new TrainConsistManagementApp.PassengerBogie(
                            "Passenger Coach C",
                            0
                    );
                }
        );
    }

    @Test
    void testPositiveCapacityValidation() throws Exception {

        TrainConsistManagementApp.PassengerBogie bogie =
                new TrainConsistManagementApp.PassengerBogie(
                        "Passenger Coach D",
                        50
                );

        assertTrue(bogie.getCapacity() > 0);
    }
}