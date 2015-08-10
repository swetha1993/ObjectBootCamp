
public class yard extends Unit{

	public yard(double qty) {
		super(qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*91.44;
	}

	public static yard convert(Unit qty){
		return new yard(qty.getConversionToCentimeter()*0.0109361);
	}
	
	public yard add(Unit qty){
		Centimeter cm=new Centimeter(this.getConversionToCentimeter()+qty.getConversionToCentimeter());
		return yard.convert(cm);
	}
}
