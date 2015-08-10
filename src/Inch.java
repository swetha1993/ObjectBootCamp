
public class Inch extends Unit{

	public Inch(double qty) {
		super(qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*2.54;
	}
	
	public static Inch convert(Unit qty){
		return new Inch(qty.getConversionToCentimeter()*0.393701);
	}

}