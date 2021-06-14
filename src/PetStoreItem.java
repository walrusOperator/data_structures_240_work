
import java.text.DecimalFormat;

/**
 * An abstract class for use with child classes through inheritance. Class cannot be used to create a PetStoreItem object.
 * @author Thomas Mullins
 *
 */
public abstract class PetStoreItem {
	private String description;
	private double price;

	// constructor contains elements that inherited by child classes
	public PetStoreItem(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public double itemTotalCost() {
		return getPrice();
	}
	
	/**
	 * A method to return readable output for use by child processes
	 * @return String representing formatting information about a child processes description and price attributes.
	 */
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		String fprice = df.format(price);
		return description + "\t $" + fprice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
