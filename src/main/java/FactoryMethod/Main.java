package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ConcreateFactoryRed factoryRed = new ConcreateFactoryRed();
        ConcreteFactoryBlue factoryBlue = new ConcreteFactoryBlue();

        Product blueProduct = factoryBlue.createProduct();
        Product redProduct = factoryRed.createProduct();
    }
}
