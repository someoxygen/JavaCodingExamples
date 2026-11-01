import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Double> products = new HashMap<>();
        products.put("Apple",0.50);
        products.put("Orange",0.35);
        products.put("Banana",0.95);
        System.out.println(products);

        products.remove("Apple");
        System.out.println(products);

        products.put("Strawberry",1.00);
        System.out.println(products);

        if(products.containsKey("Apple")){
            System.out.println(products.get("Apple"));
        }
        else {
            System.out.println("Products dont have Apple");
        }

        if(products.containsKey("Strawberry")){
            System.out.println(products.get("Strawberry"));
        }
        else {
            System.out.println("Products dont have Strawberry");
        }

        System.out.println(products.containsValue(0.35));

        //DATA TYPE MATTERS
        System.out.println(products.containsValue(1));
        System.out.println(products.containsValue(1.00));

        for(String product: products.keySet()){
            System.out.println("Product name: " + product + " Product price: $" + products.get(product));
        }

        System.out.println(products.size());

    }
}
