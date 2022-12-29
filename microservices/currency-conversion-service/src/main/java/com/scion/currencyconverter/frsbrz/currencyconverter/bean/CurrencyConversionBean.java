package com.scion.currencyconverter.frsbrz.currencyconverter.bean;

import java.math.BigDecimal;


public class CurrencyConversionBean 
{	
	private int id;
	private String exchangeFromCurrency;
	private String exchangeToCurrency;	
	private BigDecimal exchangeRate;
	private BigDecimal quantity;
	private BigDecimal totalCalculableAmount;
	private int port;
	
	public CurrencyConversionBean() {}
	
	public CurrencyConversionBean(int id, String exchangeFromCurrency, String exchangeToCurrency,
			BigDecimal exchangeRate, BigDecimal quantity, BigDecimal totalCalculableAmount, int port) 
	{
		super();
		this.id = id;
		this.exchangeFromCurrency = exchangeFromCurrency;
		this.exchangeToCurrency = exchangeToCurrency;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.totalCalculableAmount = totalCalculableAmount;
		this.port = port;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getExchangeFromCurrency() 
	{
		return exchangeFromCurrency;
	}
	
	public void setExchangeFromCurrency(String exchangeFromCurrency) 
	{
		this.exchangeFromCurrency = exchangeFromCurrency;
	}
	
	public String getExchangeToCurrency() 
	{
		return exchangeToCurrency;
	}
	
	public void setExchangeToCurrency(String exchangeToCurrency) 
	{
		this.exchangeToCurrency = exchangeToCurrency;
	}
	
	public BigDecimal getExchangeRate() 
	{
		return exchangeRate;
	}
	
	public void setExchangeRate(BigDecimal exchangeRate) 
	{
		this.exchangeRate = exchangeRate;
	}
	
	public BigDecimal getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(BigDecimal quantity) 
	{
		this.quantity = quantity;
	}
	
	public BigDecimal getTotalCalculableAmount() 
	{
		return totalCalculableAmount;
	}
	
	public void setTotalCalculableAmount(BigDecimal totalCalculableAmount) 
	{
		this.totalCalculableAmount = totalCalculableAmount;
	}
	
	public int getPort() 
	{
		return port;
	}
	
	public void setPort(int port) 
	{
		this.port = port;
	}
}
