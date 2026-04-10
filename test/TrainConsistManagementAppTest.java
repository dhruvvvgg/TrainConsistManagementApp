import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testValidTrainID() {
        assertTrue(TrainConsistManagementApp.isValidTrainID("TRN-1234"));
    }

    @Test
    void testInvalidTrainID() {
        assertFalse(TrainConsistManagementApp.isValidTrainID("TRN1234"));
        assertFalse(TrainConsistManagementApp.isValidTrainID("TRN-12"));
        assertFalse(TrainConsistManagementApp.isValidTrainID("ABC-1234"));
    }

    @Test
    void testValidCargoCode() {
        assertTrue(TrainConsistManagementApp.isValidCargoCode("PET-AB"));
    }

    @Test
    void testInvalidCargoCode() {
        assertFalse(TrainConsistManagementApp.isValidCargoCode("PET-ab"));
        assertFalse(TrainConsistManagementApp.isValidCargoCode("PET123"));
        assertFalse(TrainConsistManagementApp.isValidCargoCode("AB-PET"));
    }

    @Test
    void testEmptyInput() {
        assertFalse(TrainConsistManagementApp.isValidTrainID(""));
        assertFalse(TrainConsistManagementApp.isValidCargoCode(""));
    }
}