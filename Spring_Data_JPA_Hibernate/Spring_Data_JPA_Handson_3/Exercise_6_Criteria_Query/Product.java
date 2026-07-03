public class Product {

    private int id;
    private String name;
    private String category;
    private double price;
    private int ram;

    public Product() {
    }

    public Product(int id,
                   String name,
                   String category,
                   double price,
                   int ram) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

}