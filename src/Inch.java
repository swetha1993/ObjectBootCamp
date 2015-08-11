
public class Inch extends Length{

	private final double conversion_factor=0.393701;
	public Inch(double qty) {
		super(qty);

	}

	public double getconv_fc(){
		return conversion_factor;
	}
	
	@Override
	public double getConversionToCentimeter() {
		return qty*2.54;
	}

	@Override
	public Length clone(double val) {
		return new Inch(val);
	}
}
