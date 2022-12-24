package com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.entity.CurrencyExchangeRate;

@RestController
public class CurrencyExchangeController 
{
	@Autowired
	Environment environment;
	
	@GetMapping("/currency-service/from/{from}/to/{to}")
	public CurrencyExchangeRate GetCurrencyExchangeRate(@PathVariable String from, @PathVariable  String to)
	{
		CurrencyExchangeRate currencyExchangeRate = new CurrencyExchangeRate(1001, from, to, BigDecimal.valueOf(73.0));
		currencyExchangeRate.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return currencyExchangeRate;
	}

}
