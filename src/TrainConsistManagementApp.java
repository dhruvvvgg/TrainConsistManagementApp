import java.util.*;

public class TrainConsistManagementApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {

        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {

        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {

            try {

                // Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Petroleum cannot be assigned to Rectangular bogie"
                    );
                }

                this.cargo = cargo;

                System.out.println("Cargo assigned successfully");

            } catch (CargoSafetyException e) {

                System.out.println("Exception Caught: " + e.getMessage());

            } finally {

                System.out.println("Cargo assignment process completed");
            }
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {

        GoodsBogie bogie1 =
                new GoodsBogie("Rectangular");

        GoodsBogie bogie2 =
                new GoodsBogie("Cylindrical");

        // Unsafe assignment
        bogie1.assignCargo("Petroleum");

        System.out.println();

        // Safe assignment
        bogie2.assignCargo("Petroleum");

        System.out.println();

        System.out.println("Application continues safely");
    }
}