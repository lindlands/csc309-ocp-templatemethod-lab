package lab.assignment.beforerefactoring;

public class CapuccinoMaker extends CoffeeMaker {

	@Override
	void addIngredients() {
		System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
	}

	@Override
	void finalTouch() {
        System.out.println("Top with milk foam");
	}

}