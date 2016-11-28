package designpattern.decorator;

public abstract class Decorator extends Ingredient {
	
	Ingredient ingredient;
	public Decorator(Ingredient igt) {
		this.ingredient=igt;
		
	}

	public abstract String getDescription() ;

	public abstract double getCost() ;

}
