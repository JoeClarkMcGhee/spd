package cs.sdp.composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Box{

    public List<Box> components;
    String name;

    Container(String name, List<Box> components){
        this.name = name;
        this.components = components;
    }

    public void addComponent(Box component) {
        this.components.add(component);
    }

    @Override
    public void getItemInfo() {
        System.out.println(name);
        for(Box b: components){
            b.getItemInfo();
        }
    }
}
