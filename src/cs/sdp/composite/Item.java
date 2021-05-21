package cs.sdp.composite;

public class Item implements Box{

    String name = null;

    Item(String name){
        this.name = name;
    }

    @Override
    public void getItemInfo() {
        System.out.println(name);
    }
}
