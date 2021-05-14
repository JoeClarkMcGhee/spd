package cs.foc.factory;

public class Main {

    public static void main(String[] args) {
        String factoryType = args[0];
        AbstractProduct product;

        AbstractCreator creator = switch (factoryType) {
            case "A" -> new ConcreteCreatorA();
            case "B" -> new ConcreteCreatorB();
            case "C" -> new ConcreteCreatorC();
            default -> throw new RuntimeException();
        };

        product = creator.createProduct();
        product.doesThing();

    }
}
