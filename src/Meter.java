
public class Meter extends Unit{

	public Meter(double qty) {
		super(qty);
	}

	@Override
	public double getConversionToCentimeter(){
		return qty*100;
	}
	
	public static Meter convert(Unit qty){
		return new Meter(qty.getConversionToCentimeter()*0.01);
	}
	
}

