package uz.pdp.bitcoin.model.bitcoin;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DeveloperActivity{

	@JsonProperty("lines_added_last_1_year")
	private Object linesAddedLast1Year;

	@JsonProperty("commits_last_1_year")
	private Object commitsLast1Year;

	@JsonProperty("lines_added_last_3_months")
	private Object linesAddedLast3Months;

	@JsonProperty("lines_deleted_last_1_year")
	private Object linesDeletedLast1Year;

	@JsonProperty("watchers")
	private int watchers;

	@JsonProperty("stars")
	private int stars;

	@JsonProperty("lines_deleted_last_3_months")
	private Object linesDeletedLast3Months;

	@JsonProperty("commits_last_3_months")
	private Object commitsLast3Months;

	public Object getLinesAddedLast1Year(){
		return linesAddedLast1Year;
	}

	public Object getCommitsLast1Year(){
		return commitsLast1Year;
	}

	public Object getLinesAddedLast3Months(){
		return linesAddedLast3Months;
	}

	public Object getLinesDeletedLast1Year(){
		return linesDeletedLast1Year;
	}

	public int getWatchers(){
		return watchers;
	}

	public int getStars(){
		return stars;
	}

	public Object getLinesDeletedLast3Months(){
		return linesDeletedLast3Months;
	}

	public Object getCommitsLast3Months(){
		return commitsLast3Months;
	}
}