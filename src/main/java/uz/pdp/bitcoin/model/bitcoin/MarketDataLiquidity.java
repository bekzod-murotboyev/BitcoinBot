package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketDataLiquidity{

	@JsonProperty("marketcap")
	private Object marketcap;

	@JsonProperty("asset_bid_depth")
	private Object assetBidDepth;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("usd_bid_depth")
	private Object usdBidDepth;

	@JsonProperty("clearing_prices_to_sell")
	private Object clearingPricesToSell;

	public Object getMarketcap(){
		return marketcap;
	}

	public Object getAssetBidDepth(){
		return assetBidDepth;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public Object getUsdBidDepth(){
		return usdBidDepth;
	}

	public Object getClearingPricesToSell(){
		return clearingPricesToSell;
	}
}