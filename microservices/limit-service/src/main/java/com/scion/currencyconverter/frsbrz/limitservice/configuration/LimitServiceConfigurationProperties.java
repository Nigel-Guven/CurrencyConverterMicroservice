package com.scion.currencyconverter.frsbrz.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-service")
@Component
public class LimitServiceConfigurationProperties 
{
	private int minimumProperty;
	private int maximumProperty;
	
	protected LimitServiceConfigurationProperties() {}
	
	public LimitServiceConfigurationProperties(int minimum, int maximum)
	{
		super();
		this.setMinimumProperty(minimum);
		this.setMaximumProperty(maximum);
	}

	public int getMinimumProperty() 
	{
		return minimumProperty;
	}

	public void setMinimumProperty(int minimumLimitProperty) 
	{
		minimumProperty = minimumLimitProperty;
	}

	public int getMaximumProperty() 
	{
		return maximumProperty;
	}

	public void setMaximumProperty(int maximumLimitProperty) 
	{
		maximumProperty = maximumLimitProperty;
	}
}
