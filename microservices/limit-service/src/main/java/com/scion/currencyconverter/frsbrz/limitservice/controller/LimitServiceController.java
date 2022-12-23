package com.scion.currencyconverter.frsbrz.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scion.currencyconverter.frsbrz.limitservice.model.LimitServiceConfiguration;

@RestController
public class LimitServiceController 
{
	@GetMapping("limit-service")
	public LimitServiceConfiguration RetrieveLimitControllerConfiguration()
	{
		return new LimitServiceConfiguration(1,999);
	}
}
