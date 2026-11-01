public class Main {
    public static void main(String[] args){

        Book<String> book = new Book<>("The Petit Prince");
        System.out.println(book.getName());
        book.setName("Lord Of The Rings");
        System.out.println(book.getName());

        Product<String,Double> product = new Product<>("Apple",5.99);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        product.setName("Orange");
        product.setPrice(7.85);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
