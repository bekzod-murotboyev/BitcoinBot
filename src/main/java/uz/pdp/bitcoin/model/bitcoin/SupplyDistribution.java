package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplyDistribution{

	@JsonProperty("supply_in_addresses_balance_greater_10k_native_units")
	private double supplyInAddressesBalanceGreater10kNativeUnits;

	@JsonProperty("supply_in_top_10_percent_addresses")
	private double supplyInTop10PercentAddresses;

	@JsonProperty("supply_in_addresses_balance_greater_0_01_native_units")
	private double supplyInAddressesBalanceGreater001NativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_1_native_units")
	private double supplyInAddressesBalanceGreater1NativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_100_native_units")
	private double supplyInAddressesBalanceGreater100NativeUnits;

	@JsonProperty("supply_in_top_1_percent_addresses")
	private double supplyInTop1PercentAddresses;

	@JsonProperty("supply_in_addresses_balance_greater_10k_usd")
	private double supplyInAddressesBalanceGreater10kUsd;

	@JsonProperty("supply_in_addresses_balance_greater_1m_usd")
	private double supplyInAddressesBalanceGreater1mUsd;

	@JsonProperty("supply_in_addresses_balance_greater_100_usd")
	private double supplyInAddressesBalanceGreater100Usd;

	@JsonProperty("supply_in_addresses_balance_greater_100k_usd")
	private double supplyInAddressesBalanceGreater100kUsd;

	@JsonProperty("supply_in_utxo_in_loss")
	private double supplyInUtxoInLoss;

	@JsonProperty("supply_in_addresses_balance_greater_10m_usd")
	private double supplyInAddressesBalanceGreater10mUsd;

	@JsonProperty("supply_in_addresses_balance_greater_1_usd")
	private double supplyInAddressesBalanceGreater1Usd;

	@JsonProperty("supply_in_addresses_balance_greater_0_1_native_units")
	private double supplyInAddressesBalanceGreater01NativeUnits;

	@JsonProperty("supply_in_contracts_native_units")
	private Object supplyInContractsNativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_0_001_native_units")
	private double supplyInAddressesBalanceGreater0001NativeUnits;

	@JsonProperty("supply_in_contracts_usd")
	private Object supplyInContractsUsd;

	@JsonProperty("supply_in_addresses_balance_greater_10_native_units")
	private double supplyInAddressesBalanceGreater10NativeUnits;

	@JsonProperty("supply_in_utxo_in_profit")
	private double supplyInUtxoInProfit;

	@JsonProperty("supply_shielded")
	private Object supplyShielded;

	@JsonProperty("supply_in_top_100_addresses")
	private double supplyInTop100Addresses;

	@JsonProperty("supply_in_addresses_balance_greater_1k_native_units")
	private double supplyInAddressesBalanceGreater1kNativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_100k_native_units")
	private double supplyInAddressesBalanceGreater100kNativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_1k_usd")
	private double supplyInAddressesBalanceGreater1kUsd;

	@JsonProperty("supply_in_addresses_balance_greater_1m_native_units")
	private int supplyInAddressesBalanceGreater1mNativeUnits;

	@JsonProperty("supply_in_addresses_balance_greater_10_usd")
	private double supplyInAddressesBalanceGreater10Usd;

	public double getSupplyInAddressesBalanceGreater10kNativeUnits(){
		return supplyInAddressesBalanceGreater10kNativeUnits;
	}

	public double getSupplyInTop10PercentAddresses(){
		return supplyInTop10PercentAddresses;
	}

	public double getSupplyInAddressesBalanceGreater001NativeUnits(){
		return supplyInAddressesBalanceGreater001NativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater1NativeUnits(){
		return supplyInAddressesBalanceGreater1NativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater100NativeUnits(){
		return supplyInAddressesBalanceGreater100NativeUnits;
	}

	public double getSupplyInTop1PercentAddresses(){
		return supplyInTop1PercentAddresses;
	}

	public double getSupplyInAddressesBalanceGreater10kUsd(){
		return supplyInAddressesBalanceGreater10kUsd;
	}

	public double getSupplyInAddressesBalanceGreater1mUsd(){
		return supplyInAddressesBalanceGreater1mUsd;
	}

	public double getSupplyInAddressesBalanceGreater100Usd(){
		return supplyInAddressesBalanceGreater100Usd;
	}

	public double getSupplyInAddressesBalanceGreater100kUsd(){
		return supplyInAddressesBalanceGreater100kUsd;
	}

	public double getSupplyInUtxoInLoss(){
		return supplyInUtxoInLoss;
	}

	public double getSupplyInAddressesBalanceGreater10mUsd(){
		return supplyInAddressesBalanceGreater10mUsd;
	}

	public double getSupplyInAddressesBalanceGreater1Usd(){
		return supplyInAddressesBalanceGreater1Usd;
	}

	public double getSupplyInAddressesBalanceGreater01NativeUnits(){
		return supplyInAddressesBalanceGreater01NativeUnits;
	}

	public Object getSupplyInContractsNativeUnits(){
		return supplyInContractsNativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater0001NativeUnits(){
		return supplyInAddressesBalanceGreater0001NativeUnits;
	}

	public Object getSupplyInContractsUsd(){
		return supplyInContractsUsd;
	}

	public double getSupplyInAddressesBalanceGreater10NativeUnits(){
		return supplyInAddressesBalanceGreater10NativeUnits;
	}

	public double getSupplyInUtxoInProfit(){
		return supplyInUtxoInProfit;
	}

	public Object getSupplyShielded(){
		return supplyShielded;
	}

	public double getSupplyInTop100Addresses(){
		return supplyInTop100Addresses;
	}

	public double getSupplyInAddressesBalanceGreater1kNativeUnits(){
		return supplyInAddressesBalanceGreater1kNativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater100kNativeUnits(){
		return supplyInAddressesBalanceGreater100kNativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater1kUsd(){
		return supplyInAddressesBalanceGreater1kUsd;
	}

	public int getSupplyInAddressesBalanceGreater1mNativeUnits(){
		return supplyInAddressesBalanceGreater1mNativeUnits;
	}

	public double getSupplyInAddressesBalanceGreater10Usd(){
		return supplyInAddressesBalanceGreater10Usd;
	}
}