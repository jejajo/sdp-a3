public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple", 150, true);
        Storage storage = new AdapterStoreToStorage(product);

        product.getSale();

        storage.info();
        storage.supplement();
        storage.remove();

    }
}