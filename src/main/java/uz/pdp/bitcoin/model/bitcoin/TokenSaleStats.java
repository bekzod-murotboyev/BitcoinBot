package uz.pdp.bitcoin.model.bitcoin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenSaleStats{

	@JsonProperty("sale_proceeds_usd")
	private Object saleProceedsUsd;

	@JsonProperty("sale_end_date")
	private Object saleEndDate;

	@JsonProperty("roi_since_sale_btc_percent")
	private Object roiSinceSaleBtcPercent;

	@JsonProperty("roi_since_sale_usd_percent")
	private Object roiSinceSaleUsdPercent;

	@JsonProperty("roi_since_sale_eth_percent")
	private Object roiSinceSaleEthPercent;

	@JsonProperty("sale_start_date")
	private Object saleStartDate;

	public Object getSaleProceedsUsd(){
		return saleProceedsUsd;
	}

	public Object getSaleEndDate(){
		return saleEndDate;
	}

	public Object getRoiSinceSaleBtcPercent(){
		return roiSinceSaleBtcPercent;
	}

	public Object getRoiSinceSaleUsdPercent(){
		return roiSinceSaleUsdPercent;
	}

	public Object getRoiSinceSaleEthPercent(){
		return roiSinceSaleEthPercent;
	}

	public Object getSaleStartDate(){
		return saleStartDate;
	}
}