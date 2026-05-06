import java.util.Arrays;

public class TrainConsistManagementApp {

    // Sorting Method
    public static void sortBogieTypes(String[] bogieTypes) {

        Arrays.sort(bogieTypes);
    }

    public static void main(String[] args) {

        String[] bogieTypes = {
                "Cylindrical",
                "Open",
                "Box",
                "Flat",
                "Tank"
        };

        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        sortBogieTypes(bogieTypes);

        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}