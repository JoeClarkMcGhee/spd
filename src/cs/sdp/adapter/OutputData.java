package cs.sdp.adapter;

public abstract class OutputData{

    OutputData(int Input1, int Input2 ){
        storageSpot1 = Input1;
        storageSpot2 = Input2;
    }
    private int storageSpot1;
    private int storageSpot2;

    public abstract void display();

}
