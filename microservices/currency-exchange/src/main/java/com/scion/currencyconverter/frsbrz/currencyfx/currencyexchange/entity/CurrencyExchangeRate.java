package com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.entity;

import java.math.BigDecimal;

public class CurrencyExchangeRate
{
	private int id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal exchangeRate;
	
	private int port;
	
	public CurrencyExchangeRate() {}
	
	public CurrencyExchangeRate(int id, String from, String to, BigDecimal exchangeRate) 
	{
		super();
		this.id = id;
		this.fromCurrency = from;
		this.toCurrency = to;
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
		return fromCurrency;
	}

	public void setFrom(String from) 
	{
		this.fromCurrency = from;
	}

	public String getTo() 
	{
		return toCurrency;
	}

	public void setTo(String to) 
	{
		this.toCurrency = to;
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
