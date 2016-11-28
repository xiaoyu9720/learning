package designpattern.decorator;

public class Pork extends Decorator {

	public Pork(Ingredient igt) {
		super(igt);
	}

	@Override
	public String getDescription() {
		String base=ingredient.getDescription();
		return base+", with pork";
	}

	@Override
	public double getCost() {
		double basePrice=ingredient.getCost();
		double porkPrice=1.8;
		return basePrice+porkPrice;
	}

}
