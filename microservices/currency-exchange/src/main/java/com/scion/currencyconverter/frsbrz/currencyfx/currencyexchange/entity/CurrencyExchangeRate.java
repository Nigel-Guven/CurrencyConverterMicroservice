package com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchangeRate
{
	@Id
	private int id;
	
	@Column(name="exchangeFromCurrency")
	private String exchangeFromCurrency;
	@Column(name="exchangeToCurrency")
	private String exchangeToCurrency;
	
	private BigDecimal exchangeRate;
	
	private int port;
	
	public CurrencyExchangeRate() {}
	
	public CurrencyExchangeRate(int id, String from, String to, BigDecimal exchangeRate) 
	{
		super();
		this.id = id;
		this.exchangeFromCurrency = from;
		this.exchangeToCurrency = to;
		this.exchangeRate = exchangeRate;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getFrom() 
	{
		return exchangeFromCurrency;
	}

	public void setFrom(String from) 
	{
		this.exchangeFromCurrency = from;
	}

	public String getTo() 
	{
		return exchangeToCurrency;
	}

	public void setTo(String to) 
	{
		this.exchangeToCurrency = to;
	}

	public BigDecimal getExchangeRate() 
	{
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) 
	{
		this.exchangeRate = exchangeRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
