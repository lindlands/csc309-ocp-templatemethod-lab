package lab.assignment.beforerefactoring;

public class MochaMaker extends CoffeeMaker {

	@Override
	void addIngredients() {
		System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
	}

	@Override
	void finalTouch() {
        System.out.println("Adding sugar");
	}

}