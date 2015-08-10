import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class EqualityTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testForCentimeterAndMeterEquality() {
		Meter m=new Meter(5);
		Centimeter cm=new Centimeter(500);
		
		Assert.assertTrue(cm.checkEquality(m));
	}
	
	@Test
	public void testForMeterToInchConversion(){
		
		Meter m=new Meter(10);
		Inch inch=Inch.convert(m);
		Assert.assertEquals(inch.getConversionToCentimeter(),m.getConversionToCentimeter(), 1);
	}
	
	@Test
	public void testForCentimeterAndMeterInequality(){
	
		Meter m=new Meter(5);
		Centimeter cm=new Centimeter(500);
		
		Assert.assertFalse(!cm.checkEquality(m));
	}
	
	@Test
	public void testForInchToFeetConversion(){
	
		Foot foot=new Foot(10.000000320000002);
		Inch inch=new Inch(120);
		Foot foot2=foot.convert(inch);
		
		Assert.assertTrue(foot.checkEquality(foot2));
		}
	
	@Test
	public void testForInchToYardConversion(){
		Inch inch=new Inch(10);
		yard y1=yard.convert(inch);

		Assert.assertEquals(inch.getConversionToCentimeter(),y1.getConversionToCentimeter(), 1);
	}
	
	@Test
	public void testForInchToMeterConversion(){
		Inch inch=new Inch(10);
		Meter m=Meter.convert(inch);

		Assert.assertEquals(inch.getConversionToCentimeter(),m.getConversionToCentimeter(), 1);
	}
	
	@Test
	public void TestForAdditionofInchAndMeter(){
		Inch inch=new Inch(10);
		Meter meter=new Meter(20);
		Meter addResult=meter.add(inch);
		Assert.assertTrue(addResult.qty==20.254);
	}
	
	@Test
	public void TestForIncorrectAdditionOfInchAndMeter(){
		Inch inch=new Inch(10);
		Meter meter=new Meter(20);
		Meter addResult=meter.add(inch);
		Assert.assertFalse(addResult.qty!=20.254);
	}
}