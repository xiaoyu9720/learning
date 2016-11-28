package designpattern.decorator;

public abstract class Ingredient {
	public abstract String getDescription();
	public abstract double getCost();
	public void printDescription(){
		System.out.println("Name: "+this.getDescription());
		System.out.println("Price: "+this.getCost());
	}

}
