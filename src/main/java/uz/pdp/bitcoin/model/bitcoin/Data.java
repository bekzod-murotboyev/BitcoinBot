package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("marketcap")
	private Marketcap marketcap;

	@JsonProperty("supply_activity")
	private SupplyActivity supplyActivity;

	@JsonProperty("all_time_high")
	private AllTimeHigh allTimeHigh;

	@JsonProperty("supply")
	private Supply supply;

	@JsonProperty("roi_data")
	private RoiData roiData;

	@JsonProperty("cycle_low")
	private CycleLow cycleLow;

	@JsonProperty("alert_messages")
	private Object alertMessages;

	@JsonProperty("roi_by_year")
	private RoiByYear roiByYear;

	@JsonProperty("token_sale_stats")
	private TokenSaleStats tokenSaleStats;

	@JsonProperty("serial_id")
	private int serialId;

	@JsonProperty("reddit")
	private Reddit reddit;

	@JsonProperty("misc_data")
	private MiscData miscData;

	@JsonProperty("risk_metrics")
	private RiskMetrics riskMetrics;

	@JsonProperty("id")
	private String id;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("on_chain_data")
	private OnChainData onChainData;

	@JsonProperty("developer_activity")
	private DeveloperActivity developerActivity;

	@JsonProperty("_internal_temp_agora_id")
	private String internalTempAgoraId;

	@JsonProperty("mining_stats")
	private MiningStats miningStats;

	@JsonProperty("market_data")
	private MarketData marketData;

	@JsonProperty("supply_distribution")
	private SupplyDistribution supplyDistribution;

	@JsonProperty("exchange_flows")
	private ExchangeFlows exchangeFlows;

	@JsonProperty("miner_flows")
	private MinerFlows minerFlows;

	@JsonProperty("name")
	private String name;

	@JsonProperty("blockchain_stats_24_hours")
	private BlockchainStats24Hours blockchainStats24Hours;

	@JsonProperty("contract_addresses")
	private Object contractAddresses;

	@JsonProperty("market_data_liquidity")
	private MarketDataLiquidity marketDataLiquidity;

	public String getSymbol(){
		return symbol;
	}

	public Marketcap getMarketcap(){
		return marketcap;
	}

	public SupplyActivity getSupplyActivity(){
		return supplyActivity;
	}

	public AllTimeHigh getAllTimeHigh(){
		return allTimeHigh;
	}

	public Supply getSupply(){
		return supply;
	}

	public RoiData getRoiData(){
		return roiData;
	}

	public CycleLow getCycleLow(){
		return cycleLow;
	}

	public Object getAlertMessages(){
		return alertMessages;
	}

	public RoiByYear getRoiByYear(){
		return roiByYear;
	}

	public TokenSaleStats getTokenSaleStats(){
		return tokenSaleStats;
	}

	public int getSerialId(){
		return serialId;
	}

	public Reddit getReddit(){
		return reddit;
	}

	public MiscData getMiscData(){
		return miscData;
	}

	public RiskMetrics getRiskMetrics(){
		return riskMetrics;
	}

	public String getId(){
		return id;
	}

	public String getSlug(){
		return slug;
	}

	public OnChainData getOnChainData(){
		return onChainData;
	}

	public DeveloperActivity getDeveloperActivity(){
		return developerActivity;
	}

	public String getInternalTempAgoraId(){
		return internalTempAgoraId;
	}

	public MiningStats getMiningStats(){
		return miningStats;
	}

	public MarketData getMarketData(){
		return marketData;
	}

	public SupplyDistribution getSupplyDistribution(){
		return supplyDistribution;
	}

	public ExchangeFlows getExchangeFlows(){
		return exchangeFlows;
	}

	public MinerFlows getMinerFlows(){
		return minerFlows;
	}

	public String getName(){
		return name;
	}

	public BlockchainStats24Hours getBlockchainStats24Hours(){
		return blockchainStats24Hours;
	}

	public Object getContractAddresses(){
		return contractAddresses;
	}

	public MarketDataLiquidity getMarketDataLiquidity(){
		return marketDataLiquidity;
	}
}