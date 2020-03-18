package structural_adapter;

import org.apache.log4j.Logger;

public class HpUsCharger implements UsCharger {

	public String fitsWhat() {
		Logger log = Logger.getLogger(HpUsCharger.class.getName());
		log.debug("Fits with an US port");
		return "US";
	}
	
}
