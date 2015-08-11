import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class EqualityTest{

	@SuppressWarnings("deprecation")
	@Test
	public void testForCentimeterAndMeterEquality() {
		Meter m=new Meter(5);
		Centimeter cm=new Centimeter(500);
		
		Assert.assertTrue(cm.checkEquality(m));
	}
	
	@Test
	public void testForMeterToInchConversion(){
		
		Length m=new Meter(10);
		Length inch=new Inch(393.701);
		Inch inch1=(Inch)inch.convert(m);
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
	
		Length foot=new Foot(10.000000320000002);
		Length inch=new Inch(120);
		Foot foot2=(Foot)foot.convert(inch);
		
		Assert.assertTrue(foot.checkEquality(foot2));
		}
	
	@Test
	public void testForInchToYardConversion(){
		Length inch=new Inch(10);
		Yard y1=new Yard(0.277778);
		Yard y2=(Yard)y1.convert(inch);

		Assert.assertEquals(y2.getConversionToCentimeter(),y1.getConversionToCentimeter(), 1);
	}
	
	@Test
	public void testForInchToMeterConversion(){
		Inch inch=new Inch(10);
		/*Meter m=Meter.convert(inch);

		Assert.assertEquals(inch.getConversionToCentimeter(),m.getConversionToCentimeter(), 1);
	*/}
	
	/*@Test
	public void TestForAdditionofInchAndMeter(){
		Inch inch=new Inch(10);
		Meter meter=new Meter(20);
		Meter addResult=meter.add(inch);
		Assert.assertTrue(addResult.qty==20.254);
	}*/
	
	@Test
	public void TestForAdditionofCentimeterAndMeter(){
		Meter l1=new Meter(1);
		Centimeter l2=new Centimeter(200);
		Meter l3=(Meter)l1.add(l2);
		
		Assert.assertTrue(l3.qty==3);
	}
	
	/*@Test
	public void TestForIncorrectAdditionOfInchAndMeter(){
		Inch inch=new Inch(10);
		Meter meter=new Meter(20);
		Meter addResult=meter.add(inch);
		Assert.assertFalse(addResult.qty!=20.254);
	}
	*/
	@Test
	public void TestForEqualityOfTeaspoonAndTablespoon(){
		Teaspoon t1=new Teaspoon(3);
		Tablespoon t2=new Tablespoon(1);
		
		Assert.assertTrue(t1.checkEquality(t2));
	}
	
	@Test
	public void TestForConversionOfTablespoonToTeaspoon(){
		Tablespoon t1=new Tablespoon(1);
		Teaspoon t2=Teaspoon.convertFrom(t1);
		
		Assert.assertTrue(t1.checkEquality(t2));
	}
	
	@Test
	public void TestForConversionOfTablespoonToOunce(){
		Tablespoon t1=new Tablespoon(1);
		Ounce t2=Ounce.convertFrom(t1);
		
		Assert.assertTrue(t1.checkEquality(t2));
	}
	
	@Test
	public void TestForConversionOfOunceToTeaspoon(){
		Ounce t1=new Ounce(1);
		Teaspoon t2=Teaspoon.convertFrom(t1);
		
		Assert.assertTrue(t1.checkEquality(t2));
	}
	
	@Test
	public void TestForConversionOfOunceToTablespoon(){
		Ounce t1=new Ounce(1);
		Tablespoon t2=Tablespoon.convertFrom(t1);
		
		Assert.assertTrue(t1.checkEquality(t2));
	}
	
	@Test
	public void TestForConversionOfCelTOFar(){
		Celsius c1=new Celsius(100);
		Farenheit f1=new Farenheit(212);
		Farenheit f2=f1.convert(c1);
		Assert.assertTrue(f1.checkEquality(f2));
	}
	
	
	@Test
	public void TestForConversionOfFarTOCel(){
		
		Farenheit f1=new Farenheit(32);
		Celsius c1=new Celsius(0);
		Celsius c2=c1.convert(f1);
		Assert.assertTrue(c1.checkEquality(c2));
	}
}