package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MinerFlows{

	@JsonProperty("supply_1hop_miners_native_units")
	private double supply1hopMinersNativeUnits;

	@JsonProperty("supply_miners_native_units")
	private double supplyMinersNativeUnits;

	@JsonProperty("supply_1hop_miners_usd")
	private double supply1hopMinersUsd;

	@JsonProperty("supply_miners_usd")
	private double supplyMinersUsd;

	public double getSupply1hopMinersNativeUnits(){
		return supply1hopMinersNativeUnits;
	}

	public double getSupplyMinersNativeUnits(){
		return supplyMinersNativeUnits;
	}

	public double getSupply1hopMinersUsd(){
		return supply1hopMinersUsd;
	}

	public double getSupplyMinersUsd(){
		return supplyMinersUsd;
	}
}