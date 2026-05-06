import java.util.*;

public class TrainConsistManagementApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {

        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie Class
    static class PassengerBogie {

        private String bogieName;
        private int capacity;

        public PassengerBogie(String bogieName, int capacity)
                throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Capacity must be greater than zero"
                );
            }

            this.bogieName = bogieName;
            this.capacity = capacity;
        }

        public String getBogieName() {
            return bogieName;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return bogieName + " Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> train = new ArrayList<>();

        try {

            PassengerBogie bogie1 =
                    new PassengerBogie("Passenger Coach A", 80);

            PassengerBogie bogie2 =
                    new PassengerBogie("Passenger Coach B", -10);

            train.add(bogie1);
            train.add(bogie2);

        } catch (InvalidCapacityException e) {

            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Valid Bogies in Train:");

        for (PassengerBogie bogie : train) {
            System.out.println(bogie);
        }
    }
}