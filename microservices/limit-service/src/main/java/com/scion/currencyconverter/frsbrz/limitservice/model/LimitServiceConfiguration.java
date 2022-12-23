package com.scion.currencyconverter.frsbrz.limitservice.model;

public class LimitServiceConfiguration 
{
	private int MinimumLimit;
	private int MaximumLimit;
	
	public LimitServiceConfiguration(){}
	
	public LimitServiceConfiguration(int minimum, int maximum)
	{
		super();
		this.MinimumLimit = minimum;
		this.MaximumLimit = maximum;
	}
	
	public int getMinimumLimit() 
	{
		return MinimumLimit;
	}

	public void setMinimumLimit(int minimumLimit) 
	{
		MinimumLimit = minimumLimit;
	}

	public int getMaximumLimit() 
	{
		return MaximumLimit;
	}

	public void setMaximumLimit(int maximumLimit) 
	{
		MaximumLimit = maximumLimit;
	}
}
