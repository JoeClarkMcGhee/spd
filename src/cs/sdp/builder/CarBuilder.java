package cs.sdp.builder;

public class CarBuilder implements AbstractCarBuilder {
    int doors;
    String roof;
    String engine;

    @Override
    public void setDoors(int doorNumber) {
        this.doors = doorNumber;
    }

    @Override
    public void setRoof(String roofName) {
        this.roof = roofName;
    }

    @Override
    public void setEngine(String engineName) {
        this.engine = engineName;
    }

    Car getResult(){
        return new Car(doors, roof, engine);
    }


}
