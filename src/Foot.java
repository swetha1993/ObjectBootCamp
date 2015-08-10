
public class Foot extends Unit{

	
	public Foot(double qty) {
		super(qty);
		
	}

	@Override
	public double getConversionToCentimeter() {
		return qty*12*2.54;
	}
	
	public static Foot convert(Unit qty){
		return new Foot(qty.getConversionToCentimeter()*0.0328084);
	}
	
	public Foot add(Unit qty){
		Centimeter cm=new Centimeter(this.getConversionToCentimeter()+qty.getConversionToCentimeter());
		return Foot.convert(cm);
	}

}
