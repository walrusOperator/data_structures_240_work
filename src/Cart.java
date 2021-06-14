
import java.text.DecimalFormat;

/**
 * The cart class is used to manage the addition of new child objects to the itemsList array as well 
 * as calculating the total cost of items in the itemsList array and formatting for output to the user.
 * @author Thomas Mullins
 *
 */
public class Cart {
	private PetStoreItem[] itemsList;
	private int numItems;
	
	// cart object constructor. requires int parameter to set array length
	public Cart(int maxItems) {
		this.itemsList = new PetStoreItem[maxItems];
		this.numItems = 0;
	}
	
	/**
	 * Method to add new objects to the itemsList array and increase the numItems counter by 1 for each addition
	 * @param newItem any child object data type of the PetStoreItem class 
	 */
	public void add(PetStoreItem newItem) {
		itemsList[numItems++] = newItem;
	}
	
	/**
	 * Method to tabulate the sum cost of elements in the itemsList array. Will differentiate between
	 *  object type that uses a quantity element.
	 * @return a double representing total cost of items in the users cart.
	 */
	public double cartTotalCost() {
		double total = 0;		
		for(int i = 0; i < size(); i++) {
			if(itemsList[i] instanceof PetFood) {
				total += itemsList[i].itemTotalCost();
			} else {
			total += itemsList[i].getPrice();
			}
		}

		return total;
	}
	
	/**
	 * a helper method to gather the total number of items in the itemsList array
	 * @return integer representing number of items in the users cart
	 */
	public int size() {
		return numItems;
	}
	
	/**
	 * A method used to format data from the itemsList array to human readable output. Makes use of toString methods from 
	 * other classing including the PetStoreItem parent class and its children. Also formats the total to a rounded decimal.
	 * @return a String of user readable data for a simple receipt
	 */
	@Override
	public String toString() {
		String stringMammals = "";
		String stringFish = "";
		String stringFood = "";
		String stringPet = "";
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
    	String ftotal = df.format(cartTotalCost());
    	
    	// instance of used to collect individual object types and assigned to separate Strings
		for(int i = 0; i < numItems; i++) {
			if(itemsList[i] instanceof Mammal) {
				stringMammals += itemsList[i]+"\n";
			} else if(itemsList[i] instanceof Fish) {
				stringFish += itemsList[i]+"\n";
			} else if(itemsList[i] instanceof PetFood) {
				stringFood += itemsList[i]+"\n";
			} else {
				stringPet += itemsList[i]+"\n";
			}
	}
		return "MAMMALS\nDescription \t Price \t Lovable \tAge \tType \tLegs\n" + stringMammals
		 + "\nFISH\nDescription \t Price \t Lovable \tAge \tColor \tTropical\n" + stringFish
		 + "\nOTHER ANIMAL\nDescription \t Price \t Lovable \tAge\n" + stringPet
		 + "\nPET FOOD\nDescription \t Unit Price \t Quantity \tTotal price\n" + stringFood
		 + "\nTotal Cost: $" + ftotal;
	
}
}
