
public class Centimeter extends Length {
	
	private final double conversion_factor=1;
	public Centimeter(double qty) {
		super(qty);
		
	}

	@Override
	public double getConversionToCentimeter() {
		return qty;
	}

	@Override
	public Length clone(double val) {
		return new Centimeter(val);
	}

	@Override
	public double getconv_fc() {
		return conversion_factor;
	}
}
