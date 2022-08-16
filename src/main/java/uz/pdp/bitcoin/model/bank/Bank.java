package uz.pdp.bitcoin.model.bank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bank{

	@JsonProperty("Bank")
	private BankItem[] bank;

	public BankItem[] getBank(){
		return bank;
	}
}