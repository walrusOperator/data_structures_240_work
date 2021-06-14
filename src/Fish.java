
/**
 * A method used for the forging of the Fish object type. Class does make use of parent class Pet. Also used for user readable 
 * output in regard to Fish objects created.
 * @author Thomas Mullins
 *
 */
public class Fish extends Pet {
	private String color;
	private boolean tropical;

	// constructor uses object elements from Pet parent class
	public Fish(String description, double price, boolean isLovable, int age, String color, boolean tropical) {
		super(description, price, isLovable, age);
		this.color = color;
		this.tropical = tropical;
	}
	/**
	 * Method to produce readable user output. 
	 * @return User readable String including Fish object attributes
	 */
	@Override
	public String toString() {
		String output = "";
		output += super.toString() + color + "\t" + tropical; // output makes use of toString from Pet parent class
		return output;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTropical() {
		return tropical;
	}

	public void setTropical(boolean tropical) {
		this.tropical = tropical;
	}

}
