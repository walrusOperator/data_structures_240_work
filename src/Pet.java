
/**
 * A class used to forge the Pet object and return formatted user output. Makes use of inherited attributes from the 
 * PetStoreItem parent class
 * @author Thomas Mullins
 *
 */
public class Pet extends PetStoreItem {
	private boolean isLovable;
	private int age;

	public Pet(String description, double price, boolean isLovable, int age) {
		super(description, price);
		this.isLovable = isLovable;
		this.age = age;
	}
	
	/**
	 * Method to produce readable user output representative of the Pet object class
	 * @return formatted String for user output
	 */
	@Override
	public String toString() {
		String output = "";
		output += super.toString();
		output += "\t " + isLovable + "\t\t" + age + "\t";
		return output;
	}

	public boolean isLovable() {
		return isLovable;
	}

	public void setLovable(boolean isLovable) {
		this.isLovable = isLovable;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
