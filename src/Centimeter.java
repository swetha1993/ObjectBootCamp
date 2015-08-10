
public class Centimeter extends Unit {
	
	public Centimeter(double qty) {
		super(qty);
		
	}

	@Override
	public double getConversionToCentimeter() {
		return qty;
	}
	
	public static Centimeter convert(Unit qty){
		return new Centimeter(qty.getConversionToCentimeter());
	}
	
	public Centimeter add(Unit qty){
		Centimeter cm=new Centimeter(this.getConversionToCentimeter()+qty.getConversionToCentimeter());
		return cm;
	}
}
