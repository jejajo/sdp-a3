public class AdapterStoreToStorage implements Storage {
    Product product;
    public AdapterStoreToStorage(Product product){
        this.product = product;
    }
    @Override
    public void supplement() {
        product.add();
    }

    @Override
    public void remove() {
        product.delete();
    }

    @Override
    public void info() {
        product.showInfo();
    }


}