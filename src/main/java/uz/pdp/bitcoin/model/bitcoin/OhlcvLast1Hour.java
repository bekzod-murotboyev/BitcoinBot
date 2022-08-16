package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OhlcvLast1Hour{

	@JsonProperty("volume")
	private double volume;

	@JsonProperty("high")
	private double high;

	@JsonProperty("low")
	private double low;

	@JsonProperty("close")
	private double close;

	@JsonProperty("open")
	private double open;

	public double getVolume(){
		return volume;
	}

	public double getHigh(){
		return high;
	}

	public double getLow(){
		return low;
	}

	public double getClose(){
		return close;
	}

	public double getOpen(){
		return open;
	}
}