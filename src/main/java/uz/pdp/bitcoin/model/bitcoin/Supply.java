package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Supply{

	@JsonProperty("circulating")
	private int circulating;

	@JsonProperty("y_2050_issued_percent")
	private double y2050IssuedPercent;

	@JsonProperty("y_2050")
	private double y2050;

	@JsonProperty("liquid")
	private double liquid;

	@JsonProperty("stock_to_flow")
	private double stockToFlow;

	@JsonProperty("y_plus10_issued_percent")
	private double yPlus10IssuedPercent;

	@JsonProperty("y_plus10")
	private double yPlus10;

	@JsonProperty("annual_inflation_percent")
	private double annualInflationPercent;

	@JsonProperty("supply_revived_90d")
	private double supplyRevived90d;

	public int getCirculating(){
		return circulating;
	}

	public double getY2050IssuedPercent(){
		return y2050IssuedPercent;
	}

	public double getY2050(){
		return y2050;
	}

	public double getLiquid(){
		return liquid;
	}

	public double getStockToFlow(){
		return stockToFlow;
	}

	public double getYPlus10IssuedPercent(){
		return yPlus10IssuedPercent;
	}

	public double getYPlus10(){
		return yPlus10;
	}

	public double getAnnualInflationPercent(){
		return annualInflationPercent;
	}

	public double getSupplyRevived90d(){
		return supplyRevived90d;
	}
}