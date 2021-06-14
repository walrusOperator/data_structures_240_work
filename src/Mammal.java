
/**
 * A method used for the forging of the MAmmal object type. Class does make use of attributes from the 
 * parent class Pet. Also used for user readable output in regard to Mammal objects created.
 * @author Thomas Mullins
 *
 */
public class Mammal extends Pet {

	private final int DOG = 0;
	private final int CAT = 1;
	private String name;
	private int typeOfMammal;
	private int numLegs;

	// constructor uses object elements from Pet parent class
	public Mammal(String description, double price, boolean isLovable, int age, String name, int typeOfMammal,
			int numLegs) {
		super(description, price, isLovable, age);
		this.name = name;
		this.typeOfMammal = typeOfMammal;
		this.numLegs = numLegs;
	}

	/**
	 * A method to return user readable output in regard to Pet object. also translates int typeOfMammal attribute of 0 or 1 
	 * to "Dog" or "Cat" respectively.
	 * @return User readable String representing the Pet object
	 */
	@Override
	public String toString() {
		int animal = getTypeOfMammal();
		String newAnimal;
		if (animal == DOG) {
			newAnimal = "Dog";
		} else if (animal == CAT) {
			newAnimal = "Cat";
		} else {
			newAnimal = "Other";
		}
		String output = "";
		output += super.toString() + newAnimal + "\t" + numLegs; // output makes use of toString from Pet parent class
		return output;
	}

	/**
	 * A method to produce animal noise String output when called on a Mammal object type
	 * @return a String of an animal noise for either dog or cat animal types.
	 */
	public String speak() {
		int type = typeOfMammal;
		if (type == 0) {
			return "Bow wow";
		} else if (type == 1) {
			return "Meow";
		} else {
			return "";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypeOfMammal() {
		return typeOfMammal;
	}

	public void setTypeOfMammal(int typeOfMammal) {
		this.typeOfMammal = typeOfMammal;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

}
