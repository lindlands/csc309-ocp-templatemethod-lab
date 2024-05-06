package lab.assignment.beforerefactoring;

public class AmericanoMaker extends CoffeeMaker{
	
	@Override
	void addIngredients() {
		System.out.println("Add more hot water");
	}

	@Override
	void finalTouch() {
        System.out.println("Add sugar and cream");
	}

}
