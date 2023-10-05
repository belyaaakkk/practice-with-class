public class Car {
    private Body body;
    private Engine engine;
    private Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
