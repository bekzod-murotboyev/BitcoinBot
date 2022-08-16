package uz.pdp.bitcoin.model.bank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankItem{

	@JsonProperty("CcyNm_EN")
	private String ccyNmEN;

	@JsonProperty("CcyNm_UZC")
	private String ccyNmUZC;

	@JsonProperty("Diff")
	private String diff;

	@JsonProperty("Rate")
	private Double rate;

	@JsonProperty("Ccy")
	private String ccy;

	@JsonProperty("CcyNm_RU")
	private String ccyNmRU;

	@JsonProperty("id")
	private int id;

	@JsonProperty("CcyNm_UZ")
	private String ccyNmUZ;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("Nominal")
	private String nominal;

	@JsonProperty("Date")
	private String date;

	public String getCcyNmEN(){
		return ccyNmEN;
	}

	public String getCcyNmUZC(){
		return ccyNmUZC;
	}

	public String getDiff(){
		return diff;
	}

	public Double getRate(){
		return rate;
	}

	public String getCcy(){
		return ccy;
	}

	public String getCcyNmRU(){
		return ccyNmRU;
	}

	public int getId(){
		return id;
	}

	public String getCcyNmUZ(){
		return ccyNmUZ;
	}

	public String getCode(){
		return code;
	}

	public String getNominal(){
		return nominal;
	}

	public String getDate(){
		return date;
	}
}