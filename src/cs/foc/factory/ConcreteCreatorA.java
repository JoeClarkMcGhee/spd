package cs.foc.factory;

public class ConcreteCreatorA extends AbstractCreator{
    @Override
    AbstractProduct createProduct() {
        return new ConcreteProductA();
    }
}
