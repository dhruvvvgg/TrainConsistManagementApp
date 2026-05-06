import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Search Method
    public static boolean searchBogie(
            List<String> bogieIds,
            String searchKey
    ) {

        // Defensive validation
        if (bogieIds.isEmpty()) {

            throw new IllegalStateException(
                    "Cannot perform search. Train has no bogies."
            );
        }

        for (String id : bogieIds) {

            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        List<String> bogieIds = new ArrayList<>();

        // Sample data
        bogieIds.add("BG101");
        bogieIds.add("BG205");
        bogieIds.add("BG309");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to Search: ");
        String searchKey = sc.nextLine();

        try {

            boolean found =
                    searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID Found");
            }

            else {
                System.out.println("Bogie ID Not Found");
            }

        } catch (IllegalStateException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}