package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CycleLow{

	@JsonProperty("at")
	private String at;

	@JsonProperty("price")
	private double price;

	@JsonProperty("percent_up")
	private double percentUp;

	@JsonProperty("days_since")
	private int daysSince;

	public String getAt(){
		return at;
	}

	public double getPrice(){
		return price;
	}

	public double getPercentUp(){
		return percentUp;
	}

	public int getDaysSince(){
		return daysSince;
	}
}