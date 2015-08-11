
public abstract class Length {

	protected double qty;
	
	public Length(double qty) {
		this.qty = qty;
	}

	public abstract double getConversionToCentimeter();
	
	public boolean checkEquality(Length qty1){
		return qty1.getConversionToCentimeter()==this.getConversionToCentimeter();
	}
	
	public abstract double getconv_fc();
	
	public abstract Length clone(double val);
	
	public Length convert(Length l1){
		return this.clone(l1.getConversionToCentimeter()/this.getconv_fc());
	}
	
	public Length add(Length l1){
		return this.clone((this.getConversionToCentimeter()+l1.getConversionToCentimeter())/this.getconv_fc());
	}
}
