package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("status")
	private Status status;

	public Data getData(){
		return data;
	}

	public Status getStatus(){
		return status;
	}
}