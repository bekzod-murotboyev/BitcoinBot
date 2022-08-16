package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class RiskMetrics{

	@JsonProperty("volatility_stats")
	private VolatilityStats volatilityStats;

	@JsonProperty("sharpe_ratios")
	private SharpeRatios sharpeRatios;

	public VolatilityStats getVolatilityStats(){
		return volatilityStats;
	}

	public SharpeRatios getSharpeRatios(){
		return sharpeRatios;
	}
}