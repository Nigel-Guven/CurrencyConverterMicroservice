package com.scion.currencyconverter.frsbrz.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scion.currencyconverter.frsbrz.limitservice.configuration.LimitServiceConfigurationProperties;
import com.scion.currencyconverter.frsbrz.limitservice.model.LimitServiceConfiguration;

@RestController
public class LimitServiceController 
{
	@Autowired
	private LimitServiceConfigurationProperties LimitServiceConfigurationProperties;
	
	@GetMapping("limit-service")
	public LimitServiceConfiguration RetrieveLimitControllerConfiguration()
	{
		
		
		return new LimitServiceConfiguration(LimitServiceConfigurationProperties.getMinimumProperty(),LimitServiceConfigurationProperties.getMaximumProperty());
	}
}
