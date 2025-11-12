/**
 * Represents a product in the warehouse system.
 *
 * @author Patrick Farrnkopf
 */
public class Product {

    private String productID;
    private String productName;
    private String productCategory;
    private String productUnit;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    private int quantity;

    /**
     * Default Constructor
     */
    public Product() {
        productID = "undefined";
        productName = "undefined";
        quantity = 0;
    }

    /**
     * Parameterized Constructor
     *
     * @param quantity    the quantity of the product
     * @param productName the name of the product
     * @param productID   the ID of the product
     */
    public Product(int quantity, String productName, String productID, String productCategory, String productUnit) {
        this.quantity = quantity;
        this.productName = productName;
        this.productID = productID;
        this.productCategory = productCategory;
        this.productUnit = productUnit;
    }

    /**
     * Gets the product ID.
     *
     * @return the product ID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the product ID.
     *
     * @param productID the product ID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName the product name to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets the quantity of the product.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}