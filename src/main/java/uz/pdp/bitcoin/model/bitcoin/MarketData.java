package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketData{

	@JsonProperty("price_usd")
	private double priceUsd;

	@JsonProperty("percent_change_btc_last_1_hour")
	private int percentChangeBtcLast1Hour;

	@JsonProperty("percent_change_eth_last_24_hours")
	private double percentChangeEthLast24Hours;

	@JsonProperty("percent_change_usd_last_1_hour")
	private double percentChangeUsdLast1Hour;

	@JsonProperty("percent_change_btc_last_24_hours")
	private double percentChangeBtcLast24Hours;

	@JsonProperty("price_btc")
	private int priceBtc;

	@JsonProperty("volume_last_24_hours_overstatement_multiple")
	private double volumeLast24HoursOverstatementMultiple;

	@JsonProperty("percent_change_usd_last_24_hours")
	private double percentChangeUsdLast24Hours;

	@JsonProperty("price_eth")
	private double priceEth;

	@JsonProperty("last_trade_at")
	private String lastTradeAt;

	@JsonProperty("real_volume_last_24_hours")
	private double realVolumeLast24Hours;

	@JsonProperty("ohlcv_last_24_hour")
	private OhlcvLast24Hour ohlcvLast24Hour;

	@JsonProperty("percent_change_eth_last_1_hour")
	private double percentChangeEthLast1Hour;

	@JsonProperty("ohlcv_last_1_hour")
	private OhlcvLast1Hour ohlcvLast1Hour;

	@JsonProperty("volume_last_24_hours")
	private double volumeLast24Hours;

	public double getPriceUsd(){
		return priceUsd;
	}

	public int getPercentChangeBtcLast1Hour(){
		return percentChangeBtcLast1Hour;
	}

	public double getPercentChangeEthLast24Hours(){
		return percentChangeEthLast24Hours;
	}

	public double getPercentChangeUsdLast1Hour(){
		return percentChangeUsdLast1Hour;
	}

	public double getPercentChangeBtcLast24Hours(){
		return percentChangeBtcLast24Hours;
	}

	public int getPriceBtc(){
		return priceBtc;
	}

	public double getVolumeLast24HoursOverstatementMultiple(){
		return volumeLast24HoursOverstatementMultiple;
	}

	public double getPercentChangeUsdLast24Hours(){
		return percentChangeUsdLast24Hours;
	}

	public double getPriceEth(){
		return priceEth;
	}

	public String getLastTradeAt(){
		return lastTradeAt;
	}

	public double getRealVolumeLast24Hours(){
		return realVolumeLast24Hours;
	}

	public OhlcvLast24Hour getOhlcvLast24Hour(){
		return ohlcvLast24Hour;
	}

	public double getPercentChangeEthLast1Hour(){
		return percentChangeEthLast1Hour;
	}

	public OhlcvLast1Hour getOhlcvLast1Hour(){
		return ohlcvLast1Hour;
	}

	public double getVolumeLast24Hours(){
		return volumeLast24Hours;
	}
}