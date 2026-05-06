import java.util.Scanner;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String searchKey) {

        for (String id : bogieIds) {

            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG450",
                "BG512"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to Search: ");
        String searchKey = sc.nextLine();

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID Found");
        } else {
            System.out.println("Bogie ID Not Found");
        }

        sc.close();
    }
}