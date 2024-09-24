package PCBuild;

public class BuildMyPC {
    public static void main(String[] args) {

String name = "Whitney";
Case theC = new Case("Cooler Master", "MasterBox", new Dimension(20, 5, 15));
Monitor m = new Monitor("Acer", "22cv1q", new Dimension(20, 5, 15));
Motherboard mb = new Motherboard("MSI", "DP10", new Dimension(2, 8, 8));

// public PC(String name, Case theC, Monitor m, Motherboard mb)
PC blue = new PC(name, theC, m, mb);

        System.out.println(blue);
    }
            }