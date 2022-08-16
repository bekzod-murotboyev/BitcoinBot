package uz.pdp.bitcoin.model.bitcoin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VolatilityStats{

	@JsonProperty("volatility_last_1_year")
	private double volatilityLast1Year;

	@JsonProperty("volatility_last_90_days")
	private double volatilityLast90Days;

	@JsonProperty("volatility_last_30_days")
	private double volatilityLast30Days;

	@JsonProperty("volatility_last_3_years")
	private double volatilityLast3Years;

	public double getVolatilityLast1Year(){
		return volatilityLast1Year;
	}

	public double getVolatilityLast90Days(){
		return volatilityLast90Days;
	}

	public double getVolatilityLast30Days(){
		return volatilityLast30Days;
	}

	public double getVolatilityLast3Years(){
		return volatilityLast3Years;
	}
}