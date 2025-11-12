
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 * Represents the data of a warehouse, including its ID, name, timestamp, and products.
 */
public class WarehouseData {

	private String warehouseID;
	private String warehouseName;

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getWarehouseCountry() {
		return WarehouseCountry;
	}

	public void setWarehouseCountry(String warehouseCountry) {
		WarehouseCountry = warehouseCountry;
	}

	public String getWarehouseCity() {
		return warehouseCity;
	}

	public void setWarehouseCity(String warehouseCity) {
		this.warehouseCity = warehouseCity;
	}

	public String getWarehousePostalcode() {
		return warehousePostalcode;
	}

	public void setWarehousePostalcode(String warehousePostalcode) {
		this.warehousePostalcode = warehousePostalcode;
	}

	private String warehouseAddress;
	private String WarehouseCountry;
	private String warehouseCity;
	private String warehousePostalcode;
	private String timestamp;
	private HashSet<Product> products;

	/**
	 * Default constructor that initializes the timestamp and product set.
	 */
	public WarehouseData() {
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.products = new HashSet<Product>();
	}

	/**
	 * Gets the warehouse ID.
	 *
	 * @return the warehouse ID
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

	/**
	 * Sets the warehouse ID.
	 *
	 * @param warehouseID the warehouse ID to set
	 */
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	/**
	 * Gets the warehouse name.
	 *
	 * @return the warehouse name
	 */
	public String getWarehouseName() {
		return warehouseName;
	}

	/**
	 * Sets the warehouse name.
	 *
	 * @param warehouseName the warehouse name to set
	 */
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	/**
	 * Gets the timestamp of the warehouse data.
	 *
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp of the warehouse data.
	 *
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Adds a product to the warehouse.
	 *
	 * @param p the product to add
	 * @return true if the product was added, false otherwise
	 */
	public boolean addProduct(Product p) {
		return products.add(p);
	}

	/**
	 * Removes a product from the warehouse.
	 *
	 * @param p the product to remove
	 * @return true if the product was removed, false otherwise
	 */
	boolean removeProduct(Product p) {
		return products.remove(p);
	}

	/**
	 * Removes a product from the warehouse by its ID.
	 *
	 * @param productID the ID of the product to remove
	 * @return true if the product was removed, false otherwise
	 */
	boolean removeProductByID(String productID) {
		for (Product p : products) {
			if (p.getProductID().equals(productID)) {
				return products.remove(p);
			}
		}
		return false;
	}

	/**
	 * Gets the set of products in the warehouse.
	 *
	 * @return the HashSet of products
	 */
	public HashSet<Product> getProducts() {
		return products;
	}

	/**
	 * Returns a string representation of the warehouse data.
	 *
	 * @return a formatted string with warehouse information
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID, timestamp);
		return info;
	}

	public ArrayList<String> productsToString() {
		ArrayList<String> productStrings = new ArrayList<>();
		for (Product p : products) {
			productStrings.add(p.toString());
		}
		return productStrings;
	}
}