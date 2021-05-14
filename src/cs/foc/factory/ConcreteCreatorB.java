package cs.foc.factory;

public class ConcreteCreatorB extends AbstractCreator{
    @Override
    AbstractProduct createProduct() {
        return new ConcreteProductB();
    }
}
