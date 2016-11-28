package designpattern.decorator;

public class Pork2 extends Decorator {

	public Pork2(Ingredient igt) {
		super(igt);
	}

	@Override
	public String getDescription() {
		String base=ingredient.getDescription();
		return base+", with pork2";
	}

	@Override
	public double getCost() {
		double basePrice=ingredient.getCost();
		double porkPrice=1.0;
		return basePrice+porkPrice;
	}

}
