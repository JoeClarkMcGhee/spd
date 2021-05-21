package cs.sdp.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box = getBox();
        box.getItemInfo();
    }

    private static Box getBox() {
        Item i3 = new Item("inner container item 1");
        Item i4 = new Item("inner container item 2");
        List<Box> innerContainerComponents = new ArrayList<>();
        innerContainerComponents.add(i3);
        innerContainerComponents.add(i4);
        Container c2 = new Container("inner container", innerContainerComponents);

        List<Box> rootContainerComponents = new ArrayList<>();
        Item i1 = new Item("item on root 1");
        Item i2 = new Item("item on root 2");
        rootContainerComponents.add(c2);
        rootContainerComponents.add(i1);
        rootContainerComponents.add(i2);

        return new Container("root", rootContainerComponents);

    }
}
