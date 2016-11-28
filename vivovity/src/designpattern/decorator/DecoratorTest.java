package designpattern.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Ingredient comp=new Pork2(new Pork(new Bread("zz")));
		comp.printDescription();

	}

}
