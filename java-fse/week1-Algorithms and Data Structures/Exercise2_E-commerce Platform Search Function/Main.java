public class Main {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();

        engine.addProduct(new Product(1, "iPhone 14", "Apple smartphone with 128GB storage"));
        engine.addProduct(new Product(2, "Samsung Galaxy S23", "Android phone with amazing camera"));
        engine.addProduct(new Product(3, "Sony Headphones", "Noise cancelling wireless headphones"));

        System.out.println("Search results for 'phone':");
        for (Product p : engine.search("phone")) {
            System.out.println(p);
        }

        System.out.println("\nSearch results for 'apple':");
        for (Product p : engine.search("apple")) {
            System.out.println(p);
        }

        System.out.println("\nSearch results for 'headphones':");
        for (Product p : engine.search("headphones")) {
            System.out.println(p);
        }
    }
}