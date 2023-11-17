package models;

public class Invoice {
    private String nameInvoice;
    private String nameProduct;
    private int price;
    private String date;

    public Invoice(String nameInvoice, String nameProduct, int price, String date) {
        this.nameInvoice = nameInvoice;
        this.nameProduct = nameProduct;
        this.price = price;
        this.date = date;
    }

    public String getNameInvoice() {
        return nameInvoice;
    }

    public void setNameInvoice(String nameInvoice) {
        this.nameInvoice = nameInvoice;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
