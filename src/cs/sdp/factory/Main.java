package cs.sdp.factory;

public class Main {

    public static void main(String[] args) {
        String factoryType = args[0];
        AbstractProduct product;

        AbstractCreator creator;
        switch (factoryType) {
            case "A":
                creator = new ConcreteCreatorA();
                break;
            case "B":
                creator = new ConcreteCreatorB();
                break;
            case "C":
                creator = new ConcreteCreatorC();
                break;
            default:
                throw new RuntimeException();
        }

        product = creator.createProduct();
        product.doesThing();

    }
}
