
public class Menu {
	private String name;
    private double calories;
    private int cookingTime;
    private double price;
    private double wineBottles;

	public static void main(String[] args) {
		    // Constructor
		    public Menu(String name, double calories, int cookingTime, double price, double wineBottles) {
		        this.name = name;
		        this.calories = calories;
		        this.cookingTime = cookingTime;
		        this.price = price;
		        this.wineBottles = wineBottles;
		    }

		    // Getter and Setter methods
		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public double getCalories() {
		        return calories;
		    }

		    public void setCalories(double calories) {
		        this.calories = calories;
		    }

		    public int getCookingTime() {
		        return cookingTime;
		    }

		    public void setCookingTime(int cookingTime) {
		        this.cookingTime = cookingTime;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public void setPrice(double price) {
		        this.price = price;
		    }

		    public double getWineBottles() {
		        return wineBottles;
		    }

		    public void setWineBottles(double wineBottles) {
		        this.wineBottles = wineBottles;
		    }

		    // Exercise b: Method to print menu details
		    public void printMenuDetails() {
		        System.out.println("Menu " + name + " contains " + calories + " calories, comes with " + wineBottles + " bottles and costs " + price);
		    }
		}

		// Exercise c: Main class with main method
		public class Main {
		    public static void main(String[] args) {
		        // Creating Menu objects
		        Menu[] menus = {
		                new Menu("Stamppot boerenkool", 564.65, 45, 20.5, 0.5),
		                new Menu("Metworst", 345, 12, 10.99, 0),
		                new Menu("Hutspot", 560.4, 65, 30.9, 1),
		                new Menu("Biefstuk", 780, 46, 50.34, 2),
		                new Menu("Kibbeling", 450.4, 23, 20.78, 1)
		        };

		        // Exercise d: Printing menu details
		        for (Menu menu : menus) {
		            menu.printMenuDetails();
		        }

		        // Exercise e: Printing dishes with cooking time less than 30 minutes
		        System.out.println("\nDishes with cooking time less than 30 minutes:");
		        for (Menu menu : menus) {
		            if (menu.getCookingTime() < 30) {
		                System.out.println(menu.getName() + " cooks in " + menu.getCookingTime() + " minutes");
		            }
		        }

		        // Exercise f: Calculating total price
		        double totalPrice = 0;
		        for (Menu menu : menus) {
		            totalPrice += menu.getPrice();
		        }

		        System.out.println("\nThe total price is: " + totalPrice);

		        // Applying discount if total price is more than 65
		        if (totalPrice > 65) {
		            double discountedPrice = totalPrice * 0.9;
		            System.out.println("The discounted price is: " + discountedPrice);
		        }
		    }


	}

}
