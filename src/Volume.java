
public abstract class Volume {

	public abstract double getConversionToTeaspoon();
	
	public boolean checkEquality(Volume q1){
		return this.getConversionToTeaspoon()==q1.getConversionToTeaspoon();
	}
	
	/*public Volume add(Volume v1){
		this.convertFrom(new Volume(this.getConversionToTeaspoon()+v1.getConversionToTeaspoon()));
		
	}*/
}
