
package ra.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private Float price;
    private String description;
    private Date createdDate;
    private int categoryId;

    public Product() {
    }

    public Product(String productId, String productName, Float price, String description, Date createdDate, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.createdDate = createdDate;
        this.categoryId = categoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void inputData(Scanner scanner) {
        this.productId = getInputProductId();
        this.productName = scanner.nextLine();
    }

    public String getInputProductId() {
        String regex = "^( [CSA])\\d{3}$";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhap ma san pham");
            String productIdinput = scanner.nextLine();
            if (productIdinput.matches(regex)) {
                // kt trùng lặp
                if (!productIdinput.equals(this.productId)) {
                    return productIdinput;
                }
            } else {
                System.err.println("không đúng định dạng");
            }
        }
    }

    public void displayData() {
        System.out.printf(" | ID: %d |  ProductName:%-10s | Price: %f | description: %s | created: %s | categoryId: %d\n", this.categoryId, this.productName, this.price, this.description, this.createdDate.toString(), this.categoryId);
    }

}