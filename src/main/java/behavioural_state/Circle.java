package behavioural_state;

import org.apache.log4j.Logger;

public class Circle implements Shape {

	public String draw() {
		Logger log = Logger.getLogger(Circle.class.getName());
		log.debug("Drawing Circle");
		return "Drawing Circle";
	}

}
