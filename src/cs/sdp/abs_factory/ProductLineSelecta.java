package cs.sdp.abs_factory;

public class ProductLineSelecta {

    static Factory getFactory(String factoryType) {
        if (factoryType.equals("cfA")) {
            return new ConcreteFactoryA();
        } else {
            return new ConcreteFactoryB();
        }
    }

}
