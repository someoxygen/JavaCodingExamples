public class Product<T,U> {
    private T name;
    private U price;
    Product(T name, U price){
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public U getPrice() {
        return price;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setPrice(U price) {
        this.price = price;
    }
}
