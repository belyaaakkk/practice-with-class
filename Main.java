public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("A95", "cooling", 12,"W12");
        Body body = new Body("Sedan", "Silver");
        Transmission transmission = new Transmission("4wd", "automatic");

        Car car = new Car(body, engine, transmission);

    }
}
