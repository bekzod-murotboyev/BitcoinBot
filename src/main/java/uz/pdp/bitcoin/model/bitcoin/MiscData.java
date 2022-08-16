package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MiscData{

	@JsonProperty("asset_created_at")
	private Object assetCreatedAt;

	@JsonProperty("vladimir_club_cost")
	private Object vladimirClubCost;

	@JsonProperty("sectors")
	private List<String> sectors;

	@JsonProperty("btc_y2050_normalized_supply_price_usd")
	private Object btcY2050NormalizedSupplyPriceUsd;

	@JsonProperty("private_market_price_usd")
	private Object privateMarketPriceUsd;

	@JsonProperty("asset_age_days")
	private Object assetAgeDays;

	@JsonProperty("btc_current_normalized_supply_price_usd")
	private Object btcCurrentNormalizedSupplyPriceUsd;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("tags")
	private Object tags;

	public Object getAssetCreatedAt(){
		return assetCreatedAt;
	}

	public Object getVladimirClubCost(){
		return vladimirClubCost;
	}

	public List<String> getSectors(){
		return sectors;
	}

	public Object getBtcY2050NormalizedSupplyPriceUsd(){
		return btcY2050NormalizedSupplyPriceUsd;
	}

	public Object getPrivateMarketPriceUsd(){
		return privateMarketPriceUsd;
	}

	public Object getAssetAgeDays(){
		return assetAgeDays;
	}

	public Object getBtcCurrentNormalizedSupplyPriceUsd(){
		return btcCurrentNormalizedSupplyPriceUsd;
	}

	public List<String> getCategories(){
		return categories;
	}

	public Object getTags(){
		return tags;
	}
}