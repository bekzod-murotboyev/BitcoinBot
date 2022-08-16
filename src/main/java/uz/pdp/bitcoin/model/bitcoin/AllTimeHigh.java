package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class AllTimeHigh{

	@JsonProperty("percent_down")
	private double percentDown;

	@JsonProperty("at")
	private String at;

	@JsonProperty("price")
	private double price;

	@JsonProperty("days_since")
	private int daysSince;

	@JsonProperty("breakeven_multiple")
	private double breakevenMultiple;

	public double getPercentDown(){
		return percentDown;
	}

	public String getAt(){
		return at;
	}

	public double getPrice(){
		return price;
	}

	public int getDaysSince(){
		return daysSince;
	}

	public double getBreakevenMultiple(){
		return breakevenMultiple;
	}
}