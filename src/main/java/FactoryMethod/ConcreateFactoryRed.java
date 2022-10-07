package FactoryMethod;

public class ConcreateFactoryRed implements Factory{
    @Override
    public Product createProduct() {
        return new RedProduct("Red");
    }
}
