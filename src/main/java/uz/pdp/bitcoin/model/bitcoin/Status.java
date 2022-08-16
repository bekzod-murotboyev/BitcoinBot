package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Status{

	@JsonProperty("elapsed")
	private int elapsed;

	@JsonProperty("timestamp")
	private String timestamp;

	public int getElapsed(){
		return elapsed;
	}

	public String getTimestamp(){
		return timestamp;
	}
}