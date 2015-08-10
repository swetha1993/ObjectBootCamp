import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class EqualityTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testForCentimeterAndMeterEquality() {
		
		
		Meter m=new Meter();
		m.qty=5;
		
		Centimeter cm=new Centimeter();
		cm.qty=500;
		
		Assert.assertTrue(cm.checkEquality(m));
	}
	
	@Test
	public void testForCentimeterAndMeterInequality(){
	
		Meter m=new Meter();
		m.qty=5;
		
		Centimeter cm=new Centimeter();
		cm.qty=500;
		
		Assert.assertFalse(!cm.checkEquality(m));

}
}