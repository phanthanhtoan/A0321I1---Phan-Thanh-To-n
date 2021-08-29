package bai17.baitap.Quan_Ly_San_Phan_Luu_File_Nhi_Phan;

public class Product {
    private int idProDuct;
    private String nameProduct;
    private String producer;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int idProDuct, String nameProduct, String producer, double price, String description) {
        this.idProDuct = idProDuct;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
        this.description = description;
    }

    public int getIdProDuct() {
        return idProDuct;
    }

    public void setIdProDuct(int idProDuct) {
        this.idProDuct = idProDuct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProDuct=" + idProDuct +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
