package FactoryMethod;

public class ConcreteFactoryBlue implements Factory{
    @Override
    public Product createProduct() {
        return new BlueProduct("Blue");
    }
}
