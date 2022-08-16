package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SharpeRatios{

	@JsonProperty("last_1_year")
	private double last1Year;

	@JsonProperty("last_90_days")
	private double last90Days;

	@JsonProperty("last_30_days")
	private double last30Days;

	@JsonProperty("last_3_years")
	private double last3Years;

	public double getLast1Year(){
		return last1Year;
	}

	public double getLast90Days(){
		return last90Days;
	}

	public double getLast30Days(){
		return last30Days;
	}

	public double getLast3Years(){
		return last3Years;
	}
}