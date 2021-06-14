import java.text.DecimalFormat;

/**
 * Class used to forge PetFood objects. Makes use of attributes inherited from the PetStoreItem parent class. 
 * Also used to calculate item cost of PetFood objects, and to produce readable output.
 * @author Thomas Mullins
 *
 */
public class PetFood extends PetStoreItem {
	private int quantity;

	public PetFood(String description, double price, int quantity) {
		super(description, price);
		this.quantity = quantity;
	}
	
	/**
	 * Method used to calculate total cost for a PetFood object.
	 * @return a double representing a PetFood objects total cost
	 */
	public double itemTotalCost() {
		return quantity * super.getPrice();
	}

	/**
	 * Method to produce readable user output. 
	 * @return User readable String including PetFood object attributes
	 */
	@Override
	public String toString() {
		double total = (super.getPrice() * quantity);
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		String ftotal = df.format(total);
		String output = "";
		output += super.toString() + "\t\t " + quantity + "\t\t$" + ftotal;
		return output;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
