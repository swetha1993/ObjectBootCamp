
public class Yard extends Length{

	private final double conversion_factor=91.44;
	public Yard(double qty) {
		super(qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*91.44;
	}

	@Override
	public Length clone(double val) {
		return new Yard(val);
	}

	@Override
	public double getconv_fc() {
		return conversion_factor;
	}
}
