package cs.sdp.bridge;

public class Remote {
    Device device;

    Remote(Device device){
        this.device = device;
    }

    public void powerOn(){
        device.enable();
    }

    public void volumeUp(){
        device.crankIt();
    }

    public void volumeDown(){
        device.keepItDown();
    }
}
