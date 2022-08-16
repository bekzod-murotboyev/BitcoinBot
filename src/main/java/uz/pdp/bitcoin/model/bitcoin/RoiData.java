package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class RoiData{

	@JsonProperty("percent_change_last_1_week")
	private double percentChangeLast1Week;

	@JsonProperty("percent_change_btc_last_1_month")
	private int percentChangeBtcLast1Month;

	@JsonProperty("percent_change_last_1_month")
	private double percentChangeLast1Month;

	@JsonProperty("percent_change_year_to_date")
	private double percentChangeYearToDate;

	@JsonProperty("percent_change_last_1_year")
	private double percentChangeLast1Year;

	@JsonProperty("percent_change_btc_last_1_week")
	private int percentChangeBtcLast1Week;

	@JsonProperty("percent_change_btc_last_1_year")
	private int percentChangeBtcLast1Year;

	@JsonProperty("percent_change_eth_last_1_week")
	private double percentChangeEthLast1Week;

	@JsonProperty("percent_change_month_to_date")
	private double percentChangeMonthToDate;

	@JsonProperty("percent_change_btc_last_3_months")
	private int percentChangeBtcLast3Months;

	@JsonProperty("percent_change_eth_last_3_months")
	private double percentChangeEthLast3Months;

	@JsonProperty("percent_change_last_3_months")
	private double percentChangeLast3Months;

	@JsonProperty("percent_change_eth_last_1_year")
	private double percentChangeEthLast1Year;

	@JsonProperty("percent_change_eth_last_1_month")
	private double percentChangeEthLast1Month;

	@JsonProperty("percent_change_quarter_to_date")
	private double percentChangeQuarterToDate;

	public double getPercentChangeLast1Week(){
		return percentChangeLast1Week;
	}

	public int getPercentChangeBtcLast1Month(){
		return percentChangeBtcLast1Month;
	}

	public double getPercentChangeLast1Month(){
		return percentChangeLast1Month;
	}

	public double getPercentChangeYearToDate(){
		return percentChangeYearToDate;
	}

	public double getPercentChangeLast1Year(){
		return percentChangeLast1Year;
	}

	public int getPercentChangeBtcLast1Week(){
		return percentChangeBtcLast1Week;
	}

	public int getPercentChangeBtcLast1Year(){
		return percentChangeBtcLast1Year;
	}

	public double getPercentChangeEthLast1Week(){
		return percentChangeEthLast1Week;
	}

	public double getPercentChangeMonthToDate(){
		return percentChangeMonthToDate;
	}

	public int getPercentChangeBtcLast3Months(){
		return percentChangeBtcLast3Months;
	}

	public double getPercentChangeEthLast3Months(){
		return percentChangeEthLast3Months;
	}

	public double getPercentChangeLast3Months(){
		return percentChangeLast3Months;
	}

	public double getPercentChangeEthLast1Year(){
		return percentChangeEthLast1Year;
	}

	public double getPercentChangeEthLast1Month(){
		return percentChangeEthLast1Month;
	}

	public double getPercentChangeQuarterToDate(){
		return percentChangeQuarterToDate;
	}
}