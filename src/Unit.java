
public abstract class Unit {

	protected double qty;
	
	public Unit(double qty) {
		this.qty = qty;
	}

	public abstract double getConversionToCentimeter();
	
	public boolean checkEquality(Unit qty1){
		return qty1.getConversionToCentimeter()==this.getConversionToCentimeter();
	}
	
	
}
