package cs.sdp.bridge;

public class Radio extends Device{
    @Override
    public void enable() {
        System.out.println("I'm on!");
    }

    @Override
    public void crankIt() {
        System.out.println("Party time");
    }

    @Override
    public void keepItDown() {
        System.out.println("quite please");
    }
}
