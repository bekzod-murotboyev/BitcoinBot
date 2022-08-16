package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockchainStats24Hours{

	@JsonProperty("adjusted_transaction_volume")
	private double adjustedTransactionVolume;

	@JsonProperty("count_of_tx")
	private int countOfTx;

	@JsonProperty("transaction_volume")
	private double transactionVolume;

	@JsonProperty("new_issuance")
	private double newIssuance;

	@JsonProperty("median_tx_value")
	private double medianTxValue;

	@JsonProperty("average_difficulty")
	private double averageDifficulty;

	@JsonProperty("count_of_blocks_added")
	private int countOfBlocksAdded;

	@JsonProperty("adjusted_nvt")
	private double adjustedNvt;

	@JsonProperty("median_tx_fee")
	private double medianTxFee;

	@JsonProperty("count_of_payments")
	private int countOfPayments;

	@JsonProperty("kilobytes_added")
	private Object kilobytesAdded;

	@JsonProperty("count_of_active_addresses")
	private int countOfActiveAddresses;

	public double getAdjustedTransactionVolume(){
		return adjustedTransactionVolume;
	}

	public int getCountOfTx(){
		return countOfTx;
	}

	public double getTransactionVolume(){
		return transactionVolume;
	}

	public double getNewIssuance(){
		return newIssuance;
	}

	public double getMedianTxValue(){
		return medianTxValue;
	}

	public double getAverageDifficulty(){
		return averageDifficulty;
	}

	public int getCountOfBlocksAdded(){
		return countOfBlocksAdded;
	}

	public double getAdjustedNvt(){
		return adjustedNvt;
	}

	public double getMedianTxFee(){
		return medianTxFee;
	}

	public int getCountOfPayments(){
		return countOfPayments;
	}

	public Object getKilobytesAdded(){
		return kilobytesAdded;
	}

	public int getCountOfActiveAddresses(){
		return countOfActiveAddresses;
	}
}