
public class Meter extends Length{

	private final double conversion_factor=0.01;
	
	public Meter(double qty) {
		super(qty);
	}

	@Override
	public double getConversionToCentimeter(){
		return qty*100;
	}

	
	@Override
	public Length clone(double val) {
		return new Meter(val);
	}

	@Override
	public double getconv_fc() {
		return conversion_factor;
	}
	
}

