package designpattern.decorator;

public class Bread extends Ingredient {
	
	private String description;
	
	public Bread(String desc){
		this.description=desc;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getCost() {
		return 2.48;
	}

}
