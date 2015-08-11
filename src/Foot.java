
public class Foot extends Length{

	private final double conversion_factor=30.48;
	public Foot(double qty) {
		super(qty);
		
	}
	
	public double getconv_fc(){
		return conversion_factor;
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*12*2.54;
	}
	
	@Override
	public Length clone(double val) {
		return new Foot(val);
	}

}
