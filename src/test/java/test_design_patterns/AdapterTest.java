package test_design_patterns;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import structural_adapter.HpIndianCharger;
import structural_adapter.HpUsCharger;
import structural_adapter.UsToIndiaAdapter;

public class AdapterTest {
	@Test
	public void adapterTest1() {
		Logger log = Logger.getLogger(AdapterTest.class.getName());
		
		HpIndianCharger hI = new HpIndianCharger();
		log.info("Created HpIndianCharger object");
		
		HpUsCharger hU = new HpUsCharger();
		log.info("Created HpUsCharger object");
		
		assertEquals("Indian",hI.fitsWhat());
		assertEquals("US",hU.fitsWhat());
		
		UsToIndiaAdapter hUI = new UsToIndiaAdapter(hU);
		log.info("Created UsToIndiaAdapter object");
		
		assertEquals("Indian",hUI.fitsWhat());
	}
}
