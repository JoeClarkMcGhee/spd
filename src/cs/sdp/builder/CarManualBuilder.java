package cs.sdp.builder;

public class CarManualBuilder implements AbstractCarBuilder {

    String doors;
    String roof;
    String engine;

    @Override
    public void setDoors(int doorNumber) {
        this.doors = String.valueOf(doorNumber);
    }

    @Override
    public void setRoof(String roofNameDesc) {
        this.roof = roofNameDesc;
    }

    @Override
    public void setEngine(String engineNameDesc) {
        this.engine = engineNameDesc;
    }

    CarManual getResult(){
        return new CarManual(doors,roof,engine);
    }
}
