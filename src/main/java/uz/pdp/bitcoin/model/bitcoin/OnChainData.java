package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OnChainData{

	@JsonProperty("txn_erc20_count_last_24_hours")
	private Object txnErc20CountLast24Hours;

	@JsonProperty("hash_rate")
	private double hashRate;

	@JsonProperty("txn_erc721_count_last_24_hours")
	private Object txnErc721CountLast24Hours;

	@JsonProperty("realized_marketcap_usd")
	private double realizedMarketcapUsd;

	@JsonProperty("adjusted_rvt")
	private double adjustedRvt;

	@JsonProperty("average_transfer_value_usd")
	private double averageTransferValueUsd;

	@JsonProperty("addresses_balance_greater_10_usd_count")
	private int addressesBalanceGreater10UsdCount;

	@JsonProperty("block_height")
	private int blockHeight;

	@JsonProperty("adjusted_nvt_90d_moving_average")
	private double adjustedNvt90dMovingAverage;

	@JsonProperty("adjusted_nvt")
	private double adjustedNvt;

	@JsonProperty("average_fee_native_units")
	private double averageFeeNativeUnits;

	@JsonProperty("transfer_count_last_24_hours")
	private int transferCountLast24Hours;

	@JsonProperty("average_transfer_value_native_units")
	private double averageTransferValueNativeUnits;

	@JsonProperty("txn_contracts_count_last_24_hours")
	private Object txnContractsCountLast24Hours;

	@JsonProperty("addresses_balance_greater_1m_usd_count")
	private int addressesBalanceGreater1mUsdCount;

	@JsonProperty("value_weighted_average_utxo_age")
	private double valueWeightedAverageUtxoAge;

	@JsonProperty("addresses_balance_greater_1_native_units_count")
	private int addressesBalanceGreater1NativeUnitsCount;

	@JsonProperty("utxo_in_profit_count")
	private int utxoInProfitCount;

	@JsonProperty("average_txn_gas_used")
	private Object averageTxnGasUsed;

	@JsonProperty("issuance_rate")
	private double issuanceRate;

	@JsonProperty("addresses_balance_greater_0_01_native_units_count")
	private int addressesBalanceGreater001NativeUnitsCount;

	@JsonProperty("average_block_interval")
	private double averageBlockInterval;

	@JsonProperty("addresses_balance_greater_10k_usd_count")
	private int addressesBalanceGreater10kUsdCount;

	@JsonProperty("addresses_balance_greater_10m_usd_count")
	private int addressesBalanceGreater10mUsdCount;

	@JsonProperty("txn_per_second_count")
	private double txnPerSecondCount;

	@JsonProperty("addresses_balance_greater_10k_native_units_count")
	private int addressesBalanceGreater10kNativeUnitsCount;

	@JsonProperty("addresses_balance_greater_100_usd_count")
	private int addressesBalanceGreater100UsdCount;

	@JsonProperty("new_issuance")
	private double newIssuance;

	@JsonProperty("txn_token_count_last_24_hours")
	private Object txnTokenCountLast24Hours;

	@JsonProperty("average_block_weight")
	private double averageBlockWeight;

	@JsonProperty("txn_gas_limit_last_24_hours")
	private Object txnGasLimitLast24Hours;

	@JsonProperty("addresses_balance_greater_10_native_units_count")
	private int addressesBalanceGreater10NativeUnitsCount;

	@JsonProperty("average_block_gas_limit")
	private Object averageBlockGasLimit;

	@JsonProperty("transfer_erc721_count_last_24_hours")
	private Object transferErc721CountLast24Hours;

	@JsonProperty("txn_count_last_24_hours")
	private int txnCountLast24Hours;

	@JsonProperty("txn_contracts_calls_count_last_24_hours")
	private Object txnContractsCallsCountLast24Hours;

	@JsonProperty("uncle_rewards_last_24_hours_usd")
	private Object uncleRewardsLast24HoursUsd;

	@JsonProperty("issuance_total_usd")
	private double issuanceTotalUsd;

	@JsonProperty("uncle_rewards_last_24_hours_native_units")
	private Object uncleRewardsLast24HoursNativeUnits;

	@JsonProperty("txn_contracts_destruction_count_last_24_hours")
	private Object txnContractsDestructionCountLast24Hours;

	@JsonProperty("total_fees_last_24_hours")
	private double totalFeesLast24Hours;

	@JsonProperty("adjusted_txn_volume_last_24_hours_native_units")
	private double adjustedTxnVolumeLast24HoursNativeUnits;

	@JsonProperty("active_addresses_received_count")
	private int activeAddressesReceivedCount;

	@JsonProperty("addresses_balance_greater_1_usd_count")
	private int addressesBalanceGreater1UsdCount;

	@JsonProperty("median_fee_native_units")
	private double medianFeeNativeUnits;

	@JsonProperty("addresses_count")
	private int addressesCount;

	@JsonProperty("block_weight")
	private int blockWeight;

	@JsonProperty("txn_gas_used_last_24_hours")
	private Object txnGasUsedLast24Hours;

	@JsonProperty("txn_contracts_calls_success_count_last_24_hours")
	private Object txnContractsCallsSuccessCountLast24Hours;

	@JsonProperty("utxo_in_loss_count")
	private int utxoInLossCount;

	@JsonProperty("average_txn_gas_limit")
	private Object averageTxnGasLimit;

	@JsonProperty("average_utxo_age")
	private double averageUtxoAge;

	@JsonProperty("median_transfer_value_native_units")
	private double medianTransferValueNativeUnits;

	@JsonProperty("addresses_balance_greater_1k_usd_count")
	private int addressesBalanceGreater1kUsdCount;

	@JsonProperty("addresses_balance_greater_0_1_native_units_count")
	private int addressesBalanceGreater01NativeUnitsCount;

	@JsonProperty("adjusted_rvt_90d_moving_average")
	private double adjustedRvt90dMovingAverage;

	@JsonProperty("txn_contracts_creation_count_last_24_hours")
	private Object txnContractsCreationCountLast24Hours;

	@JsonProperty("active_addresses_sent_count")
	private int activeAddressesSentCount;

	@JsonProperty("issuance_rate_daily")
	private double issuanceRateDaily;

	@JsonProperty("addresses_balance_greater_0_001_native_units_count")
	private int addressesBalanceGreater0001NativeUnitsCount;

	@JsonProperty("addresses_balance_greater_100k_usd_count")
	private int addressesBalanceGreater100kUsdCount;

	@JsonProperty("uncle_blocks_count_last_24_hours")
	private Object uncleBlocksCountLast24Hours;

	@JsonProperty("median_transfer_value_usd")
	private double medianTransferValueUsd;

	@JsonProperty("average_fee_usd")
	private double averageFeeUsd;

	@JsonProperty("issuance_total_native_units")
	private double issuanceTotalNativeUnits;

	@JsonProperty("issuance_last_24_hours_native_units")
	private double issuanceLast24HoursNativeUnits;

	@JsonProperty("transfer_erc_20_count_last_24_hours")
	private Object transferErc20CountLast24Hours;

	@JsonProperty("adjusted_txn_volume_last_24_hours_usd")
	private double adjustedTxnVolumeLast24HoursUsd;

	@JsonProperty("active_addresses")
	private int activeAddresses;

	@JsonProperty("utxo_count_last_24_hours")
	private int utxoCountLast24Hours;

	@JsonProperty("median_utxo_age")
	private int medianUtxoAge;

	@JsonProperty("blocks_added_last_24_hours")
	private int blocksAddedLast24Hours;

	@JsonProperty("median_fee_usd")
	private double medianFeeUsd;

	@JsonProperty("addresses_balance_greater_100_native_units_count")
	private int addressesBalanceGreater100NativeUnitsCount;

	@JsonProperty("mining_revenue_from_uncle_blocks_percent_last_24_hours")
	private Object miningRevenueFromUncleBlocksPercentLast24Hours;

	@JsonProperty("txn_volume_last_24_hours_native_units")
	private double txnVolumeLast24HoursNativeUnits;

	@JsonProperty("addresses_balance_greater_1m_native_units_count")
	private int addressesBalanceGreater1mNativeUnitsCount;

	@JsonProperty("block_size_bytes_total")
	private int blockSizeBytesTotal;

	@JsonProperty("addresses_balance_greater_100k_native_units_count")
	private int addressesBalanceGreater100kNativeUnitsCount;

	@JsonProperty("addresses_balance_greater_1k_native_units_count")
	private int addressesBalanceGreater1kNativeUnitsCount;

	@JsonProperty("block_size_bytes_average")
	private double blockSizeBytesAverage;

	@JsonProperty("total_fees_last_24_hours_usd")
	private double totalFeesLast24HoursUsd;

	@JsonProperty("txn_volume_last_24_hours_usd")
	private double txnVolumeLast24HoursUsd;

	public Object getTxnErc20CountLast24Hours(){
		return txnErc20CountLast24Hours;
	}

	public double getHashRate(){
		return hashRate;
	}

	public Object getTxnErc721CountLast24Hours(){
		return txnErc721CountLast24Hours;
	}

	public double getRealizedMarketcapUsd(){
		return realizedMarketcapUsd;
	}

	public double getAdjustedRvt(){
		return adjustedRvt;
	}

	public double getAverageTransferValueUsd(){
		return averageTransferValueUsd;
	}

	public int getAddressesBalanceGreater10UsdCount(){
		return addressesBalanceGreater10UsdCount;
	}

	public int getBlockHeight(){
		return blockHeight;
	}

	public double getAdjustedNvt90dMovingAverage(){
		return adjustedNvt90dMovingAverage;
	}

	public double getAdjustedNvt(){
		return adjustedNvt;
	}

	public double getAverageFeeNativeUnits(){
		return averageFeeNativeUnits;
	}

	public int getTransferCountLast24Hours(){
		return transferCountLast24Hours;
	}

	public double getAverageTransferValueNativeUnits(){
		return averageTransferValueNativeUnits;
	}

	public Object getTxnContractsCountLast24Hours(){
		return txnContractsCountLast24Hours;
	}

	public int getAddressesBalanceGreater1mUsdCount(){
		return addressesBalanceGreater1mUsdCount;
	}

	public double getValueWeightedAverageUtxoAge(){
		return valueWeightedAverageUtxoAge;
	}

	public int getAddressesBalanceGreater1NativeUnitsCount(){
		return addressesBalanceGreater1NativeUnitsCount;
	}

	public int getUtxoInProfitCount(){
		return utxoInProfitCount;
	}

	public Object getAverageTxnGasUsed(){
		return averageTxnGasUsed;
	}

	public double getIssuanceRate(){
		return issuanceRate;
	}

	public int getAddressesBalanceGreater001NativeUnitsCount(){
		return addressesBalanceGreater001NativeUnitsCount;
	}

	public double getAverageBlockInterval(){
		return averageBlockInterval;
	}

	public int getAddressesBalanceGreater10kUsdCount(){
		return addressesBalanceGreater10kUsdCount;
	}

	public int getAddressesBalanceGreater10mUsdCount(){
		return addressesBalanceGreater10mUsdCount;
	}

	public double getTxnPerSecondCount(){
		return txnPerSecondCount;
	}

	public int getAddressesBalanceGreater10kNativeUnitsCount(){
		return addressesBalanceGreater10kNativeUnitsCount;
	}

	public int getAddressesBalanceGreater100UsdCount(){
		return addressesBalanceGreater100UsdCount;
	}

	public double getNewIssuance(){
		return newIssuance;
	}

	public Object getTxnTokenCountLast24Hours(){
		return txnTokenCountLast24Hours;
	}

	public double getAverageBlockWeight(){
		return averageBlockWeight;
	}

	public Object getTxnGasLimitLast24Hours(){
		return txnGasLimitLast24Hours;
	}

	public int getAddressesBalanceGreater10NativeUnitsCount(){
		return addressesBalanceGreater10NativeUnitsCount;
	}

	public Object getAverageBlockGasLimit(){
		return averageBlockGasLimit;
	}

	public Object getTransferErc721CountLast24Hours(){
		return transferErc721CountLast24Hours;
	}

	public int getTxnCountLast24Hours(){
		return txnCountLast24Hours;
	}

	public Object getTxnContractsCallsCountLast24Hours(){
		return txnContractsCallsCountLast24Hours;
	}

	public Object getUncleRewardsLast24HoursUsd(){
		return uncleRewardsLast24HoursUsd;
	}

	public double getIssuanceTotalUsd(){
		return issuanceTotalUsd;
	}

	public Object getUncleRewardsLast24HoursNativeUnits(){
		return uncleRewardsLast24HoursNativeUnits;
	}

	public Object getTxnContractsDestructionCountLast24Hours(){
		return txnContractsDestructionCountLast24Hours;
	}

	public double getTotalFeesLast24Hours(){
		return totalFeesLast24Hours;
	}

	public double getAdjustedTxnVolumeLast24HoursNativeUnits(){
		return adjustedTxnVolumeLast24HoursNativeUnits;
	}

	public int getActiveAddressesReceivedCount(){
		return activeAddressesReceivedCount;
	}

	public int getAddressesBalanceGreater1UsdCount(){
		return addressesBalanceGreater1UsdCount;
	}

	public double getMedianFeeNativeUnits(){
		return medianFeeNativeUnits;
	}

	public int getAddressesCount(){
		return addressesCount;
	}

	public int getBlockWeight(){
		return blockWeight;
	}

	public Object getTxnGasUsedLast24Hours(){
		return txnGasUsedLast24Hours;
	}

	public Object getTxnContractsCallsSuccessCountLast24Hours(){
		return txnContractsCallsSuccessCountLast24Hours;
	}

	public int getUtxoInLossCount(){
		return utxoInLossCount;
	}

	public Object getAverageTxnGasLimit(){
		return averageTxnGasLimit;
	}

	public double getAverageUtxoAge(){
		return averageUtxoAge;
	}

	public double getMedianTransferValueNativeUnits(){
		return medianTransferValueNativeUnits;
	}

	public int getAddressesBalanceGreater1kUsdCount(){
		return addressesBalanceGreater1kUsdCount;
	}

	public int getAddressesBalanceGreater01NativeUnitsCount(){
		return addressesBalanceGreater01NativeUnitsCount;
	}

	public double getAdjustedRvt90dMovingAverage(){
		return adjustedRvt90dMovingAverage;
	}

	public Object getTxnContractsCreationCountLast24Hours(){
		return txnContractsCreationCountLast24Hours;
	}

	public int getActiveAddressesSentCount(){
		return activeAddressesSentCount;
	}

	public double getIssuanceRateDaily(){
		return issuanceRateDaily;
	}

	public int getAddressesBalanceGreater0001NativeUnitsCount(){
		return addressesBalanceGreater0001NativeUnitsCount;
	}

	public int getAddressesBalanceGreater100kUsdCount(){
		return addressesBalanceGreater100kUsdCount;
	}

	public Object getUncleBlocksCountLast24Hours(){
		return uncleBlocksCountLast24Hours;
	}

	public double getMedianTransferValueUsd(){
		return medianTransferValueUsd;
	}

	public double getAverageFeeUsd(){
		return averageFeeUsd;
	}

	public double getIssuanceTotalNativeUnits(){
		return issuanceTotalNativeUnits;
	}

	public double getIssuanceLast24HoursNativeUnits(){
		return issuanceLast24HoursNativeUnits;
	}

	public Object getTransferErc20CountLast24Hours(){
		return transferErc20CountLast24Hours;
	}

	public double getAdjustedTxnVolumeLast24HoursUsd(){
		return adjustedTxnVolumeLast24HoursUsd;
	}

	public int getActiveAddresses(){
		return activeAddresses;
	}

	public int getUtxoCountLast24Hours(){
		return utxoCountLast24Hours;
	}

	public int getMedianUtxoAge(){
		return medianUtxoAge;
	}

	public int getBlocksAddedLast24Hours(){
		return blocksAddedLast24Hours;
	}

	public double getMedianFeeUsd(){
		return medianFeeUsd;
	}

	public int getAddressesBalanceGreater100NativeUnitsCount(){
		return addressesBalanceGreater100NativeUnitsCount;
	}

	public Object getMiningRevenueFromUncleBlocksPercentLast24Hours(){
		return miningRevenueFromUncleBlocksPercentLast24Hours;
	}

	public double getTxnVolumeLast24HoursNativeUnits(){
		return txnVolumeLast24HoursNativeUnits;
	}

	public int getAddressesBalanceGreater1mNativeUnitsCount(){
		return addressesBalanceGreater1mNativeUnitsCount;
	}

	public int getBlockSizeBytesTotal(){
		return blockSizeBytesTotal;
	}

	public int getAddressesBalanceGreater100kNativeUnitsCount(){
		return addressesBalanceGreater100kNativeUnitsCount;
	}

	public int getAddressesBalanceGreater1kNativeUnitsCount(){
		return addressesBalanceGreater1kNativeUnitsCount;
	}

	public double getBlockSizeBytesAverage(){
		return blockSizeBytesAverage;
	}

	public double getTotalFeesLast24HoursUsd(){
		return totalFeesLast24HoursUsd;
	}

	public double getTxnVolumeLast24HoursUsd(){
		return txnVolumeLast24HoursUsd;
	}
}