package cs.sdp.bridge;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Remote remote = new Remote(radio);

        remote.powerOn();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();
    }
}
