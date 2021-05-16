package cs.sdp.singleton;

public class Chris {
    private static Chris instance = null;

    private String favouriteDessert;

    private Chris(String favouriteDessert){
        this.favouriteDessert = favouriteDessert;
    }

    public static Chris newInstance(String favouriteDessert1){
        if(instance == null) {
            instance = new Chris(favouriteDessert1);
            System.out.println(instance.favouriteDessert);
        }
        return instance;
    }
    public void printDessert(){
        System.out.println(instance.favouriteDessert);
    }
}
