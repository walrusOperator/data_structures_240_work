
public class ShoppingDriver {

	public static void main(String[] args) {

		Mammal test1 = new Mammal("test Cat", 30, true, 5, "Greg", 1, 4);
		System.out.println(test1.speak());
		Mammal test2 = new Mammal("test Dog", 30, false, 5, "walt", 0, 4);
		System.out.println(test2.speak());

		Fish test3 = new Fish("One fish", 5, false, 4, "orange", true);
		Fish test4 = new Fish("Two fish", 6, true, 3, "green", false);
		Fish test5 = new Fish("Red fish", 7, true, 2, "red", false);
		Fish test6 = new Fish("Blue fish", 8, false, 1, "blue", true);

		PetFood test7 = new PetFood("Alpo Dog Chow", 12.50, 3);
		PetFood test8 = new PetFood("Fancy Feast", .78, 10);

		Pet test9 = new Pet("Hamster Dave", 3, true, 1);

		Cart testCart = new Cart(10);
		testCart.add(test1);
		testCart.add(test2);
		testCart.add(test3);
		testCart.add(test4);
		testCart.add(test5);
		testCart.add(test6);
		testCart.add(test7);
		testCart.add(test8);
		testCart.add(test9);

		System.out.println(testCart);

	}

}
