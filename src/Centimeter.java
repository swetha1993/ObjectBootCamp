
public class Centimeter extends Unit {
	
	public Centimeter(double qty) {
		super(qty);
		
	}

	@Override
	public double getConversionToCentimeter() {
		return qty;
	}
	
	public static Centimeter convert(Unit qty){
		return new Centimeter(qty.getConversionToCentimeter());
	}
}
