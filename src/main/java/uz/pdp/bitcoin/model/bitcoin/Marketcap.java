package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Marketcap{

	@JsonProperty("outstanding_marketcap_usd")
	private double outstandingMarketcapUsd;

	@JsonProperty("liquid_marketcap_usd")
	private double liquidMarketcapUsd;

	@JsonProperty("current_marketcap_usd")
	private double currentMarketcapUsd;

	@JsonProperty("marketcap_dominance_percent")
	private double marketcapDominancePercent;

	@JsonProperty("realized_marketcap_usd")
	private double realizedMarketcapUsd;

	@JsonProperty("rank")
	private int rank;

	@JsonProperty("y_2050_marketcap_usd")
	private double y2050MarketcapUsd;

	@JsonProperty("y_plus10_marketcap_usd")
	private double yPlus10MarketcapUsd;

	@JsonProperty("volume_turnover_last_24_hours_percent")
	private double volumeTurnoverLast24HoursPercent;

	public double getOutstandingMarketcapUsd(){
		return outstandingMarketcapUsd;
	}

	public double getLiquidMarketcapUsd(){
		return liquidMarketcapUsd;
	}

	public double getCurrentMarketcapUsd(){
		return currentMarketcapUsd;
	}

	public double getMarketcapDominancePercent(){
		return marketcapDominancePercent;
	}

	public double getRealizedMarketcapUsd(){
		return realizedMarketcapUsd;
	}

	public int getRank(){
		return rank;
	}

	public double getY2050MarketcapUsd(){
		return y2050MarketcapUsd;
	}

	public double getYPlus10MarketcapUsd(){
		return yPlus10MarketcapUsd;
	}

	public double getVolumeTurnoverLast24HoursPercent(){
		return volumeTurnoverLast24HoursPercent;
	}
}