import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String searchKey) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                return true;
            }

            else if (comparison < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
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

        // Ensure sorted order
        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to Search: ");
        String searchKey = sc.nextLine();

        boolean found =
                binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID Found");
        }

        else {
            System.out.println("Bogie ID Not Found");
        }

        sc.close();
    }
}