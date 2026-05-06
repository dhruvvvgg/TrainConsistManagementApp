import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Inner class
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return type + " - " + cargo;
        }
    }

    // Loop-based filtering
    public static List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {
        List<GoodsBogie> filtered = new ArrayList<>();

        for (GoodsBogie bogie : bogies) {
            if (bogie.getCargo().equalsIgnoreCase("Petroleum")) {
                filtered.add(bogie);
            }
        }

        return filtered;
    }

    // Stream-based filtering
    public static List<GoodsBogie> filterUsingStream(List<GoodsBogie> bogies) {
        return bogies.stream()
                .filter(bogie -> bogie.getCargo().equalsIgnoreCase("Petroleum"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Loop benchmarking
        long loopStart = System.nanoTime();

        List<GoodsBogie> loopResult = filterUsingLoop(bogies);

        long loopEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;

        // Stream benchmarking
        long streamStart = System.nanoTime();

        List<GoodsBogie> streamResult = filterUsingStream(bogies);

        long streamEnd = System.nanoTime();

        long streamTime = streamEnd - streamStart;

        System.out.println("Loop Filter Result:");
        System.out.println(loopResult);

        System.out.println("Loop Execution Time: " + loopTime + " ns");

        System.out.println();

        System.out.println("Stream Filter Result:");
        System.out.println(streamResult);

        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}