package structural_adapter;

import org.apache.log4j.Logger;

public class HpIndianCharger implements IndianCharger {

	public String fitsWhat() {
		Logger log = Logger.getLogger(HpIndianCharger.class.getName());
		log.debug("Fits with an Indian port");
		return "Indian";
	}

}
