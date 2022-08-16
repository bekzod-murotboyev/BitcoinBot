package uz.pdp.bitcoin.model.bitcoin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reddit{

	@JsonProperty("active_user_count")
	private int activeUserCount;

	@JsonProperty("subscribers")
	private int subscribers;

	public int getActiveUserCount(){
		return activeUserCount;
	}

	public int getSubscribers(){
		return subscribers;
	}
}