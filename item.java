public class item {
    private String name;
    private String category;
    private String sku;


    public item(String name, String category, String sku) {
        this.name = name;
        this.category = category;
        this.sku = sku;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getSku() {
        return sku;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Item{name='" + name + "', category='" + category + "', sku='" + sku + "'}";
    }
}