package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MiningStats{

	@JsonProperty("hash_rate")
	private double hashRate;

	@JsonProperty("attack_appeal")
	private Object attackAppeal;

	@JsonProperty("network_hash_rate")
	private String networkHashRate;

	@JsonProperty("mining_revenue_from_fees_percent_last_24_hours")
	private double miningRevenueFromFeesPercentLast24Hours;

	@JsonProperty("mining_revenue_total")
	private double miningRevenueTotal;

	@JsonProperty("hash_rate_30d_average")
	private double hashRate30dAverage;

	@JsonProperty("available_on_nicehash_percent")
	private double availableOnNicehashPercent;

	@JsonProperty("average_difficulty")
	private double averageDifficulty;

	@JsonProperty("24_hours_attack_cost")
	private Object jsonMember24HoursAttackCost;

	@JsonProperty("mining_revenue_per_hash_native_units")
	private double miningRevenuePerHashNativeUnits;

	@JsonProperty("mining_revenue_per_hash_per_second_native_units")
	private double miningRevenuePerHashPerSecondNativeUnits;

	@JsonProperty("mining_algo")
	private String miningAlgo;

	@JsonProperty("mining_revenue_per_hash_usd")
	private double miningRevenuePerHashUsd;

	@JsonProperty("mining_revenue_per_hash_per_second_usd")
	private double miningRevenuePerHashPerSecondUsd;

	@JsonProperty("mining_revenue_usd")
	private Object miningRevenueUsd;

	@JsonProperty("1_hour_attack_cost")
	private Object jsonMember1HourAttackCost;

	@JsonProperty("mining_revenue_native")
	private double miningRevenueNative;

	public double getHashRate(){
		return hashRate;
	}

	public Object getAttackAppeal(){
		return attackAppeal;
	}

	public String getNetworkHashRate(){
		return networkHashRate;
	}

	public double getMiningRevenueFromFeesPercentLast24Hours(){
		return miningRevenueFromFeesPercentLast24Hours;
	}

	public double getMiningRevenueTotal(){
		return miningRevenueTotal;
	}

	public double getHashRate30dAverage(){
		return hashRate30dAverage;
	}

	public double getAvailableOnNicehashPercent(){
		return availableOnNicehashPercent;
	}

	public double getAverageDifficulty(){
		return averageDifficulty;
	}

	public Object getJsonMember24HoursAttackCost(){
		return jsonMember24HoursAttackCost;
	}

	public double getMiningRevenuePerHashNativeUnits(){
		return miningRevenuePerHashNativeUnits;
	}

	public double getMiningRevenuePerHashPerSecondNativeUnits(){
		return miningRevenuePerHashPerSecondNativeUnits;
	}

	public String getMiningAlgo(){
		return miningAlgo;
	}

	public double getMiningRevenuePerHashUsd(){
		return miningRevenuePerHashUsd;
	}

	public double getMiningRevenuePerHashPerSecondUsd(){
		return miningRevenuePerHashPerSecondUsd;
	}

	public Object getMiningRevenueUsd(){
		return miningRevenueUsd;
	}

	public Object getJsonMember1HourAttackCost(){
		return jsonMember1HourAttackCost;
	}

	public double getMiningRevenueNative(){
		return miningRevenueNative;
	}
}