public class Engine {
    private String fuel;
    private String coolingMethod;
    private int cylindersAmount;
    private String cylindersArrangement;

    public Engine(String fuel, String coolingMethod, int cylindersAmount, String cylindersArrangement) {
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement;
    }

    public String getFuel() {
        return fuel;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }

    public String getCylindersArrangement() {
        return cylindersArrangement;
    }

}
