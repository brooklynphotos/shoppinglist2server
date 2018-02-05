package photos.brooklyn.shoppinglist.domain;

public class Price {
	public Price(double value, String unit) {
		super();
		this.value = value;
		this.unit = unit;
	}
	private double value;
	private String unit;
	public Price() {}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
