
public abstract class Unit {

	public abstract double getConversionToCentimeter();
	//public double getConversionToMeter();
	public boolean checkEquality(Unit qty1){
		return qty1.getConversionToCentimeter()==this.getConversionToCentimeter();
	
	}
}
