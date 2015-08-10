
public class Foot extends Unit{

	
	public Foot(double qty) {
		super(qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*12*2.54;
	}
	
	public static Foot convert(Unit qty){
		return new Foot(qty.getConversionToCentimeter()*0.0328084);
	}

}
