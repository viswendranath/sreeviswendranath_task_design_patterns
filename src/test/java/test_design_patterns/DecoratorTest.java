package test_design_patterns;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import structural_decorator.BlackPant;
import structural_decorator.Person;
import structural_decorator.WhiteShirt;

public class DecoratorTest {

	@Test
	public void decoratorTest1() {
		Person viswa = new Person("Viswa");
		viswa = new WhiteShirt(viswa);
		viswa = new BlackPant(viswa);
		Logger log = Logger.getLogger(DecoratorTest.class.getName());
		log.debug(viswa.getOutfits());

		assertEquals("Viswa, with Shirt, with Black pant", viswa.getOutfits());

		Person nani = new Person();
		nani = new BlackPant(nani);
		log.debug(nani.getOutfits());

		assertEquals("none, with Black pant", nani.getOutfits());
	}

}
