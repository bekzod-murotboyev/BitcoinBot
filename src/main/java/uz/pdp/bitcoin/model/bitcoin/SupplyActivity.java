package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplyActivity{

	@JsonProperty("outstanding")
	private double outstanding;

	@JsonProperty("supply_revived_2y")
	private double supplyRevived2y;

	@JsonProperty("supply_revived_30d")
	private double supplyRevived30d;

	@JsonProperty("supply_active_10y")
	private double supplyActive10y;

	@JsonProperty("supply_revived_3y")
	private double supplyRevived3y;

	@JsonProperty("supply_revived_4y")
	private double supplyRevived4y;

	@JsonProperty("supply_revived_5y")
	private double supplyRevived5y;

	@JsonProperty("supply_active_1y_percent")
	private double supplyActive1yPercent;

	@JsonProperty("supply_active_5y")
	private double supplyActive5y;

	@JsonProperty("supply_active_30d")
	private double supplyActive30d;

	@JsonProperty("supply_active_4y")
	private double supplyActive4y;

	@JsonProperty("supply_active_3y")
	private double supplyActive3y;

	@JsonProperty("supply_revived_1y")
	private double supplyRevived1y;

	@JsonProperty("supply_revived_7d")
	private double supplyRevived7d;

	@JsonProperty("supply_revived_90d")
	private double supplyRevived90d;

	@JsonProperty("supply_active_90d")
	private double supplyActive90d;

	@JsonProperty("supply_active_7d")
	private double supplyActive7d;

	@JsonProperty("supply_active_ever")
	private double supplyActiveEver;

	@JsonProperty("supply_active_2y")
	private double supplyActive2y;

	@JsonProperty("supply_active_1y")
	private double supplyActive1y;

	@JsonProperty("supply_active_180d")
	private double supplyActive180d;

	@JsonProperty("supply_active_1d")
	private double supplyActive1d;

	public double getOutstanding(){
		return outstanding;
	}

	public double getSupplyRevived2y(){
		return supplyRevived2y;
	}

	public double getSupplyRevived30d(){
		return supplyRevived30d;
	}

	public double getSupplyActive10y(){
		return supplyActive10y;
	}

	public double getSupplyRevived3y(){
		return supplyRevived3y;
	}

	public double getSupplyRevived4y(){
		return supplyRevived4y;
	}

	public double getSupplyRevived5y(){
		return supplyRevived5y;
	}

	public double getSupplyActive1yPercent(){
		return supplyActive1yPercent;
	}

	public double getSupplyActive5y(){
		return supplyActive5y;
	}

	public double getSupplyActive30d(){
		return supplyActive30d;
	}

	public double getSupplyActive4y(){
		return supplyActive4y;
	}

	public double getSupplyActive3y(){
		return supplyActive3y;
	}

	public double getSupplyRevived1y(){
		return supplyRevived1y;
	}

	public double getSupplyRevived7d(){
		return supplyRevived7d;
	}

	public double getSupplyRevived90d(){
		return supplyRevived90d;
	}

	public double getSupplyActive90d(){
		return supplyActive90d;
	}

	public double getSupplyActive7d(){
		return supplyActive7d;
	}

	public double getSupplyActiveEver(){
		return supplyActiveEver;
	}

	public double getSupplyActive2y(){
		return supplyActive2y;
	}

	public double getSupplyActive1y(){
		return supplyActive1y;
	}

	public double getSupplyActive180d(){
		return supplyActive180d;
	}

	public double getSupplyActive1d(){
		return supplyActive1d;
	}
}