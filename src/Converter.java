
public class Converter {

	public Meter toMeter(Unit qty){
		return new Meter(qty.getConversionToCentimeter()*100);
	}
	/*
	public Foot toFoot(){
		return new Foot(this.getConversionToCentimeter()*0.0328084);
	}
	
	public Inch toInch(){
		return new Inch(this.getConversionToCentimeter()*0.393701);
	}
	
	public yard toYard(){
		return new yard(this.getConversionToCentimeter()*0.0109361);
	}*/
}
