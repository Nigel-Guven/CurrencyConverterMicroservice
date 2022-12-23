package com.scion.currencyconverter.frsbrz.limitservice.model;

public class LimitServiceConfiguration 
{
	private int minimumLimit;
	private int maximumLimit;
	
	public LimitServiceConfiguration(){}
	
	public LimitServiceConfiguration(int minimum, int maximum)
	{
		super();
		this.minimumLimit = minimum;
		this.maximumLimit = maximum;
	}
	
	public int getMinimumLimit() 
	{
		return minimumLimit;
	}

	public void setMinimumLimit(int minimum) 
	{
		minimumLimit = minimum;
	}

	public int getMaximumLimit() 
	{
		return maximumLimit;
	}

	public void setMaximumLimit(int maximum) 
	{
		maximumLimit = maximum;
	}
}
