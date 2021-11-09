public class Fashion {
    private Category category;
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int quantitySold;

    public Fashion(Category category, int id, String name, double price, int quantity, int quantitySold) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    @Override
    public String toString() {
        return category +
                " - Mã sản phẩm: " + id +
                " - " + name +
                " - " + price +
                "VNĐ - Số lượng: " + quantity +
                "cái - Đã bán: " + quantitySold  + " cái"
                ;
    }
}
