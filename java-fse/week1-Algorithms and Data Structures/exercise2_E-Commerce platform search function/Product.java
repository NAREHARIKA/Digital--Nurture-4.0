public class Product {
    private int id;
    private String name;
    private String description;

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name.toLowerCase();
        this.description = description.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public String getSearchableText() {
        return name + " " + description;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name=" + name + "]";
    }
}