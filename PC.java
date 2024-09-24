package PCBuild;

public class PC {
    private String name;

    private Case theCase;

    private Monitor monitor;

    private Motherboard motherboard;


    public PC(String name, Case theC, Monitor m, Motherboard mb) {
        this.name = name;
        this.theCase = theC;
        this.monitor = m;
        this.motherboard = mb;

    }

    public String name() {
        return name;
    }

    public Case getTheCase() {

        return theCase;
    }

    public Monitor getM() {
        return monitor;
    }

    public Motherboard getMB() {
        return motherboard;
    }
        public String toString(){
            String output = "Specification: \nCase: " + theCase + "\nMonitor: "  + monitor + "\nMotherboard: " + motherboard + "\n";
            return name + "s" + "PC\n" + output;
        }
    }


