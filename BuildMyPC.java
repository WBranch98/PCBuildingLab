package PCBuild;

public class BuildMyPC {
    public static void main(String[] args) {

        String name = "Gavin";
        Case theC = new Case();
        Dimension mDimension = new Dimension(20,5,15);
        Monitor m = new Monitor("Acer","22cv1q",mDimension);

        Dimension mbDimension = new Dimension(2,8,8);
        Motherboard mb = new Motherboard("MSI","DP10",mbDimension);
        // public PC(String name, Case theC, Monitor m, Motherboard mb)
        PC gavin = new PC(name, theC, m, mb);

        System.out.println(gavin);

        String name2 = "Whitney";
        Case case2 = new Case("Cooler Master", "MasterBox", new Dimension(20, 5, 15));
        Monitor monitor2 = new Monitor("Acer", "22cv1q", new Dimension(20, 5, 15));
        Motherboard motherboard2 = new Motherboard("MSI", "DP10", new Dimension(2, 8, 8));

        PC whitney = new PC(name2, case2, monitor2, motherboard2);
        System.out.println(whitney);

    }

}
        case1.setDimensions(new Dimension(30, 7, 20));
        monitor1.setDimensions(new Dimension(45, 18, 9));
        motherboard1.setDimensions(new Dimension(4, 10, 10));

        System.out.println(whitney);
    }
