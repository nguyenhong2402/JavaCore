public class Product {
    int id;
    String name;
    String description;
    long price;
    int quantity;
    int quantitySort;
    String company;
    Category category;

    public Product(int id, String name, String description, long price, int quantity, int quantitySort, String company, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.quantitySort = quantitySort;
        this.company = company;
        this.category = category;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantitySort() {
        return quantitySort;
    }

    public void setQuantitySort(int quantitySort) {
        this.quantitySort = quantitySort;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " + price + " - " + quantity + " - " + quantitySort + " - " + company + " - " + category;
    }
}
